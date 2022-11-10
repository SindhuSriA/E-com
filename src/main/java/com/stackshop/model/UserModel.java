package com.stackshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long cid;
private String cname;
private String cpassword;
private String cemail;
private String cmobile;
private String cgender;
private String caddress;
private Boolean isCustomer;

private Long ID;
public Long getCid() {
	return cid;
}
public void setCid(Long cid) {
	cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	cname = cname;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	cpassword = cpassword;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	cemail = cemail;
}
public String getCmobile() {
	return cmobile;
}
public void setCmobile(String cmobile) {
	cmobile = cmobile;
}
public String getCgender() {
	return cgender;
}
public void setCgender(String cgender) {
	cgender = cgender;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	caddress = caddress;
}
public Boolean getIsCustomer() {
	return isCustomer;
}
public void setIsCustomer(Boolean isCustomer) {
	isCustomer = isCustomer;
}
public UserModel() {
	super();
	// TODO Auto-generated constructor stub
}
public UserModel(Long cid, String cname, String cpassword, String cemail, String cmobile, String cgender,
		String caddress, Boolean isCustomer) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cpassword = cpassword;
	this.cemail = cemail;
	this.cmobile = cmobile;
	this.cgender = cgender;
	this.caddress = caddress;
	this.isCustomer = isCustomer;
}
@Override
public String toString() {
	return "UserModel [cid=" + cid + ", cname=" + cname + ", cpassword=" + cpassword + ", cemail=" + cemail
			+ ", cmobile=" + cmobile + ", cgender=" + cgender + ", caddress=" + caddress + ", isCustomer=" + isCustomer
			+ "]";
}

}
