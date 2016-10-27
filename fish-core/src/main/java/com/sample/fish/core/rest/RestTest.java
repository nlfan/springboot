package com.sample.fish.core.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sample.fish.core.config.DBConfig;
import com.sample.fish.core.util.HttpApi;

@Controller
@EnableAutoConfiguration
public class RestTest {
	
	@Autowired
	HttpApi httpApi;
	
	@Autowired
	DBConfig dbConfig;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	@ResponseBody
	String sayHello(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("say", httpApi.getContent());
		map.put("dbName", dbConfig.getName());
		map.put("password", dbConfig.getPassword());
		
		return new Gson().toJson(map);
	}

}
