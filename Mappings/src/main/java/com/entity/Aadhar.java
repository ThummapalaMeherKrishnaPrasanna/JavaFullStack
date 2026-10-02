package com.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aadharId;
	
	@Column(unique = true)
	private int aadharNumber;
	
	private LocalDate issuedDate;

	
	public Aadhar() {
		super();
	}


	public Aadhar(int aadharNumber, LocalDate issuedDate) {
		super();
		this.aadharNumber = aadharNumber;
		this.issuedDate = issuedDate;
	}


	public int getAadharId() {
		return aadharId;
	}


	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}


	public int getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public LocalDate getIssuedDate() {
		return issuedDate;
	}


	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}


	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharNumber=" + aadharNumber + ", issuedDate=" + issuedDate + "]";
	}
	
	
}
