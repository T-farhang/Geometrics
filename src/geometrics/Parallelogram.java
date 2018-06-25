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
public class Parallelogram extends SimpleGeometric {

    private double height;
    private double width;
    private double side;

    public Parallelogram() {
    }

    public Parallelogram(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Parallelogram(double width, double height, String color, String name) {
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
        return (width * height);
    }

    public double getPerimeter(double s1, double s2) {
        return (s1 + s2) * 2;
    }

    @Override
    public String toString() {
        return "Parallelgram : " + this.getName() + " , width= " + width + ", height=" + height + " and area is " + this.getArea();
    }

}
