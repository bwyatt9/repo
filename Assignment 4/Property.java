

public class Property extends java.lang.Object {
//fields
private java.lang.String city;
private java.lang.String owner;
private java.lang.String propertyName;
private double rentAmount;
private Plot plot;
//constructors
public Property() {
	city ="";
	propertyName="";
	owner ="";
	rentAmount = 0;
	
	
}
public Property(Property p) {

	city = p.city;
	owner =p.owner;
	propertyName = p.propertyName;
	rentAmount = p.rentAmount;
	plot = p.plot;
}
public Property(java.lang.String propertyName,
        java.lang.String city,
        double rentAmount,
        java.lang.String owner) {
	propertyName = this.propertyName;
	city = this.city;
	rentAmount = this.rentAmount;
	owner = this.owner;
} 

public Property(java.lang.String propertyName,
        java.lang.String city,
        double rentAmount,
        java.lang.String owner,
        int x,
        int y,
        int width,
        int depth) {
	propertyName = this.propertyName;
	city = this.city;
	rentAmount = this.rentAmount;
	owner = this.owner;
	Plot p = new Plot();
	x = p.getX();
	y = p.getY();
	width = p.getWidth();
	depth = p.getDepth();
}
//METHODS
public java.lang.String getPropertyName(){
	return propertyName;
}
public void setPropertyName(java.lang.String propertyName) {
	this.propertyName = propertyName;
}
public java.lang.String getCity(){
	return city;
}
public Plot getPlot() {
	return plot;
}
public Plot setPlot(int x, int y, int width, int depth) {

	Plot p = new Plot();
	x = p.getX();
	y = p.getY();
	width = p.getWidth();
	depth = p.getDepth();
	return p;
}
public void setCity(java.lang.String city) {
	this.city=city;
}
public double getRentAmount() {
	return rentAmount;
}
public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}
public java.lang.String getOwner(){
	return owner;
}
public void setOwner(java.lang.String owner) {
	this.owner = owner;
}

public java.lang.String toString(){
	return "Name :" + this.propertyName +", city:" + this.city + ", owner:"+ this.owner + ", rentAmount:"+ this.rentAmount;
}
}
