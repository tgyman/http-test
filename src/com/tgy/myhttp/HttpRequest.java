package com.tgy.myhttp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * HttpRequest
 *
 * @author Jerry Tong
 * @create 2017-11-24 15:27
 * @desc Java模拟http请求
 */
public class HttpRequest {
    /**
     * 向指定URL发送GET方法的请求
     * @param url   发送请求的URL
     * @param param 请求参数应该是 name1=value1&name2=value2的形式
     * @return  url所代表远程资源的响应结果
     */
    public static String sendGet(String url,String param){
        String result="";
        BufferedReader in=null;
        try{
            String urlNameString=url+"?"+param;
            URL realUrl=new URL(urlNameString);
            //打开和url之间的连接
            URLConnection connection=realUrl.openConnection();
            //设置通用的请求属性
            connection.setRequestProperty("accept","*/*");
            connection.setRequestProperty("connection","Keep-Alive");
            connection.setRequestProperty("user-agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            //Accept-Language:zh-CN,zh;q=0.8
            connection.setRequestProperty("Accept-Language","zh-CN,zh;q=0.8");
            //建立实际的连接
            connection.connect();
            //获取所有的响应头字段
            Map<String,List<String>> map=connection.getHeaderFields();
            //定义BufferedReader输入流来读取URL的响应
            in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while((line=in.readLine())!=null){
                result+=line;
            }

        }catch (Exception e){
            System.out.println("发送GET请求出现异常!"+e);
            e.printStackTrace();
        }finally {
            try{
                if(in!=null){
                    in.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return result;
    }
}
