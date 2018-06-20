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

    public Cube(double side, String color, boolean filled) {
        setColor(color);
        setFilled(filled);
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

    public void name() {
        String[] n = new String[2];
        System.out.print("Cube");
    }

    @Override
    public String toString() {
        return "Cube : " + "side= " + side + " and area is " + this.getArea();
    }

}
