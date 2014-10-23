package com.cpp2.manager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �������Ա�˳�ϵͳ
 * @author Rose
 */
public class LogoutServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		/* �Ƴ�Session��admin��־ */
		request.getSession().removeAttribute("admin");
	/*	 �˳�֮��ҳ����ת����½ҳ�� 
		request.getRequestDispatcher("/manager/login.jsp").forward(request, response);*/
		
		/* �ض��� */
//		response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY); 						// ����״̬��Ϊ302
//		response.setHeader("Location", "http://localhost:8080/Cinema/manager/login.jsp");
//		response.sendRedirect(request.getContextPath() + "/manager/login.jsp");
		
		/* �Զ�ˢ�� */
		response.setHeader("Refresh", "1000;URL=http://localhost:8080/Cinema/manager/login.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
	}

}
