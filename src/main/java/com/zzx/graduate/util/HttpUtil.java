package com.zzx.graduate.util;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

/**
 * Created by glacier on 15-5-14.
 */
public class HttpUtil {

    private Logger logger = Logger.getLogger(HttpUtil.class.getName());

    //创建一个client
    private CloseableHttpClient httpClient = HttpClients.createDefault();
    private HttpGet httpGet;
    private HttpPost httpPost;
    private CloseableHttpResponse response;
    private HttpEntity entity;

    public Document getMethod(String url) {
        try {
            httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
            response = httpClient.execute(httpGet);
            entity = response.getEntity();
            Document document = Jsoup.parse(EntityUtils.toString(entity));
            document.setBaseUri(url);
            return document;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

    public Document postMethod(String url, List<BasicNameValuePair> pairs) {
        try {
            httpPost = new HttpPost(url);
            httpPost.setHeader("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36");
            httpPost.setEntity(new UrlEncodedFormEntity(pairs, "UTF-8"));
            response = httpClient.execute(httpPost);
            entity = response.getEntity();
            Document document = Jsoup.parse(EntityUtils.toString(entity));
            document.setBaseUri(url);
            return document;
        }catch (Exception e) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            e.printStackTrace(new PrintStream(baos));
            logger.error(baos.toString());
        }
        return null;
    }

}
