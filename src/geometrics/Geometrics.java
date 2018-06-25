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
public class Geometrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", "circle");
        Rectangle rectangle = new Rectangle(3, 2, "black", "rectangle");
        Cube cube1 = new Cube(2, "red", "cube1");
        Cube cube2 = new Cube(5, "black", "cube2");
        areaComparison(circle, rectangle);
        areaComparison(cube1, cube2);
    }

    public static <E extends SimpleGeometric> void areaComparison(E object1, E object2) {
        System.out.println(object1);
        System.out.println(object2);
        if (object1.getArea() > object2.getArea()) {
            System.out.println(String.format("%s area is greater.", object1.getName()));
        } else if (object2.getArea() > object1.getArea()) {
            System.out.println(String.format("%s area is greater.", object2.getName()));
        } else {
            System.out.println(object1.getName() + " is equalt to " + object2.getName() + " area.");
        }
    }
}
