package za.ac.wsu.s220128251;

public class Circle {

    private double radius;
    private int x;
    private int y;



    public double calculateArea(){
        return Math.round(Math.PI*Math.pow(radius,2));
    }
    public double calculateCircumference(){
        return  Math.round(2*Math.PI*radius);
    }
    public  double calculateDiameter(){
        return 2*radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    public void setX(int x1){
        x = x1;
    }
    public void setY(int y1){
        y = y1;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getRadius(){
        return radius;
    }
}
