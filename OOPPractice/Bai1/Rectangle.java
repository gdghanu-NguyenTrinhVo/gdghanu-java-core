package OOPPractice.Bai1;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width){
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Input must be positive");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.width = width;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    public double getArea(){
        return width*length;
    }

    @Override
    public String toString() {
        return String.format("Length: %.2f\nWidth: %.2f\nPerimeter: %.2f\nArea: %.2f",length,width,getPerimeter(),getArea());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter width: ");
            double width = sc.nextDouble();
            System.out.println("Enter length: ");
            double length = sc.nextDouble();
            Rectangle r1 = new Rectangle(length, width);
            System.out.println(r1.toString());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
    }
}
