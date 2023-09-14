package com.works.configs;

import com.works.entities.Customer;
import com.works.entities.Info;
import com.works.repositories.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Configuration
@RequiredArgsConstructor
public class FilterConfig implements Filter {

    final InfoRepository infoRepository;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;
        String email = "";

        String url = req.getRequestURI();
        String[] freeUrls = {"/customer/login", "/customer/register"};
        boolean loginStatus = true;
        for ( String item : freeUrls ) {
            if ( url.equals(item) ) {
                loginStatus = false;
                break;
            }
        }

        if(loginStatus) {
            // Session Control
            boolean status = req.getSession().getAttribute("user") == null;
            if ( status ) {
                // Login Fail
                PrintWriter printWriter = res.getWriter();
                String message = "{ \"status\": false, \"error\": \"Plase Login!\" }";
                printWriter.print(message);
                res.setContentType("application/json");
                res.setStatus(HttpStatus.UNAUTHORIZED.value());
            }else {
                Customer customer = (Customer) req.getSession().getAttribute("user");
                email = customer.getEmail();
                filterChain.doFilter(req, res);
            }
        }else {
            filterChain.doFilter(req, res);
        }

        String sessionID = req.getSession().getId();
        String ip = req.getRemoteAddr();
        String agent = req.getHeader("user-agent");
        String time = ""+System.currentTimeMillis();
        Info i = new Info(url,sessionID,email,ip,agent,time);
        infoRepository.save(i);

    }

}
