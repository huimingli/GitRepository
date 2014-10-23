package com.cpp2.exception;

public class DBNotFoundException extends RuntimeException
{

	public DBNotFoundException()
	{
	}

	public DBNotFoundException(String message)
	{
		super(message);
	}

	public DBNotFoundException(Throwable cause)
	{
		super(cause);
	}

	public DBNotFoundException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public DBNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
