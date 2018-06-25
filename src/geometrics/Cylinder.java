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
public class Cylinder extends SimpleGeometric {

    private double radius;
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double radius, double height, String color, String name) {
        setColor(color);
        setName(name);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * radius * Math.PI * height;
    }

    public double getVolume() {
        return radius * radius * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder : " + this.getName() + " ,radius= " + radius + ", height=" + height + " and area is " + this.getArea();
    }

}
