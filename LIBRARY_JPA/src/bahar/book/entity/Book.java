package bahar.book.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIB_BOOK")
@NamedQueries({
		@NamedQuery(name = "Book.findBooksByNameAndAuthor", query = "SELECT B.name FROM Book B WHERE B.name = 1? AND B.author = 2?"),
		@NamedQuery(name = "Book.orderByLastUpdate", query = "SELECT B FROM Book B ORDER BY B.sys_last_update DESC") })

public class Book {

	@Id
	@Column(name = "IDX")
	private int idx;

	@Column(name = "NAME", length = 80, nullable = false)
	private String name;

	@Column(name = "ORJ_NAME", length = 80)
	private String orjName;

	@Column(name = "AUTHOR", length = 50, unique = false, nullable = false)
	private String author;

	@Column(name = "TRANSLATOR", length = 50, unique = false)
	private String translator;

	@Column(name = "PUBLISH_YEAR", length = 4, unique = false, nullable = false)
	private int publishYear;

	@Column(name = "PUBLISHER", length = 80, unique = false, nullable = false)
	private String publisher;

	@Column(name = "BOOK_TYPE", length = 30, unique = false, nullable = false)
	private String bookType;

	@Column(name = "NUM_OF_PAGES", length = 4, unique = false, nullable = false)
	private int numOfPages;

	@Column(name = "SYS_VERSION", nullable = false)
	private int sysVersion;

	@Column(name = "SYS_LAST_UPDATE", nullable = false)
	private LocalDate sysLastUpdate = LocalDate.now();
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MemberBook> memberBook;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrjName() {
		return orjName;
	}

	public void setOrjName(String orjName) {
		this.orjName = orjName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public int getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(int sysVersion) {
		this.sysVersion = sysVersion;
	}

	public LocalDate getSysLastpdate() {
		return sysLastUpdate;
	}

	public void setSysLastpdate(LocalDate sysLastpdate) {
		this.sysLastUpdate = sysLastpdate;
	}

}
