package com.roomrockers.ourroom.person;

import org.springframework.stereotype.Component;

@Component
public class Member extends Person{
	
	public static int token;		//implementing for getting ID of new member.
	
	public Member() {
		token++;
	}
}
