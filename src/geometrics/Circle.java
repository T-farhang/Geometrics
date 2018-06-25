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
public class Circle extends SimpleGeometric {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, String name) {
        this.radius = radius;
        setColor(color);
        setName(name);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated()
                + " and the radius is " + radius);
    }

    @Override
    public String toString() {
        return "Circle : " + this.getName() + " , radius= " + radius + " and area is " + this.getArea();
    }

}
