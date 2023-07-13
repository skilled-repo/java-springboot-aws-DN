package com.barclays.app.domain;

import java.time.LocalDate;
import java.util.Objects;

//Immutable Domain Classes
public final class BankTransaction {

	//1. private final fields   
	private final LocalDate tranDate;
    private final String tranDetails;
    private final float debitAmt;
    private final float creditAmt;
    private final float accountBalance;
    
    //2. argument constructor				
	public BankTransaction(LocalDate tranDate, String tranDetails, float debitAmt, float creditAmt,
			float accountBalance) {
		super();
		this.tranDate = tranDate;
		this.tranDetails = tranDetails;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.accountBalance = accountBalance;
	}
	
	//3. public accessor method (getters) 	
	public LocalDate getTranDate() {
		return tranDate;
	}
	public String getTranDetails() {
		return tranDetails;
	}
	public float getDebitAmt() {
		return debitAmt;
	}
	public float getCreditAmt() {
		return creditAmt;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	
	// Override toString() method  
	@Override
	public String toString() {
		return "BankTransaction [tranDate=" + tranDate + ", tranDetails=" + tranDetails + ", debitAmt=" + debitAmt
				+ ", creditAmt=" + creditAmt + ", accountBalance=" + accountBalance + "]";
	}
	
	// Override equals() method
	@Override
	public int hashCode() {
		return Objects.hash(accountBalance, creditAmt, debitAmt, tranDate, tranDetails);
	}
	
	 // Override hashCode() method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankTransaction other = (BankTransaction) obj;
		return Float.floatToIntBits(accountBalance) == Float.floatToIntBits(other.accountBalance)
				&& Float.floatToIntBits(creditAmt) == Float.floatToIntBits(other.creditAmt)
				&& Float.floatToIntBits(debitAmt) == Float.floatToIntBits(other.debitAmt)
				&& Objects.equals(tranDate, other.tranDate) && Objects.equals(tranDetails, other.tranDetails);
	}
    
}

