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
	public List<MemberBook> findBooksByBorrowedMemberIdx() {
		// Verilen üye idx ine göre üye adı, soyadı, kitap adı, yazarı, ödünç alma tarihi ve geri verme tarihini getiren metod
		
		return null;
	}

	@Override
	public List<MemberBook> findMembersByBorrowedBookIdx() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBook> listOfSpecificDateReturnBooks() {
		// TODO Auto-generated method stub
		return null;
	}

}
