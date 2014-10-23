package com.cpp2.factory;

/**
 * DAO������
 * @author Rose
 */
public class DAOFactory
{
	private static DAOFactory factory = new DAOFactory();
	
	/* ��Ĭ�Ϲ�����˽�� */
	private DAOFactory()
	{}
	
	/**
	 * ���ر������
	 * @return
	 */
	public static DAOFactory getInstance()
	{
		return factory;
	}
	
	/**
	 * ���ݷ��Ͳ���,����DAO����
	 * @param className
	 * @param clazz
	 * @return
	 */
	public static <T> T createDAO(String className, Class<T> clazz)
	{
		try
		{
			T t = (T) Class.forName(className).newInstance();
			return t;
		} catch (Exception e)
		{
			throw new RuntimeException(e);
		}
	}
}
