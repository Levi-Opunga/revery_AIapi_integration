package com.example.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.logging.Logger;

public class SimpleInterceptor implements HandlerInterceptor {
    private static final Logger logger = Logger.
            getLogger(String.valueOf(SimpleInterceptor.class));

    public boolean preHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler) throws Exception {
        logger.info("Inside the Simple interceptor");
        return false;
    }
}
