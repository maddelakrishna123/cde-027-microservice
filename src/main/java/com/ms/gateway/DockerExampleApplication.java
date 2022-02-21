package com.ms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/docker")
public class DockerExampleApplication {
	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome to docker images example";
	}
@PostMapping("/welcome")
	public String welcome(@RequestParam("uname") String uname)
	{
		return "Welcome "+uname;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DockerExampleApplication.class, args);
	}
	@GetMapping(value="userDetails")
	public String getUserDetails()
	{
		return "User Details";
	}

}
// http://hostname:portnumber/docker/hello
// http://hostname:portnumber/ -get
