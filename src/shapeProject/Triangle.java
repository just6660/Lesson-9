package shapeProject;

import TurtleGraphics.Pen;

public class Triangle extends Shape {
    
    private double x2,x3,y2,y3; 
    
    public Triangle(){
        super();
        x2 = 0;
        x3 = 0;     
        y2 = 0;
        y3 = 0;
    }
    
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        super(x1,y1);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public double area() {
        return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3))/2;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos,yPos);
        p.down();
        p.move(x2,y2);
        p.move(x3,y3);
        p.move(xPos,yPos);
    }

    @Override
    public void stretchBy(double factor) {
        x2 = (x2-xPos) * factor + xPos;
        x3 = (x3-xPos) * factor + xPos;
        y2 = (y2-yPos) * factor + yPos;
        y3 = (y3-yPos) * factor + yPos;
    }

    @Override
    public double perimeter() {
       return Math.sqrt((xPos-x2)*(xPos-x2) + (yPos-y2) * (yPos-y2));
    }
    @Override
    public String toString(){
        String str = "Triangle\n";
        str += ("(x1,y1) = (" + xPos + ", " + yPos + ") " + "(x2,y2) = (" + x2 + ", " + y2 + ") " + "(x3,y3) = (" + x3 + ", " + y3 + ") \n");
        str += "Area: " + area() + "\n";
        str += "Permieter: " + perimeter();
        return str;
        
    }
    @Override
    public void move(double xLoc, double yLoc){
        double oldxPos = xPos;
        double oldyPos = yPos;
        super.move(xLoc,yLoc);
        int xdiff = (int) (xPos - oldxPos);
        int ydiff = (int) (yPos - oldyPos);
        x2 = x2 + xdiff;
        x3 = x3 + xdiff;
        y2 = y2 + ydiff;
        y3 = y3 + ydiff;
        
    }
}
