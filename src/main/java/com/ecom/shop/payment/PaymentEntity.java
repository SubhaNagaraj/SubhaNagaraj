package com.ecom.shop.payment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String acc_number;
   private String ifsc_code;
   private String bank_name;
   private String bank_branch;
   private String acc_holder_name; 
   private String phoneno;
   
public PaymentEntity() {
	super();
	// TODO Auto-generated constructor stub
}

public PaymentEntity(int id, String acc_number, String ifsc_code, String bank_name, String bank_branch,
		String acc_holder_name, String phoneno) {
	super();
	this.id = id;
	this.acc_number = acc_number;
	this.ifsc_code = ifsc_code;
	this.bank_name = bank_name;
	this.bank_branch = bank_branch;
	this.acc_holder_name = acc_holder_name;
	this.phoneno = phoneno;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAcc_number() {
	return acc_number;
}

public void setAcc_number(String acc_number) {
	this.acc_number = acc_number;
}

public String getIfsc_code() {
	return ifsc_code;
}

public void setIfsc_code(String ifsc_code) {
	this.ifsc_code = ifsc_code;
}

public String getBank_name() {
	return bank_name;
}

public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}

public String getBank_branch() {
	return bank_branch;
}

public void setBank_branch(String bank_branch) {
	this.bank_branch = bank_branch;
}

public String getAcc_holder_name() {
	return acc_holder_name;
}

public void setAcc_holder_name(String acc_holder_name) {
	this.acc_holder_name = acc_holder_name;
}

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

@Override
public String toString() {
	return "PaymentEntity [id=" + id + ", acc_number=" + acc_number + ", ifsc_code=" + ifsc_code + ", bank_name="
			+ bank_name + ", bank_branch=" + bank_branch + ", acc_holder_name=" + acc_holder_name + ", phoneno="
			+ phoneno + "]";
}
   
   
   
   
	
	
	

}
