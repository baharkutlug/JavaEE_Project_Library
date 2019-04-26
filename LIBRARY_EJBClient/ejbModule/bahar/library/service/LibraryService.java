package bahar.library.service;

import java.util.ArrayList;

import javax.ejb.Local;

import bahar.book.entity.Book;
import bahar.book.entity.Member;
import bahar.book.entity.MemberBook;

@Local
public interface LibraryService {

	public ArrayList<Member> findByMemberName(String name);

	public ArrayList<Member> findByMemberIDX(int idx);

	public ArrayList<MemberBook> findRecordByMemberName(String name);

	public ArrayList<MemberBook> findRecordByMemberIDX(int idx);

	public ArrayList<Book> findByBookName(String name);

	public ArrayList<Book> findByBookIDX(int idx);

	public ArrayList<MemberBook> findRecordByBookName(String name);

	public ArrayList<MemberBook> findRecordByBookIDX(int idx);

	public ArrayList<MemberBook> findByLastUpdate();

}
