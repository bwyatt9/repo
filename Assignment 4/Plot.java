
public class Plot extends java.lang.Object{
	private int x;
	private int y;
	private int width;
	private int depth;

public Plot() {
	x=0;
	y=0;
	width=1;
	depth=1;
	
}
public Plot(Plot p) {
	   x = p.getX();
       y = p.y;
       width = p.width;
       depth = p.depth;
}
public Plot(int x, int y, int width, int depth) {
	 this.x = x;
     this.y = y;
     this.width = width;
     this.depth = depth;
 
}
public boolean overlaps(Plot plot) {
	boolean sup = false;
    if (plot.getX()<= this.x + this.width && this.x<= plot.getX() + plot.getWidth()) {
    	sup = true;
    }
    if (this.y< plot.getY() + plot.getDepth() && this.y + this.depth> plot.getY()) {
    	 if (plot.getX()<= this.x + this.width) {
    		 if(this.x <= plot.getX() + plot.getWidth()) {
    			 sup = true; }
    		 }
    	 else
    		 sup = false;
    }
    return sup;
}
public boolean encompasses(Plot plot) {
   boolean x = true;
   return x;
}





public int getX() {
	return x;
}
public void setX(int x) {
	this.x =x ;
}
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}
public void setWidth(int width) {
    this.width = width;
}
public int getWidth() {
    return width;
}
public void setDepth(int depth) {
    this.depth = depth;
}
public int getDepth() {
    return depth;
}
public String toString() {
    return "Upper left: (" + x + "," + y + "); " + "Width: " + width + " Depth: " + depth;
}
}
