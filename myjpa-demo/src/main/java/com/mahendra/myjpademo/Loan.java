package com.mahendra.myjpademo;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@Entity
@Table(name="loans")
@XmlRootElement(name="loans")
public class Loan {

	@Id
	@Column(name="acc_no",length=10)
	private String accNumber;
	
	@Column(name="cname",length=40)
	private String customername;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="duration_mon")
	private Integer durationInMonths;
	
	@Column(name="amount")
	private Double amount;

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(Integer durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(String accNumber, String customername, Date date, Integer durationInMonths, Double amount) {
		super();
		this.accNumber = accNumber;
		this.customername = customername;
		this.date = date;
		this.durationInMonths = durationInMonths;
		this.amount = amount;
	}
	
	
}
