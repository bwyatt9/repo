/*
 * Class: CMSC203 
 * Instructor: Farnaz eivazi
 * Description:Bevshop program
 * Due: 8/11/2022
 * Platform/compiler: Ecclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Bruce Wyatt
 */
import java.util.*;

public class Order implements OrderInterface, Comparable<Order> {
int ordernumber;
int ordertime;
DAY day;

Customer customer;
 ArrayList<Beverage> BEV = new ArrayList<>();

public int randomnumber() {
	int x =new Random().nextInt(80000) + 10000;
	return x;
}
public Order(int time, DAY day, Customer cust) {
	ordertime =time;
	this.day =day;
	customer=new Customer(cust);
}
public void  addNewBeverage(
		String bevName,
		SIZE size,
		boolean extraShot,
		boolean extraSyrup) 
{
	BEV.add(new Coffee(bevName,size,extraShot,extraSyrup));
	}


public void  addNewBeverage( String bevName,
						SIZE size) {
	boolean weekend = isWeekend();
	BEV.add(new Alcohol(bevName, size,weekend));
}
public boolean isWeekend() {
	boolean x = false;
	if(day == DAY.SUNDAY||day==DAY.SATURDAY ) {
		x= true;
	}
	return x;
}
public void  addNewBeverage( String bevName,
		SIZE size,
		int numOfFruits,
		boolean addPRotien) {
	BEV.add(new Smoothie(bevName,size,numOfFruits,addPRotien));
}
public Beverage getBeverage(int itemNo) {
	return BEV.get(itemNo);
}
public double calcOrderTotal() 
{
	double temp=0;
	
	if(BEV.size()>0)
	for (int i=0; i< BEV.size(); i++)
		temp += BEV.get(i).calcPrice();
	double Price= temp;
	return Price;
}
public int findNumOfBeveType(TYPE type) {
	
		int counter=0;
		if(BEV.size()>0) {
		for (int i=0; i< BEV.size(); i++)
		{
			if (BEV.get(i).getType().equals(type))
				counter++;
		}
		}
		return counter;	
	}

public int getTotalItems()
{
	return BEV.size();
}

public String toString() {
    String total = "ORDER NUMBER: " + this.getOrderNo() + "\nCUSTOMER NAME: " + this.getCustomer().getName() + "\n ORDER TOTAL:" + this.calcOrderTotal() + "\n";
  if (BEV.size()>0)
    for(int i = 0; i < BEV.size();i++) {
        total += "[ "+this.getBeverage(i).toString()+"]";
    }
    return total;
}





public int getOrderNo() {
	return ordernumber;
}
public void setOrdernumber(int ordernumber) {
	this.ordernumber = ordernumber;
}
public int getOrderTime() {
	return ordertime;
}
public void setOrdertime(int ordertime) {
	this.ordertime = ordertime;
}
public DAY getOrderDay() {
	return day;
}
public void setDay(DAY day) {
	this.day = day;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}

public int compareTo(Order o) {
	int y=0;
	if(BEV.size()>0)
	if (getOrderNo() < o.getOrderNo())
	{
		y= -1;
	}
	else if (getOrderNo() > o.getOrderNo())
	{
		y= 1;
	}

return y;
	
}




}
