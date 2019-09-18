package com.rms.rentsystem.controler;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rms.rentsystem.dto.User;

public class TestJsonRead {

	
	public static void main(String[] args) {

	//	ObjectMapper mapper = new ObjectMapper();

	//	try {

			// Convert JSON string from file to Object
			//User user = mapper.readValue(new File("src/main/resources/a.json"), User.class);
			//System.out.println(user);

			// Convert JSON string to Object
//			String jsonInString = "{\"age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\"}";
//			User user1 = mapper.readValue(jsonInString, User.class);
//			System.out.println(user1);
			Map m = new HashMap<String,String>();
			m.put("a", "A");
			m.put("b", "B");
			m.put("c", "C");
			
			Map m1 = new HashMap<String,String>();
			
			m.forEach((k,v)->m1.put(k, v));
		//	System.out.println(m1);
			
			
			Set<Map.Entry<String,String>> e=m1.entrySet();
		//	System.out.println(e);
			
		System.out.println(m1.keySet()+"------>"+m1.values());
			
	
	
	
	}}
			
			
			
			
				
			
			

	//	} catch (JsonGenerationException e) {
		//	e.printStackTrace();
	//	} catch (JsonMappingException e) {
		//	e.printStackTrace();
	//	} catch (IOException e) {
	//		e.printStackTrace();
	//	}

	//}
	
	
	

