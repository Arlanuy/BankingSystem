package banking;

public class ConsumerAccount  extends Account implements AccountInterface{
	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		super(person, accountNumber, pin, currentBalance);
	}
}
