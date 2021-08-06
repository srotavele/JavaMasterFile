package com.mark.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
			BankAccount doug = new BankAccount("Doug");
			doug.checkingDep(20000);
			doug.savingsDep(1000);
			doug.accountsTotal();
			doug.checkingDraw(500);
			doug.savingsDraw(250);
			doug.accountsTotal();
			doug.savingsDraw(1000);
			System.out.println("Total Active Accounts: "+ BankAccount.activeAccounts());
			BankAccount norma = new BankAccount("Norma");
			norma.checkingDep(10000);
			norma.savingsDep(5000);
			norma.accountsTotal();
			norma.checkingDraw(1500);
			norma.savingsDraw(1250);
			norma.accountsTotal();
			System.out.println("Total Active Accounts: "+ BankAccount.activeAccounts());

	}

}
