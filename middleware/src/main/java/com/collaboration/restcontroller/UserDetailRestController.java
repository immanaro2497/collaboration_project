package com.collaboration.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collaboration.dao.UserDetailDAO;
import com.collaboration.model.UserDetail;

@RestController
public class UserDetailRestController {

	@Autowired
	UserDetailDAO userDetailDAO;
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<UserDetail>> getUsers() 
	{
		List<UserDetail> listUsers=userDetailDAO.getUsers();
		if(listUsers.size()>0) {
			return new ResponseEntity<List<UserDetail>>(listUsers,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<UserDetail>>(listUsers,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/getUser/{username}")
	public ResponseEntity<UserDetail> getUser(@PathVariable("username") String username)
	{
		UserDetail userDetail=userDetailDAO.getUser(username);
		return new ResponseEntity<UserDetail>(userDetail,HttpStatus.OK);
	}
}
