package shapeProject;

import TurtleGraphics.Pen;

public class Rect extends Shape {
    
    private double width, height; 
    
    public Rect(){
        super();
        width = 1;
        height = 1;
    }
    public Rect(double x, double y, double w, double h){
        super(x,y); //calls Shape (parent) constructor
        width = w;
        height = h;
    }
    @Override
    public double area() {
        return width*height;
    }
    
    public double perimeter(){
        return width * 2 + height * 2;
    }

    @Override
    public void draw(Pen p) {
       p.up();
       p.move(xPos,yPos);
       p.down();
       p.setDirection(0);//points to right
       p.move(width);
       p.turn(-90);//right
       p.move(height);
       p.turn(-90);
       p.move(width);
       p.turn(-90);
       p.move(height);
    }
    
    @Override
    public void stretchBy(double factor) {
        width*=factor;
        height*=factor;
    }
    
    @Override
    public String toString(){
        String str = "RECTANGLE\n";
        str += "Width x Height: " + width + " x " + height + "\n";
        str+= super.toString() + "\n";
        str+= "Perimeter: " + perimeter();
        return str;
    }

  

}
