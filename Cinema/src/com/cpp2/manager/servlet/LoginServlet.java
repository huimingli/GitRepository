package com.cpp2.manager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cpp2.domain.Admin;
import com.cpp2.exception.LoginException;
import com.cpp2.service.impl.BusinessServiceImpl;

/**
 * �����½��servlet
 * @author Rose
 */
public class LoginServlet extends HttpServlet
{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		try
		{
			/* 1.��ȡҳ��post���������� */
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			/* 2.ҵ���߼�����,������ݿ��Ƿ���ڸù���Ա*/
			BusinessServiceImpl service = new BusinessServiceImpl();
			Admin admin = service.adminLogin(username, password);
			
			/* 3. ��������ص���½ҳ�� */
			if(null == admin)
			{
				request.setAttribute("message", "�ʺŻ��������");
				System.out.println("��½ʧ��");
				request.getRequestDispatcher("/manager/login.jsp").forward(request, response);
				return ;
			}
			/* 4.����������ת����̨��ҳ */
			System.out.println("��½�ɹ�");
			request.getSession().setAttribute("admin", admin); 							// ��½��־
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			
		} catch (Exception e)
		{
			e.printStackTrace();
			throw new LoginException(e);
		}
		
		
	}

}
