package com.xworkz.nataraj.dto;

import lombok.Data;

@Data
public class ChatDTO {
	
	private String name;
	private String contactname;
	private long contactNo;
	private String personName;
	private String chatType;
	private String chatHistory;
	private String chatingAppName;
	private boolean network;
	private String charge;
	private boolean live;
	public ChatDTO(String name, String contactname, long contactNo, String personName, String chatType,
			String chatHistory, String chatingAppName, boolean network, String charge, boolean live) {
		super();
		this.name = name;
		this.contactname = contactname;
		this.contactNo = contactNo;
		this.personName = personName;
		this.chatType = chatType;
		this.chatHistory = chatHistory;
		this.chatingAppName = chatingAppName;
		this.network = network;
		this.charge = charge;
		this.live = live;
	}


}
