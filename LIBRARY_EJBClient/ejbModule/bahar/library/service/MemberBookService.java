package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

import bahar.book.entity.MemberBook;

@Local
public interface MemberBookService {

	public List<MemberBook> findBooksByBorrowedMemberIdx();

	public List<MemberBook> findMembersByBorrowedBookIdx();

	public List<MemberBook> listOfSpecificDateReturnBooks();

}
