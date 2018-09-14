package com.roomrockers.ourroom.person;

import java.util.ArrayList;
import java.util.List;

public interface MemberService {
	
	public int saveMember(Member member);
	public Member getMember(int id);
	public List<Member> getAllMember();
	
}
