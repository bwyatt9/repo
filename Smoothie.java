
public class Smoothie extends Beverage{
	int fruits;
	boolean pro;
	 final double extrapricefruit = 0.5;
	 final double extrapriceprotein = 1.5;
	public Smoothie(String name,SIZE s,int fruit,boolean pro) {
		super(name,TYPE.SMOOTHIE, s);
		this.pro=pro;
		fruits = fruit;
		
	}
	@Override
	public String toString() {
		String x = super.toString();
	
		
		String str= x  +   
			"\nfruits;" + fruits +"\nExtra syrup;"+pro
					+getSize()+ calcPrice();
	
		return str;
		
	}
@Override
	public double calcPrice() {
		double p = super.calcPrice();
		if(pro==true) {
			p = p+extrapriceprotein;
			
		}
		if(fruits>=1) {
			double x = extrapricefruit*fruits;
			p= p +x;
		}
		return p;
	}

	public boolean equals(Smoothie b) {
		boolean x = false;
		if (super.equals(b)&&getAddProtein()==b.getAddProtein()&&getNumOfFruits()==b.getNumOfFruits()) {
		
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
	public int getNumOfFruits() {
		return fruits;
	}
	public boolean getAddProtein() {
		return pro;
	}
	
	

}
