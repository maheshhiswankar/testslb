package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/test")
	public String test() {
		jdbcTemplate.execute("Select * from testtable");
		
		return "Hello!!!";
	}
}
