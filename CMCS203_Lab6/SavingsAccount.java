package lab6;

public class SavingsAccount extends BankAccount{
double rate =2.5;
int savingsNumber=0;
String accountNumber;

public SavingsAccount(String name,double balance) {
	super(name,balance);

	accountNumber=super.getAccountNumber();
	accountNumber = accountNumber +"-" +savingsNumber++;
	
}
public void postInterest() {
	if(getBalance()>0) {
	double Rate = (rate / 12);
	double Interest = Rate * getBalance();
	deposit(Interest);
}
}
@Override
public String getAccountNumber(){
    return accountNumber;
  }
public SavingsAccount(SavingsAccount savings, double balance) {
	super(savings,balance);
	savingsNumber ++;
	accountNumber=super.getAccountNumber() + "-" + savingsNumber++;
	
}
}