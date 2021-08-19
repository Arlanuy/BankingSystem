package banking;

/**
 *
 * Private Variables:<br>
 * {@link #accountNumber}: Long<br>
 * {@link #bank}: Bank<br>
 */
public class Transaction implements TransactionInterface{
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *            The bank where the account is housed.
	 * @param accountNumber
	 *            The customer's account number.
	 * @param attemptedPin
	 *            The PIN entered by the customer.
	 * @throws Exception
	 *             Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
		Account acc = bank.getAccount(accountNumber);
		if (acc.validatePin(attemptedPin) == false) {
			throw new Exception("Pin invalid");
		} 
	}

	public double getBalance() {
		// complete the function
				Account acc = bank.getAccount(this.accountNumber);
        return acc.getBalance();
	}

	public void credit(double amount) {
		// complete the function
		Account acc = bank.getAccount(this.accountNumber);
		acc.creditAccount(amount);
	}

	public boolean debit(double amount) {
		// complete the function
				Account acc = bank.getAccount(this.accountNumber);
				boolean is_debited = acc.debitAccount(amount);
        return is_debited;
	}
}
