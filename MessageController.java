package com.example.Message.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Message.Model.Message;
import com.example.Message.dao.MessageService;

@RequestMapping("/message")
@RestController
public class MessageController 
{
	@Autowired
	MessageService service;
	
	@GetMapping
	public List<Message> getMessage(@RequestParam String receiver)
	{
		return service.findMessagesFor(receiver);
	}
	
	@PostMapping
	public void addMessage(@RequestBody Message message)
	{
		service.addMessage(message);
	}
}
