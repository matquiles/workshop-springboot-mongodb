package com.matquiles.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matquiles.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Brown", "mariagmail.com");
		User alex = new User("2", "Alex Green", "alexgmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		
		return ResponseEntity.ok().body(list);
		
	}
}