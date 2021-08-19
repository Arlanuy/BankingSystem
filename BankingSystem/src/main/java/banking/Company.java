package banking;

public class Company  extends AccountHolder{
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		// complete the function
		this.companyName = companyName;
		this.taxId = taxId;
	}

	public String getCompanyName() {
		// complete the function
        return this.companyName;
	}
}
