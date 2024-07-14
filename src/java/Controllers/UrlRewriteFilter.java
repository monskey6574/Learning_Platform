/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Janu
 */


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UrlRewriteFilter implements Filter {

    private Map<String, String> urlMappings;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        urlMappings = new HashMap<String, String>();
        urlMappings.put("/home", "/Home.html");
        urlMappings.put("/about", "/About.html");
        urlMappings.put("/contact", "/Contact.html");
        // Add more mappings as needed
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        String uri = httpRequest.getRequestURI();

        if (urlMappings.containsKey(uri)) {
            httpRequest.getRequestDispatcher(urlMappings.get(uri)).forward(httpRequest, httpResponse);
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        // Cleanup code if needed
    }
}
