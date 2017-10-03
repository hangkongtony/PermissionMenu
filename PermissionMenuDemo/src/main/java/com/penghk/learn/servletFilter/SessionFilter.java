package com.penghk.learn.servletFilter;


import org.apache.commons.lang.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionFilter implements Filter{

    private String sessionKey;
    private Integer accessCount;

    //服务启动时初始化
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        sessionKey = filterConfig.getInitParameter("sessionKey");
        accessCount = 0;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        accessCount++;
//        if(accessCount == 1||accessCount == 2){
//            //初次访问不设置session
//        }else {
//            //之后的访问都判断会话是否到期
//            HttpServletRequest request1 = (HttpServletRequest)request;
//            HttpSession session = request1.getSession();
//            if(StringUtils.isBlank(session.getAttribute("loginUser").toString())){
//                //会话到期
//                request.getRequestDispatcher("/login").forward(request1,response);
//            }
//        }
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
