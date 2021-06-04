package com.arthuramorim.n3prog.database;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.arthuramorim.n3prog.database.JpaUtils;

@WebFilter(servletNames = "Faces Servlet")
public class JpaFilter implements Filter {

	@Override
	public void destroy() {
		JpaUtils.destroy();

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		EntityManager entityManager = JpaUtils.EntityManager(request);
		entityManager.getTransaction().begin();
		filterChain.doFilter(request, response);
		entityManager.getTransaction().commit();
		entityManager.close();

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		JpaUtils.init();
	}

}
