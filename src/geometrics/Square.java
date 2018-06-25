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
public class Square extends SimpleGeometric {

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, String name) {
        this.side = side;
        setColor(color);
        setName(name);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square : " + this.getName() + " , side= " + side + " and area is " + this.getArea();
    }

}
