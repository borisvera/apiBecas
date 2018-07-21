package beca.accounts.domain.repository;

import beca.accounts.domain.entity.BankAccount;

public interface BankAccountRepository {
	BankAccount findByNumber(String accountNumber) throws Exception;
	BankAccount findByNumberLocked(String accountNumber) throws Exception;
	void save(BankAccount bankAccount);
}
