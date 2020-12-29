package com.sathya.friend.servicee;

import java.util.List;

import com.sathya.friend.entity.Friend;

public interface IFriendService {

 Friend  saveFriendsList(Friend friend);
  
  //Integer   verifyfriendNo(Long phone ,Long friendNo);
	
  List<Friend>	findByPhoneNo(Long phoneNo);
	
 //String addFriendService(Friend friend );
	
	
	
  
	
}
