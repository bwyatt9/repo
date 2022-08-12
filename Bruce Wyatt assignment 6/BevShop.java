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
import java.util.ArrayList;

public class BevShop implements BevShopInterfce{
	ArrayList<Order> orders;

	 Order currentOrder;

	 static final int maxAlcohol = 3;

	 static final int minAge = 21;
	 int minTime=8;
	 int maxTime=23;
	public BevShop() {
		orders = new ArrayList<Order>();
	}
	
	public boolean validTime(int time)
	{boolean x=false;
	boolean y =true;
		if (time >= minTime && time <= maxTime)
			return y;
		 else 
			return x;
	}

	
	public boolean eligibleForMore() {
		return getNumOfAlcoholDrink() < maxAlcohol;
	}

	
	public boolean validAge(int age) {
		return age > MIN_AGE_FOR_ALCOHOL;
	}


	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		currentOrder = new Order(time, day, new  Customer(customerName, customerAge));
		orders.add(currentOrder);	
	}

	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		this.currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}

	public void processAlcoholOrder(String bevName, SIZE size) {
		this.currentOrder.addNewBeverage(bevName, size);		
	}

	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		this.currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtien);
	}

	public int findOrder(int orderNo) {
		int index= 0;
	
		if(orders.size()>0)
		for (int i=0 ; i< orders.size(); i++)
		{
			if (orders.get(i).getOrderNo() == orderNo)
				index=i;
		}
		return index;
	}


	public double totalOrderPrice(int orderNo)
	{
		double Price=orders.get(findOrder(orderNo)).calcOrderTotal();
		return Price;
		
	}


	public double totalMonthlySale() {
		double sum = 0;
		if(orders.size()>0)
		for(int i = 0; i < orders.size(); i++) {
			sum+=orders.get(i).calcOrderTotal();
		}
		return sum;
	}
	
	public void sortOrders() {
		int min;
		int minIndex;
		
		for( int i=0; i< orders.size()-1; i++)
		{
			min= orders.get(i).getOrderNo();
			minIndex=i ;
			
			for (int j= i + 1; j< orders.size(); j++)
			{
				if (orders.get(j).getOrderNo()< min)
				{
					min= orders.get(j).getOrderNo();
					minIndex= j ;
				}
			}
			
			orders.add(i,orders.get(minIndex));
			orders.remove(minIndex+1);
		}
		}
	
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public String toString() {
		String str = "Bev sales;" + totalMonthlySale()  ;
		if(orders.size()>0)
		for(int i = 0; i < orders.size(); i++) {
			str += "Order " + i + "\n";
			str += orders.get(i).toString();
		}
		return str;
	}

	public Order getCurrentOrder() {
		return this.currentOrder;
	}


	public void setCurrentOrder(Order currentOrder) {
		this.currentOrder = currentOrder;
	}


	public int getNumOfAlcoholDrink() {
		return currentOrder.findNumOfBeveType(TYPE.ALCOHOL);
	}


	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}


	public boolean isMaxFruit(int i) {
		return i>MAX_FRUIT;
	}

	public int getMaxOrderForAlcohol() {
		return minAge;
	}

	public int getMinAgeForAlcohol() {
		return maxAlcohol;
	}
	
}
