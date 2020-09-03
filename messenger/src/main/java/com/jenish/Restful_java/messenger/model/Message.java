package com.jenish.Restful_java.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
public class Message
{
	private long id;
	private String message;
	private Date created;
	private String author;
	
	
	public Message()
	{
		
	}
	
	public Message(long id, String message, String author)
	{
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	
	
	public long getId()
	{
		return id;
	}
	
	@XmlElement
	public void setId(long id)
	{
		this.id = id;
	}
	public String getMessage()
	{
		return message;
	}
	@XmlElement
	public void setMessage(String message)
	{
		this.message = message;
	}
	public Date getCreated()
	{
		return created;
	}
	@XmlElement
	public void setCreated(Date created)
	{
		this.created = created;
	}
	public String getAuthor()
	{
		return author;
	}
	@XmlElement
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	
	
}
