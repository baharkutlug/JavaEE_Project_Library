package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

import bahar.book.entity.Member;

@Local
public interface MemberService {
	public List<Member> findMembersByName(String name);

	public List<Member> findMembersByName(String name, int readSize);

	public List<Member> findMembersByLastName(String lastName);

	public List<Member> findMembersByLastName(String lastName, int readSize);

	public List<Member> findMembersByFirstAndLastName(String name, String lastName);

	public List<Member> findMembersByFirstAndLastName(String name, String lastName, int readSize);

	public List<Member> findMembersByIDX(int idx);

	public List<Member> findMembersByIDX(int idx, int readSize);
}
