package MethodOverlapping;
import java.math.*;
public class CalculatingArea {
    public static double calcArea(double x){
        double area = Math.pow(x,2);
        return area;
    }
    public static double calcArea(double x, double y){
        double area = x*y;
        return area;
    }
    public static double calcArea(double x, double y, double z){
        double area = 1/2*(x+y)*z;
        return area;
    }
    public static double calcArea(int x, int y){
        double area = 1/2*x*y;
        return area;
    }
    public static void main(String args[]){
        double circle = calcArea(3);//works for the first single parameter
        double rectangle = calcArea(5,4);//Doesn't work for the next two parametrs
        double trapizium = clacArea(2, 6, 5);//Doesn't work since it can't understand which parameters are which
        double triangle = clacArea(8, 10);//Doesn't work since it can't identify what the parameters are

        System.out.println("The area of a circle is : "+ circle);
        System.out.println("The area of the rectangle is : "+ rectangle);
        System.out.println("The area of the trapizium is : "+ trapizium);
        System.out.println("The area of the Triangle is : "+ triangle);
    }
}
