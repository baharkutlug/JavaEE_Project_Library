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
@Table(name = "LIB_MEMBER")
@NamedQueries({ 
		@NamedQuery(name = "Member.findMembersByName", query = "SELECT M FROM Member M WHERE M.memFirstName = :name"),
		@NamedQuery(name = "Member.findMembersByLastName", query = "SELECT M FROM Member M WHERE M.memLastName = :lastName"),
		@NamedQuery(name = "Member.findMembersByFirstAndLastName", query = "SELECT M FROM Member M WHERE M.memFirstName = :name AND M.memLastName = :lastName"),
		@NamedQuery(name = "Member.findMembersByIDX", query = "SELECT M FROM Member M WHERE M.idx = :idx"),
		@NamedQuery(name = "Member.orderByLastUpdate", query = "SELECT M FROM Member M ORDER BY M.sysLastUpdate DESC") })

public class Member {

	@Id
	@Column(name = "IDX")
	private int idx;

	@Column(name = "MEM_FIRST_NAME", length = 30, unique = false, nullable = false)
	private String memFirstName;

	@Column(name = "MEM_LAST_NAME", length = 30, unique = false)
	private String memLastName;

	@Column(name = "REGIST_DATE", nullable = false)
	private LocalDate registDate = LocalDate.now();

	@Column(name = "SYS_VERSION", nullable = false)
	private int sysVersion;

	@Column(name = "SYS_LAST_UPDATE", nullable = false)
	private LocalDate sysLastUpdate = LocalDate.now();

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<MemberBook> memberBook;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMemFirstName() {
		return memFirstName;
	}

	public void setMemFirstName(String memFirstName) {
		this.memFirstName = memFirstName;
	}

	public String getMemLastName() {
		return memLastName;
	}

	public void setMemLastName(String memLastName) {
		this.memLastName = memLastName;
	}

	public LocalDate getRegistDate() {
		return registDate;
	}

	public void setRegistDate(LocalDate registDate) {
		this.registDate = registDate;
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