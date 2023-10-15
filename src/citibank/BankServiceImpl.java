package citibank;

public class BankServiceImpl implements BankService {

	private double balance;

	@Override
	public void deposit(double amount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		if (amount <= 0) {
			throw new InvalidAmountException(amount + " is invalid amount!!!, Please check the amount");
		}
		this.balance = balance + amount;
	}

	@Override
	public double withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		// TODO Auto-generated method stub
		if (amount <= 0) {
			throw new InvalidAmountException(amount + " is invalid amount!!!, Please check the amount");
		}
		if (this.balance < amount) {
			throw new InsufficientFundsException("Sorry you cannot withdraw amount due to insufficient Funds!!!");
		}
		this.balance -= amount;
		return amount;
	}

	@Override
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		System.out.println("Current Balance in your account is " + this.balance);
	}
}