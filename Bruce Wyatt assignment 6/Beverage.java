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
public abstract class Beverage {
String name1;
TYPE type;
SIZE size;
final double base = 2.0;
final double sizeprice =1.0;
public Beverage(String name, TYPE t, SIZE s) {
	this.name1 = name;
	this.type = t;
	size = s;
}
public Beverage(String Name2, SIZE s1) {
	name1=Name2;
	size = s1;
}
public double calcPrice() {
	if(size.equals(SIZE.SMALL)) {
		return base;
	}
	else if(size.equals(SIZE.MEDIUM)) {
		return base + sizeprice;
	}
	else
		return base + sizeprice + sizeprice;
}
public String toString() {
	return this.name1+this.size;
}

public boolean equals(Beverage b) {
	boolean x = false;
	if (getBevName()==b.getBevName()&& getType()==b.getType()&& getSize()==b.getSize()) {
		x =true;
	}
	return x;
}




public String getBevName() {
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
public void setSize(SIZE s) {
	size=s;
}
public double getBase() {
	return base;
}
public double getSizeprice() {
	return sizeprice;
}

}
