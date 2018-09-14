package com.roomrockers.ourroom.person;

import java.util.ArrayList;
import java.util.List;

public class MemberServiceImpl implements MemberService{
	
	public List<Member> members = new ArrayList<Member>();
	
	@Override
	public int saveMember(Member member) {
		members.add(member);
		return member.getId();
	}

	@Override
	public Member getMember(int id) {
		for(Member member : members) {
			if(member.getId() == id) {
				return member;
			}
		}
		return null;
	}

	@Override
	public List<Member> getAllMember() {
		return members;
	}

}
