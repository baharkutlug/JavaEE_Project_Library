package bahar.book.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import bahar.book.entity.Member;
import bahar.library.service.LibraryService;
import bahar.library.service.MemberService;

@Stateless
public class MemberServiceBean implements MemberService {

	@EJB
	private LibraryService libraryService;

	@Override
	public List<Member> findMembersByName(String name) {
		// Verilen üye ismine göre diğer bilgileri getiren sorguyu yaratma
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByName", name);
		return member;
	}

	@Override
	public List<Member> findMembersByName(String name, int readSize) {
		// Verilen üye ismine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByName", name, readSize);
		return member;
	}

	@Override
	public List<Member> findMembersByLastName(String lastName) {
		// Verilen üye soyismine göre diğer bilgileri getiren sorguyu yaratma
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByLastName", lastName);
		return member;
	}

	@Override
	public List<Member> findMembersByLastName(String lastName, int readSize) {
		// Verilen üye soyismine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByLastName", lastName,
				readSize);
		return member;
	}

	@Override
	public List<Member> findMembersByFirstAndLastName(String name, String lastName) {
		// Verilen üye isim ve soyismine göre diğer bilgileri getiren sorguyu yaratma
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByFirstAndLastName", name,
				lastName);
		return member;
	}

	@Override
	public List<Member> findMembersByFirstAndLastName(String name, String lastName, int readSize) {
		// Verilen üye isim ve soyismine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByFirstAndLastName", name,
				lastName, readSize);
		return member;
	}

	@Override
	public List<Member> findMembersByIDX(int idx) {
		// Verilen üye idx ine göre diğer bilgileri getiren sorguyu yaratma
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByIDX", idx);
		return member;
	}

	@Override
	public List<Member> findMembersByIDX(int idx, int readSize) {
		// Verilen üye idx ine göre diğer bilgileri getiren sorguyu yaratma (liste büyüklüğü belirtilebilen)
		List<Member> member = libraryService.findByNamedQuery(Member.class, "Member.findMembersByIDX", idx, readSize);
		return member;
	}

}
