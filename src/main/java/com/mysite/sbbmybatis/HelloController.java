package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysite.sbbmybatis.DTO.MessageDTO;

@Controller
@RequestMapping("/message")
public class HelloController {
	@Autowired
	private HelloService service;
	
	@GetMapping
	public String printMessage() {
		return "infoList";
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public MessageDTO getBook(@PathVariable("id") int id) {
		return service.getBook(id);
	}
	
	@GetMapping("/list")
	@ResponseBody
	public List<MessageDTO> getBookList() {
		return service.getBookList();
	}
	
	@GetMapping("/insert")
	public String typeInfo() {
		return "info";
	}
	
	@PostMapping
	@ResponseBody
	public void insertInfo(@RequestBody MessageDTO data) {
		service.insertInfo(data);
	}
	
}
