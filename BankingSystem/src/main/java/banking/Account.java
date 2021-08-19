package banking;

/**
 * Abstract bank account class.<br>
 * <br>
 *
 * Private Variables:<br>
 * {@link #accountHolder}: AccountHolder<br>
 * {@link #accountNumber}: Long<br>
 * {@link #pin}: int<br>
 * {@link #balance}: double
 */
public abstract class Account {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
		// complete the constructor
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.startingDeposit = startingDeposit;
	}

	public int getPin() {
		return this.pin;
	}

	public AccountHolder getAccountHolder() {
		// complete the function
        return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		// complete the function
				if (attemptedPin == this.pin) {
        	return true;
        }
        return false;
	}

	public double getBalance() {
		// complete the function
        return this.balance;
	}

	public Long getAccountNumber() {
		// complete the function
        return this.accountNumber;
	}

	public void creditAccount(double amount) {
		// complete the function
		this.balance += amount;
	}

	public boolean debitAccount(double amount) {
		// complete the function
				if (this.balance < amount) {
					return false;
				}

				else {
					this.balance -= amount;
				}
        return true;
	}
}
