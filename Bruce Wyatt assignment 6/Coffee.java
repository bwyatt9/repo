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
public class Coffee extends Beverage{

	 boolean coffeeshot;
	 boolean syrup;
	 final double extrapricesyrup = 0.5;
	 final double extrapricecoffee = 0.5;
	public Coffee(String name,SIZE s,boolean cof,boolean syr) {
		 super(name,TYPE.COFFEE, s);
		this.syrup =syr;
		this.coffeeshot=cof;
		
	}
	@Override
	public String toString() {
		String x = super.toString();
	
		
		String str= x  +   
			"\nExtra Shot;" + coffeeshot +"\nExtra syrup;"+syrup
					+getSize()+ calcPrice();
	
		return str;
		
	}
@Override
	public double calcPrice() {
		double p = super.calcPrice();
		if(coffeeshot==true) {
			p = p+extrapricecoffee;
			
		}
		if(syrup==true) {
			p = p+extrapricesyrup;
		}
		return p;
	}

	public boolean equals(Coffee b) {
		boolean x = false;
		if (super.equals(b)&&getExtraShot()==b.getExtraShot()&&getExtraSyrup()==b.getExtraSyrup()) {
		
			x =true;
			}
		
		return x;
	}




	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public TYPE getType() {
		return type;
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public SIZE getSize() {
		return size;
	}
	public void setSize(SIZE size) {
		this.size = size;
	}
	public double getBasePrice() {
		return super.getBase();
	}
	public double getSizeprice() {
		return sizeprice;
	}
	public boolean getExtraShot() {
		return coffeeshot;
	}
	public void setExtrashot(boolean coffeeshot) {
		this.coffeeshot = coffeeshot;
	}
	public boolean getExtraSyrup() {
		return syrup;
	}
	public void setSyrup(boolean syrup) {
		this.syrup = syrup;
	}
	public double getExtraprice() {
		return extrapricecoffee;
	}
	

}
