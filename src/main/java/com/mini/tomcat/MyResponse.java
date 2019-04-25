package com.mini.tomcat;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @program: tomcat
 * @description
 * @author: weis
 * @create: 2019-04-25 18:05
 **/
public class MyResponse {
    private OutputStream outputStream;

    public MyResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    public void write(String content)throws IOException{
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-type: text/html\n")
                .append("\r\n")
                .append("<html><body")
                .append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();

    }



}
