package com.cpp2.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * C3P0���ݿ����ӳع�����(�������ģʽ)
 * @author Rose
 */
public class JDBCUtils
{
	private static ComboPooledDataSource cpds = null;
	
	static
	{
		cpds = new ComboPooledDataSource("cpp2");
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws SQLException
	 */
	public static Connection getConnection() throws SQLException
	{
		return cpds.getConnection();
	}
	
	/**
	 * ��ȡ���ӳ���Դ
	 * @return
	 */
	public static DataSource getDataSource()
	{
		return cpds;
	}
}
