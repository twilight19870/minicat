package com.mini.tomcat;

/**
 * @program: tomcat
 * @description
 * @author: weis
 * @create: 2019-04-25 18:13
 **/
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest,MyResponse myResponse);
    public abstract void doPost(MyRequest myRequest,MyResponse myResponse);
    public void service(MyRequest myRequest,MyResponse myResponse){
        if(myRequest.getMethod().equalsIgnoreCase("POST")){
            doPost(myRequest,myResponse);
        }else if(myRequest.getMethod().equalsIgnoreCase("GET")){
            doGet(myRequest,myResponse);
        }
    }



}
