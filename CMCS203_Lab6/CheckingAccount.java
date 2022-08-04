package lab6;

public class CheckingAccount extends BankAccount {
	static double FEE = 0.15;
	public CheckingAccount(String name,double amount) {
	super(name,amount);
	
	setAccountNumber(getAccountNumber()+"-10");

	
}
@Override
public boolean withdraw(double amount)
{

double amount1 = amount + FEE;
return super.withdraw(amount1);

}
}
