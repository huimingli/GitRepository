package com.cpp2.dao;

import com.cpp2.domain.Admin;

public interface AdminDAO
{

	/**
	 * �����ʺ����������ݿ��в����Ƿ���ڹ���Ա
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception
	 */
	Admin find(String username, String password);

}