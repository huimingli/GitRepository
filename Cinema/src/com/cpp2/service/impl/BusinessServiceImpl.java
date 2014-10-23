package com.cpp2.service.impl;

import com.cpp2.dao.AdminDAO;
import com.cpp2.domain.Admin;
import com.cpp2.factory.DAOFactory;

/**
 * ҵ���߼�������
 */
public class BusinessServiceImpl
{
	/* ʹ�ù���������DAO���� */
	private AdminDAO aDAO = DAOFactory.getInstance().createDAO("com.cpp2.dao.impl.AdminDAOImpl", AdminDAO.class);
	
	/**
	 * ��̨��½����,������ݿ��Ƿ���ڸù���Ա
	 * @param admin
	 * @throws Exception
	 */
	public Admin adminLogin(String username, String password) throws Exception
	{
		return aDAO.find(username, password);
	}
}
