package com.mini.tomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: tomcat
 * @description
 * @author: weis
 * @create: 2019-04-25 18:36
 **/
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList = new ArrayList();

    static {
        servletMappingList.add(new ServletMapping("test","/test","com.mini.tomcat.TestServlet"));
    }

}
