package bahar.book.bean;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bahar.book.entity.Member;
import bahar.book.service.MemberService;

@Stateless
public class MemberServiceBean implements MemberService {
	@PersistenceContext(unitName = "LIBRARY_DB")
	EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Member> findMembersByFirstAndLastName() {
		return (ArrayList<Member>) em.createNamedQuery("Member.findMembersByFirstAndLastName").getResultList();
	}

	@Override
	public ArrayList<Member> orderByLastUpdate() {
		return null;
	}

}
