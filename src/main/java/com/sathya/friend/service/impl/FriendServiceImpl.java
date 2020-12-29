package com.sathya.friend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.friend.entity.Friend;
import com.sathya.friend.repository.FriendRepository;
import com.sathya.friend.servicee.IFriendService;

@Service
public class FriendServiceImpl  implements IFriendService{

	 @Autowired
	 private FriendRepository friendRepository;
	
	 
	 
	 @Override
		public Friend saveFriendsList(Friend friend) {
			
           Friend friendsList=friendRepository.save(friend);
			
			return  friendsList;
		}
	 
	 

	/*
	 * @Override public Integer verifyfriendNo(Long phoneNo, Long friendNo) {
	 * 
	 * Integer count=friendRepository.verifyFriendNo(phoneNo, friendNo);
	 * if(count==0) {
	 * 
	 * return 0; }else {
	 * 
	 * return 1; } }
	 */

	 
		@Override
		public List<Friend> findByPhoneNo(Long phoneNo) {
	        
			return  friendRepository.findByPhoneNo(phoneNo) ;
		}
	 
	 
	 
	 
	/*
	 * public String addFriendService(Friend friend ) {
	 * 
	 * if(friendRepository.existsByFriendsNo(friend.getFriendNo())) {
	 * 
	 * System.out.println(" exists");
	 * 
	 * return "already exists"; }else {
	 * 
	 * return ""; } }
	 */
	
}
