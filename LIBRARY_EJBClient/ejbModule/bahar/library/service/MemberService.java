package bahar.library.service;

import java.util.ArrayList;

import javax.ejb.Local;

import bahar.book.entity.Member;

@Local
public interface MemberService {
	public ArrayList<Member> findMembersByFirstAndLastName();

	public ArrayList<Member> orderByLastUpdate();
}
