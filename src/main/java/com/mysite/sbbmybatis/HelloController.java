package com.mysite.sbbmybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.DTO.MessageDTO;

@Controller
@RequestMapping("/message")
public class HelloController {
	@Autowired
	private HelloService service;
	
	@GetMapping
	@ResponseBody
	public String printMessage() {
		return "Hello World ^^";
	}
	
	@GetMapping("{id}")
	@ResponseBody
	public MessageDTO getBook(@PathVariable("id") int id) {
		return service.getBook(id);
	}
}
