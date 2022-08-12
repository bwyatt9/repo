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
public class Alcohol extends Beverage{
	boolean weekend;
	final double price =0.6;

	public Alcohol(String name,SIZE s,boolean weekend1) {
		super(name,TYPE.ALCOHOL, s);
		this.weekend=weekend1;

		
	}
	public Alcohol(String name,SIZE s) {
		super(name,TYPE.ALCOHOL, s);
	}

	@Override
	public String toString() {
		String x = super.toString();
	
		
		String str= x  +   
			"\nallowed on weekends?;" + weekend +
					getSize()+ calcPrice();
	
		return str;
		
	}
@Override
	public double calcPrice() {
		double p = super.calcPrice();
		if(weekend==true) {
			p = p+price;
		}
	
		return p;
	}

	public boolean equals(Alcohol b) {
		boolean x = false;
		if (super.equals(b)&&getWeekEnd()==b.getWeekEnd()) {
		
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
	public boolean setWeekEnd() {
		return weekend;
	}
	public boolean getWeekEnd() {
		return weekend;
	}
	
	

}
