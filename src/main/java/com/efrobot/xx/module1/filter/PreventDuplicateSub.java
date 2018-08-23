package com.efrobot.xx.module1.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class PreventDuplicateSub
 */
@WebFilter("/v1/*")
public class PreventDuplicateSub implements Filter {

	/**
	 * Default constructor. 
	 */
	public PreventDuplicateSub() {
	}

	public void destroy() {
		System.out.println("================过滤器停止");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		String servletPath = req.getServletPath();
		System.out.println("==================");
		if (servletPath.endsWith(".jsp")) {
			System.out.println("jsp页面,存入session标记");
			req.getSession().setAttribute("formCanSubmit", true);
		} else {
			System.out.println("表单请求");

		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=================初始化");
	}

}
