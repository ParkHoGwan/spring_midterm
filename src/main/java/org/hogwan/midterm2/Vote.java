package org.sunha.midterm2;

public class Vote {
	String pollId;
	String userId;
	String name;
	int choice;
	
	public String getPollId() {
		return pollId;
	}
	public void setPollId(String pollId) {
		this.pollId = pollId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
	@Override
	public String toString() {
		return "Vote [pollId=" + pollId + ", userId=" + userId + ", name=" 
						+ name + ", choice=" + choice + "]\n";
	}
	
	
	

}
