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
public abstract class SimpleGeometric<E> {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    private String name;

    protected SimpleGeometric() {
        dateCreated = new java.util.Date();
    }

    protected SimpleGeometric(String color, String name) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and name: " + name;
    }
}
