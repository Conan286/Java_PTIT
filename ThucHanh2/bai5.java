
import java.io.*;
import java.math.*;
import java.util.*;

class Rectange {

    private double width, height;
    private String color;

    public Rectange() {
        this.width = 1;
        this.height = 1;
    }

    public Rectange(double w, double h, String c) {
        this.width = w;
        this.height = h;
        this.color = c;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        String ch = color;
        ch = ch.toLowerCase();
        char x = ch.charAt(0);
        x = (char) (x - 32);
        ch = x + ch.substring(1);
        color = ch;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }

    public double findPerimeter() {
        return 2 * (width + height);
    }

    public boolean check() {
        return (width > 0 && height > 0) ? true : false;
    }
}

public class bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectange a = new Rectange(sc.nextDouble(), sc.nextDouble(), sc.next());
        if (a.check()) {
            System.out.printf("%.0f %.0f %s\n", a.findPerimeter(), a.findArea(), a.getColor());
        } else {
            System.out.println("INVALID");
        }
    }
}
