package ServeletBean;

import java.sql.Date;

public class RegPJ {
	
	private Integer UID; 
	private String Uname;
	private String Name;
	private String City;
	private Date Birthdate;
	private String Email;
	private String Phoneno;
	private String ProposalNo;
	private String ApprovePolNo;
	private String TotalPremium;
	private String PolicyName;
	public RegPJ() {
		super();
	}
	public RegPJ(Integer uID, String uname, String name, String city, Date birthdate, String email, String phoneno,
			String proposalNo, String approvePolNo, String totalPremium, String policyName) {
		super();
		UID = uID;
		Uname = uname;
		Name = name;
		City = city;
		Birthdate = birthdate;
		Email = email;
		Phoneno = phoneno;
		ProposalNo = proposalNo;
		ApprovePolNo = approvePolNo;
		TotalPremium = totalPremium;
		PolicyName = policyName;
	}
	public Integer getUID() {
		return UID;
	}
	public void setUID(Integer uID) {
		UID = uID;
	}
	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}
	public String getProposalNo() {
		return ProposalNo;
	}
	public void setProposalNo(String proposalNo) {
		ProposalNo = proposalNo;
	}
	public String getApprovePolNo() {
		return ApprovePolNo;
	}
	public void setApprovePolNo(String approvePolNo) {
		ApprovePolNo = approvePolNo;
	}
	public String getTotalPremium() {
		return TotalPremium;
	}
	public void setTotalPremium(String totalPremium) {
		TotalPremium = totalPremium;
	}
	public String getPolicyName() {
		return PolicyName;
	}
	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}
	@Override
	public String toString() {
		return "RegPJ [UID=" + UID + ", Uname=" + Uname + ", Name=" + Name + ", City=" + City + ", Birthdate="
				+ Birthdate + ", Email=" + Email + ", Phoneno=" + Phoneno + ", ProposalNo=" + ProposalNo
				+ ", ApprovePolNo=" + ApprovePolNo + ", TotalPremium=" + TotalPremium + ", PolicyName=" + PolicyName
				+ "]";
	}
	
	}
