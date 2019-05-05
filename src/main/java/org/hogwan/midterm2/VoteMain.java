package org.sunha.midterm2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VoteMain {
	public void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("vote-context.xml");
		
		VoteService pollService = context.getBean("voteService", VoteService.class);

		pollService.vote();
		pollService.listVotes();
		context.close();
	}

}
