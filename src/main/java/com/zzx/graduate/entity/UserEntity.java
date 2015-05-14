package com.zzx.graduate.entity;

import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public class UserEntity {

    private String username, password;

    public UserEntity(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login() {
        try {
            //创建一个client
            CloseableHttpClient httpClient = HttpClients.createDefault();
            //创建GET请求
            HttpGet httpGet = new HttpGet("http://222.24.19.201/default_ysdx.aspx");
            //client执行GET请求
            CloseableHttpResponse response = httpClient.execute(httpGet);
            //得到GET请求的响应
            HttpEntity entity = response.getEntity();

            //找到__VIEWSTATE属性和value
            Document document = Jsoup.parse(EntityUtils.toString(entity));//parse将得到的HTML文件DOM化
            //筛选需要的部分
            Element element = document.getElementById("form1");
            Elements elements = element.select("input");
            String value = elements.attr("value");

            // 设置httpclient属性
            HttpPost httpPost = new HttpPost("http://222.24.19.201/default_ysdx.aspx");
            //设置User-Agent
            httpPost.addHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
            //将发的信息写入post请求中
            List<BasicNameValuePair> pairs = new ArrayList<BasicNameValuePair>();
            pairs.add(new BasicNameValuePair("__VIEWSTATE", value));
            pairs.add(new BasicNameValuePair("TextBox1", "04121110"));
            pairs.add(new BasicNameValuePair("TextBox2", "glacierlx1994"));
            pairs.add(new BasicNameValuePair("RadioButtonList1", "\321\247\311\372"));
            pairs.add(new BasicNameValuePair("Button1", "\265\307\302\274"));
            httpPost.setEntity(new UrlEncodedFormEntity(pairs, "UTF-8"));
            //发送post请求
            httpClient.execute(httpPost);
            //上一步得到的response不是想要的东西
            //现在在发一个get请求试试
            httpGet = new HttpGet("http://222.24.19.201/xs_main.aspx?xh=04121110");
            response = httpClient.execute(httpGet);
            document = Jsoup.parse(EntityUtils.toString(response.getEntity()));
            document.setBaseUri(httpGet.getURI().toURL().toString());
            for ( Element ele : document.select("ul[class=sub]").select("a[href]") ) {
                if ( ele.text().equals("个人信息") ) {
                    httpGet = new HttpGet(ele.attr("abs:href"));
                    response = httpClient.execute(httpGet);
                    document = Jsoup.parse(EntityUtils.toString(response.getEntity()));
                    break;
                }
            }
            //得到用户的基本信息页面
            System.out.println(document);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("04121110", "glacierlx1994");
        userEntity.login();
    }
}
