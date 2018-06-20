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
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 2);
        Cube cube1 = new Cube(2);
        Cube cube2 = new Cube(5);
        areaComparison(circle, rectangle);
        areaComparison(cube1, cube2);
    }

    public static <E extends SimpleGeometric> void areaComparison(E object1, E object2) {
        System.out.println(object1);
        System.out.println(object2);
        if (object1.getArea() > object2.getArea()) {
            object1.name();
            System.out.println(" area is greater.");
        } else if (object2.getArea() > object1.getArea()) {
            object2.name();
            System.out.println(" area is greater.");
        } else {
            System.out.println(object1 + " is equalt to " + object2 + " area.");
        }
    }
}
