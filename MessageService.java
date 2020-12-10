package com.example.Message.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Message.Model.Message;


@Service
public class MessageService 
{
	@Autowired
	private MessageRepo repo;
	
	public List<Message> findAll()
	{
		return (List<Message>)repo.findAll();
	}
	
	public List<Message> findMessagesFor(String receiver)
	{
		return (List<Message>)repo.findByReceiver(receiver);
	}
	
	public void addMessage(Message message)
	{
		repo.save(message);
	}

}
