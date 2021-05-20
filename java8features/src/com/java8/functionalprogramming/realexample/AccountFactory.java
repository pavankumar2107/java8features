package com.java8.functionalprogramming.realexample;

public interface AccountFactory {
	BankAccount getBankAccount(int id, double balance, String accountName);
}
