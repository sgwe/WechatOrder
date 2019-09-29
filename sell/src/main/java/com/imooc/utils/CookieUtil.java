package com.imooc.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yangxi
 * @Date 2019/9/2 16:33
 * cookie工具类
 */
public class CookieUtil {

    /**
     *功能描述
     * 设置cookie
     * @param response
     * @param name
     * @param value
     * @param maxAge
     * @return void
     */
    public static void set(HttpServletResponse response, String name, String value, int maxAge) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    /**
     *功能描述
     * 获取cookie
     * @param request
     * @param name
     * @return javax.servlet.http.Cookie
     */
    public static Cookie get(HttpServletRequest request, String name) {

        Map<String, Cookie> cookieMap = readCookieMap(request);
        if (cookieMap.containsKey(name)) {
            return cookieMap.get(name);
        }else {
            return null;
        }
    }

    /**
     *功能描述
     * 将cookie封装成map
     * @param request
     * @return java.util.Map<java.lang.String,javax.servlet.http.Cookie>
     */
    private static Map<String, Cookie> readCookieMap(HttpServletRequest request) {
        Map<String, Cookie> cookieMap = new HashMap<>();
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie);
            }
        }
        return cookieMap;
    }
}
