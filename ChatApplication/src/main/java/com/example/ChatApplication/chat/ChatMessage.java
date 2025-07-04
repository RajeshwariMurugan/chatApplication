package com.example.ChatApplication.chat;



public class ChatMessage {

    private MessageType type;   // JOIN, LEAVE, CHAT
    private String content;     // actual text message
    private String sender;      // username
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
}
