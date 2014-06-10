/**
 * 
 */
package com.test.entity;

/**
 * @author V
 *
 */
public class Person {
	private float grossPay;
	private String payType;
	private String state;
	private int grossSalaryYTD;
	private String frequency;
	private String bilingStatus;
	public float getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(float grossPay) {
		this.grossPay = grossPay;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getGrossSalaryYTD() {
		return grossSalaryYTD;
	}
	public void setGrossSalaryYTD(int grossSalaryYTD) {
		this.grossSalaryYTD = grossSalaryYTD;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getBilingStatus() {
		return bilingStatus;
	}
	public void setBilingStatus(String bilingStatus) {
		this.bilingStatus = bilingStatus;
	}
	
}
