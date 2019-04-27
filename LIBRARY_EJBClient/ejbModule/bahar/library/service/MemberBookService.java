package bahar.library.service;

import java.util.List;

import javax.ejb.Local;

import bahar.book.entity.MemberBook;

@Local
public interface MemberBookService {

	public List<MemberBook> findByMemberIdx();

	public List<MemberBook> findByBookIdx();

	public List<MemberBook> listOfSpecificDateReturnBooks();

	public void saveMemberBook(MemberBook memberBook);

	public void mergeMemberBook(MemberBook memberBook);

}
