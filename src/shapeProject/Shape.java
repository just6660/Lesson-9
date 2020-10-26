package shapeProject;

import TurtleGraphics.Pen;

//abstract = can't make direct objects from Shape class
abstract public class Shape {

    protected double xPos, yPos;

    public Shape() {
        xPos = 0;
        yPos = 0;
    }

    public Shape(double xp, double yp) {
        xPos = xp;
        yPos = yp;
    }

    //shapes have area but its different for each
    //must declare that fact here
    //must make method abstract
    //abstract method is declared like it is in an interface
    //these must be defined by Child class
    abstract public double area();
    abstract public void draw(Pen p);
    abstract public void stretchBy(double factor);
    abstract public double perimeter();

    //these methods are identical in all shapes
    //so we can provide code here
    //final means children can NOT over-ride these methods 
    final public double getXPos() {
        return xPos;

    }

    final public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    //this should not be final cuz children override this method 
    public String toString() {
        String str = ("(x,y) = (" + xPos + ", " + yPos + ")\n");
        str += "Area: " + area();
        return str;
    }

}
