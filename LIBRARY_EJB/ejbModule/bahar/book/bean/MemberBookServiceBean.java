package bahar.book.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import bahar.book.entity.MemberBook;
import bahar.library.service.LibraryService;
import bahar.library.service.MemberBookService;

@Stateless
public class MemberBookServiceBean implements MemberBookService {

	@EJB
	private LibraryService libraryService;

	@Override
	public List<MemberBook> findByMemberIdx() {
		//Üye idx ine göre diğer bilgileri getiren sorguyu yaratma
		return null;
	}

	@Override
	public List<MemberBook> findByBookIdx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBook> listOfSpecificDateReturnBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMemberBook(MemberBook memberBook) {
		try {
			libraryService.persist(memberBook);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mergeMemberBook(MemberBook memberBook) {
		try {
			libraryService.merge(memberBook);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
