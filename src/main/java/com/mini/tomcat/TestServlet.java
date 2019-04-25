package com.mini.tomcat;

import java.io.IOException;

/**
 * @program: tomcat
 * @description
 * @author: weis
 * @create: 2019-04-25 18:26
 **/
public class TestServlet extends MyServlet{
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("GET this is a mini cat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("POST this is a mini cat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
