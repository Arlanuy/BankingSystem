package banking;

import java.util.LinkedHashMap;
import java.util.Random;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;
	private long bank_index = 0;
	public Bank() {
		// complete the function
		accounts = new LinkedHashMap<>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
				//Set<Integer> keySet = this.accounts.keySet();
				//List<Long> arrkey = new ArrayList<Integer>(keySet);
        //Long key = arrkey.get(accountNumber);
        return this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
				//Random rd = new Random();
				Long accountNumber = this.bank_index;
				this.bank_index += 1;
				this.accounts.put(accountNumber, new CommercialAccount(company, accountNumber, pin, startingDeposit));
        return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
        //Random rd = new Random();
				Long accountNumber = this.bank_index;
				this.bank_index += 1;
				this.accounts.put(accountNumber, new ConsumerAccount(person, accountNumber, pin, startingDeposit));
        return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
				Account acc = this.accounts.get(accountNumber);
				if (acc.getPin() == pin) {
					return true;
				}
				return false;
        
	}

	public double getBalance(Long accountNumber) {
		// complete the function
				Account acc = this.accounts.get(accountNumber);
				return acc.getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		Account acc = this.accounts.get(accountNumber);
		acc.creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
				Account acc = this.accounts.get(accountNumber);
				boolean is_debited = acc.debitAccount(amount);
        return is_debited;
	}
}
