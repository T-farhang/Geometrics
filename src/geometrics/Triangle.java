/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometrics;

/**
 *
 * @author Totia
 */
public class Triangle extends SimpleGeometric {

    private double height;
    private double width;
    private double side;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Triangle(double width, double height, String color, String name) {
        this.width = width;
        this.height = height;
        setColor(color);
        setName(name);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (width * height) / 2;
    }

    public double getPerimeter(double s1, double s2, double s3) {
        return (s1 + s2 + s3);
    }

    public void name() {
        System.out.print("Triangle");
    }

    @Override
    public String toString() {
        return "Triangle : " + this.getName() + " , width= " + width + ", height=" + height + " and area is " + this.getArea();
    }

}
