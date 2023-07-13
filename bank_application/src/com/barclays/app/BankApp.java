package com.barclays.app;

import java.time.LocalDate;

import com.barclays.app.domain.BankTransaction;
import com.barclays.app.domain.Transaction;

public class BankApp {

	public static void main(String[] args) {
		
		 BankTransaction bankTransaction = new BankTransaction(LocalDate.now(),"NEFT/92665604/Sabari/citibank/PrintFee",50000,0,52030.59f);
		 
		 Transaction transactions = new Transaction(LocalDate.now(),"NEFT/876543/Balaji/nationalbank/PrintFee",80000,0,52030.59f);
		 
		 
		 System.out.println(bankTransaction);
		 System.out.println(transactions);
	}

}
