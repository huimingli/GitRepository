package com.cpp2.domain;

/**
 * 用户实体
 * @author Rose
 */
public class User
{
	private int user_id;
	private String username;
	private String phone;
	private String gender;
	private String vip;
	
	public int getUser_id()
	{
		return user_id;
	}
	public void setUser_id(int user_id)
	{
		this.user_id = user_id;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPhone()
	{
		return phone;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	public String getVip()
	{
		return vip;
	}
	public void setVip(String vip)
	{
		this.vip = vip;
	}
}
