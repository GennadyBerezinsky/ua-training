package controller.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by User on 01.12.2018.
 */


public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest req = (HttpServletRequest) servletRequest;
        final HttpServletResponse res = (HttpServletResponse) servletResponse;

        HttpSession session = req.getSession();
        ServletContext context = servletRequest.getServletContext();
        System.out.println(session);
        System.out.println(session.getAttribute("role"));
        System.out.println(context.getAttribute("loggedUsers"));


        filterChain.doFilter(servletRequest,servletResponse);



    }

    @Override
    public void destroy() {

    }
}
