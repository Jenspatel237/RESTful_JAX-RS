package com.jenish.Restful_java.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.tomcat.util.security.MD5Encoder;

import com.jenish.Restful_java.messenger.model.Message;
import com.jenish.Restful_java.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource
{
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessages()
	{
		return messageService.getAllMessages();
	}
	
	@POST
	public Message addmessage(Message message)
	{
		
		return messageService.addMessage(message);
		
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") Long messageId, Message message)
	{
		message.setId(messageId);
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") Long messageId)
	{
		messageService.removeMessage(messageId);
	}
	
	@GET
	@Path("/{messageId}")
	public Message test(@PathParam("messageId") Long messageId)
	{
		return messageService.getMessage(messageId);
	}
	
	
}
