package com.sathya.friend.contrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.friend.entity.Friend;
import com.sathya.friend.servicee.IFriendService;

@RestController
@RequestMapping("/frienddetails")
public class FriendController {

	@Autowired
	private IFriendService friendSerivce;
	
	
	@PostMapping("/insertfriend")
	public Friend saveFriendsList(@RequestBody Friend friend){
		
		return friendSerivce.saveFriendsList(friend);
	}
	
	
	
	
	@GetMapping("/getbyphoneno/{phoneNo}")
	public List<Friend> findByPhoneNo(@PathVariable  Long phoneNo){
		
		return friendSerivce.findByPhoneNo(phoneNo);
	}
	
}
