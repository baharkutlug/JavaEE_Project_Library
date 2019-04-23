package bahar.book.service;

import java.util.ArrayList;

import javax.ejb.Local;

import bahar.book.entity.MemberBook;

@Local
public interface MemberBookService {

	public ArrayList<MemberBook> findMembersByBorrowedBookIdx();

	public ArrayList<MemberBook> orderByLastUpdate();

}
