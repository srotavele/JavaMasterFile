package com.mark.bankaccount;
import java.util.Random;

public class BankAccount {
		private String name;
		private int accountNum;
		private double checkingBal;
		private double savingsBal;
		private static double allBalances = 0;
		private static int numOfAccts = 0;
		
		public BankAccount(String name) {
			this.setName(name);
			this.setCheckingBal(0);
			this.setSavingsBal(0);
//			this.setAccountNum(randAcctNum());
			numOfAccts ++;
		}
		
		public void checkingDep(double deposit) {
			setCheckingBal(getCheckingBal() + deposit);
			setAllBalances(getAllBalances() + deposit);
			System.out.println(this.getName() + "'s" + " Checking deposit of " + deposit + " confirmed ");
		}
		public void savingsDep(double deposit) {
			setSavingsBal(getSavingsBal() + deposit);
			setAllBalances(getAllBalances() + deposit);
			System.out.println(this.getName() + "'s" + " Savings deposit of " + deposit + " confirmed ");
		}
		public void checkingDraw(double withdrawal) {
			if( withdrawal <= getCheckingBal()) {
				setCheckingBal(getCheckingBal() - withdrawal);
				setAllBalances(getAllBalances() - withdrawal);
				System.out.println(this.getName() + "'s" + " Checking withdrawal of " + withdrawal + " confirmed ");
			} else {
				System.out.println("Checking withdrawal DENIED. You're broke!");
			}
		}
		public void savingsDraw(double withdrawal) {
			if( withdrawal <= getSavingsBal()) {
				setSavingsBal(getSavingsBal() - withdrawal);
				setAllBalances(getAllBalances() - withdrawal);
				System.out.println(this.getName() + "'s" + " Savings withdrawal of " + withdrawal + " confirmed ");
			} else {
				System.out.println("Savings withdrawal DENIED. Sorry, champ. You've spent it all!");
			}
		}
		
		public void accountsTotal() {
			System.out.println(this.getName() + "'s Account balances = Checking: " + this.getCheckingBal() + " Savings: " + this.getSavingsBal());
		}
		
		public static int activeAccounts() {
			return getNumOfAccts();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAccountNum() {
			return accountNum;
		}

		public void setAccountNum(int accountNum) {
			this.accountNum = accountNum;
		}

		public double getCheckingBal() {
			return checkingBal;
		}

		public void setCheckingBal(double checkingBal) {
			this.checkingBal = checkingBal;
		}

		public double getSavingsBal() {
			return savingsBal;
		}

		public void setSavingsBal(double savingsBal) {
			this.savingsBal = savingsBal;
		}

		public static double getAllBalances() {
			return allBalances;
		}

		public static void setAllBalances(double allBalances) {
			BankAccount.allBalances = allBalances;
		}

		public static int getNumOfAccts() {
			return numOfAccts;
		}

		public static void setNumOfAccts(int numOfAccts) {
			BankAccount.numOfAccts = numOfAccts;
		}
}
