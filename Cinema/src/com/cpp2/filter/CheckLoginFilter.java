package com.cpp2.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpp2.domain.Admin;

/**
 * ��½��������
 * @author Rose
 */
public class CheckLoginFilter implements Filter
{

	@Override
	public void destroy()
	{
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		/* ����Ƿ��½,��û��½,��ת����½ҳ�� */
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if(null == admin)
		{
			request.setAttribute("messag", "���ȵ�½�ٲ���");
			request.getRequestDispatcher("/manager/login.jsp").forward(request, response);
			return ;
		}
		
		/* ���Ѿ���½ */
		request.removeAttribute("message");
		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException
	{
	}

}
