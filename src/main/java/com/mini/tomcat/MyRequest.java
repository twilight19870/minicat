package com.mini.tomcat;

import com.sun.deploy.util.StringUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: tomcat
 * @description
 * @author: weis
 * @create: 2019-04-25 17:53
 **/
public class MyRequest {
    private String url;
    private String method;


    public MyRequest(InputStream inputStream)throws IOException{
        String httpRequest ="";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0 ;
        if((length=inputStream.read(httpRequestBytes))>0){
            httpRequest = new String(httpRequestBytes,0,length);
        }
        String httpHead = httpRequest.split("\n")[0];
        if( null == httpHead || "".equals(httpHead)){
            return;
        }
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);

    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }
}
