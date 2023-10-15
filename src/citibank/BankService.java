package citibank;

public interface BankService {
	public void deposit(double amount) throws InvalidAmountException;

	public double withdraw(double amount) throws InvalidAmountException, InsufficientFundsException;

	public void balanceEnquiry();
}
