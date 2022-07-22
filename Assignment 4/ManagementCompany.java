
public class ManagementCompany extends java.lang.Object {
	private java.lang.String name;
	private java.lang.String taxID;
	private Property[] properties;
	private double mgmFeePer;
	private final int MAX_PROPERTY = 5;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	public ManagementCompany() {
        properties = new Property[MAX_PROPERTY];
     
        
        this.name = "";
        this.taxID = "";
        this.plot = new Plot(0, 0, 1, 1);
      }

	public ManagementCompany(java.lang.String name,
            java.lang.String taxID,
            double mgmFeeper) {
        properties = new Property[MAX_PROPERTY];
        this.name = name;
        this.taxID = taxID;
        this.mgmFeePer = mgmFeeper;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
      }

	public ManagementCompany(java.lang.String name,
            java.lang.String taxID,
            double mgmFee,
            int x,
            int y,
            int width,
            int depth) {
            this.properties = new Property[MAX_PROPERTY];
            this.name = name;
            this.taxID = taxID;
            this.mgmFeePer = mgmFee;
            this.plot = new Plot(x, y, width, depth);
          }

  public ManagementCompany(ManagementCompany otherCompany) {
        this.properties = new Property[MAX_PROPERTY];
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFeePer = otherCompany.mgmFeePer;
        this.plot = otherCompany.plot;
        properties = new Property[MAX_PROPERTY];
      }

public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}
public int addProperty(Property property) {
	int prop = 0;
	Plot p = new Plot();
	for (int x=0; x < properties.length; x++) {
        if (properties.length >= this.MAX_PROPERTY) {
        	prop= -1;
        }
        else if (property == null)   {                       
        prop = -2;
        
    }
        else if (p.overlaps(properties[x].getPlot())){
        prop = -4;
        }
        else if (p.encompasses(properties[x].getPlot())){
            prop = -4;
            }

        else
    for (int i = 0 ; i < properties.length; i++) {          
        if (properties[i] == null) {                        
          return i;                                          
        }
       
    }
                                                                    
}
	return prop;
}
public int addProperty(String name,String city,double rent,String owner) {
	int prop = 0;
	Plot p = new Plot();
	Property god = new Property(name, city, rent, owner);
	for (int x=0; x < properties.length; x++) {
        if (properties.length >= this.MAX_PROPERTY) {
        	prop= -1;
        }
        else if (god == null)   {                       
        prop = -2;
        
    }
        else if (p.overlaps(properties[x].getPlot())){
        prop = -4;
        }
        else if (p.encompasses(properties[x].getPlot())){
            prop = -4;
            }

        else
    for (int i = 0 ; i < properties.length; i++) {          
        if (properties[i] == null) {                        
          return i;                                          
        }
       
    }
                                                                    
}
	return prop;
}
public int addProperty(String name,String city,double rent,String owner,int x,int y,int width,int depth) {
	int prop = 0;
	Plot p = new Plot();
	Property god = new Property(name, city, rent, owner, x,y,width,depth);
	for ( x=0; x < properties.length; x++) {
        if (properties.length >= this.MAX_PROPERTY) {
        	prop= -1;
        }
        else if (god == null)   {                       
        prop = -2;
        
    }
        else if (p.overlaps(properties[x].getPlot())){
        prop = -4;
        }
        else if (p.encompasses(properties[x].getPlot())){
            prop = -4;
            }

        else
    for (int i = 0 ; i < properties.length; i++) {          
        if (properties[i] == null) {                        
          return i;                                          
        }
       
    }
                                                                    
}
	return prop;
}
public double totalRent() {
	 int i;
Property sup = new Property();
	for ( i = 0; i < properties.length; i++) {
		properties[i] = sup;
		i+= properties[i].getRentAmount();
	}
	return i;
	}
public double maxRentProp() {
Property supg1 = new Property();
double toprenter = 0; 
	for (int k= 0; k< properties.length;k++){
		properties[k] = supg1; 
	if (properties[k].getRentAmount() >this.maxRentProp()){
			toprenter = properties[k].getRentAmount();}
}
	return toprenter;
}

private int maxRentPropertyIndex(){
	Property prop = new Property();

	int dex = 0;
	for (int k= 0; k <properties.length;k++) {
		properties[k] = prop;
		if (properties[k].getRentAmount()>this.maxRentPropertyIndex()){
dex = k; 
		}}
	return dex;
}

private java.lang.String displayPropertyAtIndex(int i) {
String supg = properties[i].toString();
	return supg;
}
@Override
public String toString() {
	Property god = new Property();
    String s = "";
    s += "List of the properties for Alliance" + ", TaxID: " + this.taxID;
    for (int i = 0; i < this.properties.length; i++) {
        if (this.properties[i] == null) {
            continue;
        }
 
    }
    s += "total management Fee: " + (this.totalRent() * (this.mgmFeePer * 0.01));
    return s;
}

public Plot getPlot() {
	// TODO Auto-generated method stub
	return null;
}
}


