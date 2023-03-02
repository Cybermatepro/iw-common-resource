package com.enwerevincent.invest.utils;

import com.enwerevincent.invest.model.AppUser;

import javax.servlet.http.HttpServletRequest;

public class SiteUtils {


    public static String SITE_URL(HttpServletRequest request){
       String url =  request.getRequestURL().toString();
       return url.replace(request.getServletPath() , "");
    }
}
