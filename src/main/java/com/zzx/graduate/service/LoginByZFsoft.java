package com.zzx.graduate.service;

import com.zzx.graduate.util.HttpUtil;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public class LoginByZFsoft {

    private static Logger logger = Logger.getLogger(LoginByZFsoft.class.getName());
    private String username, password;

    public LoginByZFsoft(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        try {
            HttpUtil httpUtil = new HttpUtil();
            Document document = httpUtil.getMethod("http://222.24.19.201/default_ysdx.aspx");
            //筛选需要的部分
            Element element = document.getElementById("form1");
            Elements elements = element.select("input");
            String value = elements.attr("value");

            //将发的信息写入post请求中
            List<BasicNameValuePair> pairs = new ArrayList<BasicNameValuePair>();
            pairs.add(new BasicNameValuePair("__VIEWSTATE", value));
            pairs.add(new BasicNameValuePair("TextBox1", username));
            pairs.add(new BasicNameValuePair("TextBox2", password));
            pairs.add(new BasicNameValuePair("RadioButtonList1", "\321\247\311\372"));
            pairs.add(new BasicNameValuePair("Button1", "\265\307\302\274"));
            //发送post请求
            httpUtil.postMethod("http://222.24.19.201/default_ysdx.aspx", pairs);

            document = httpUtil.getMethod("http://222.24.19.201/xs_main.aspx?xh=" + username);
            for ( Element ele : document.select("ul[class=sub]").select("a[href]") ) {
                if ( ele.text().equals("个人信息") ) {
                    httpUtil.getMethod(ele.attr("abs:href"));
                    return true;
                }
            }
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
            return false;
        }
        return false;
    }

}
