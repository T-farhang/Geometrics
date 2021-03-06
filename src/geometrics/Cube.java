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
public class Cube extends SimpleGeometric {

    private double side;

    public Cube() {
    }

    public Cube(double side) {
        this.side = side;
    }

    public Cube(double side, String color, String name) {
        setColor(color);
        setName(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return 4 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube :" + this.getName() + ", side = " + side + " and area is " + this.getArea();
    }

}
