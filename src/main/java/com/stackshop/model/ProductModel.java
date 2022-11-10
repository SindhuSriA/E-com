package com.stackshop.model;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class ProductModel {
	@Id
	private Integer pid;
	private String pname;
	private Double pprice;
	private String category;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPprice() {
		return pprice;
	}
	public void setPprice(Double pprice) {
		this.pprice = pprice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ProductModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductModel(Integer pid, String pname, Double pprice, String category) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.category = category;
	}
	@Override
	public String toString() {
		return "ProductModel [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", category=" + category + "]";
	}
	
}
