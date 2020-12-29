package com.sathya.friend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sathya.friend.entity.Friend;

public interface FriendRepository  extends CrudRepository<Friend,	Integer>{
	
	List<Friend> findByPhoneNo(Long phoneNo);
	
/*
	 * @Query(value="select count(*) from friend where phone_no=? and friend_no=?",nativeQuery = true)																																																																																				
	 *  Integer verifyFriendNo(Long phoneNo ,Long friendNo);
	 * 
	 * boolean existsByFriendsNo(Long friendNo);
	 * */
	 
}
