package com.cpp2.service.impl;

import com.cpp2.dao.AdminDAO;
import com.cpp2.domain.Admin;
import com.cpp2.factory.DAOFactory;

/**
 * 业务逻辑处理类
 */
public class BusinessServiceImpl
{
	/* 使用工厂类生成DAO对象 */
	private AdminDAO aDAO = DAOFactory.getInstance().createDAO("com.cpp2.dao.impl.AdminDAOImpl", AdminDAO.class);
	
	/**
	 * 后台登陆处理,检查数据库是否存在该管理员
	 * @param admin
	 * @throws Exception
	 */
	public Admin adminLogin(String username, String password) throws Exception
	{
		return aDAO.find(username, password);
	}
}
