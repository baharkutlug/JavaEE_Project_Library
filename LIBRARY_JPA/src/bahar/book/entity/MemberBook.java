package bahar.book.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "LIB_MEMBER_BOOK")
@NamedQueries({
		@NamedQuery(name = "MemberBook.findByBookIdx", query = "SELECT MB FROM MemberBook MB WHERE MB.bookIdx = :bookIDX"),
		@NamedQuery(name = "MemberBook.findByMemberIdx", query = "SELECT MB FROM MemberBook MB WHERE MB.memCardIdx = :memberIDX"),
		@NamedQuery(name = "MemberBook.orderByLastUpdate", query = "SELECT MB FROM MemberBook MB ORDER BY MB.sysLastUpdate DESC") })

public class MemberBook {

	@Id
	@Column(name = "IDX")
	private int idx;

	@Column(name = "BOOK_IDX", nullable = false)
	private int bookIdx;

	@Column(name = "MEM_CARD_IDX", nullable = false)
	private int memCardIdx;

	@Column(name = "BORROW_DATE", nullable = false)
	private LocalDate borrowDate = LocalDate.now();

	@Column(name = "RETURN_DATE", nullable = false)
	private LocalDate returnDate = LocalDate.now();

	@Column(name = "SYS_VERSION", nullable = false)
	private int sysVersion;

	@Column(name = "SYS_LAST_UPDATE", nullable = false)
	private LocalDate sysLastUpdate = LocalDate.now();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BOOK_IDX")
	private Book book;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEM_CARD_IDX")
	private Member member;
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public int getBookIdx() {
		return bookIdx;
	}

	public void setBookIdx(int bookIdx) {
		this.bookIdx = bookIdx;
	}

	public int getMemCardIdx() {
		return memCardIdx;
	}

	public void setMemCardIdx(int memCardIdx) {
		this.memCardIdx = memCardIdx;
	}

	public LocalDate getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(LocalDate borrowDate) {
		this.borrowDate = borrowDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public int getSysVersion() {
		return sysVersion;
	}

	public void setSysVersion(int sysVersion) {
		this.sysVersion = sysVersion;
	}

	public LocalDate getSysLastUpdate() {
		return sysLastUpdate;
	}

	public void setSysLastUpdate(LocalDate sysLastUpdate) {
		this.sysLastUpdate = sysLastUpdate;
	}

}
