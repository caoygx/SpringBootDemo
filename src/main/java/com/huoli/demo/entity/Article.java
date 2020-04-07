package com.huoli.demo.entity;

import java.io.Serializable;

public class Article implements Serializable{
	private int id;

	private String title;

	private int status;

	public int getId()
	{
		return id;
	}

	public String getTitle()
	{
		return title;
	}

	public int getStatus()
	{
		return status;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}
}
