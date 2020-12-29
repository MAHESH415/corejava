package com.sathya.friend.dto;

public class FriendDto {
   
	
	private Integer Id;
	
    private Long  phoneNo;
    
    private Long friendNo;

	 

	public FriendDto() {
		super();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getFriendNo() {
		return friendNo;
	}

	public void setFriendNo(Long friendNo) {
		this.friendNo = friendNo;
	}

	@Override
	public String toString() {
		return "Friend [Id=" + Id + ", phoneNo=" + phoneNo + ", friendNo=" + friendNo + "]";
	}

}
