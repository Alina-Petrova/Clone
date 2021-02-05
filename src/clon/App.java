/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clon;

/**
 *
 * @author utente
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Point p1 = new Point(0,1);
        
        Rectangle r1 = new Rectangle(5, 15, p1);
        
        Rectangle r2 = (Rectangle) r1.clone();
        
        
        System.out.println("-------Profonda---------");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("-------Cambio sxd r1---------");
        r1.getSxd().move(20, 30);
        System.out.println(r1);
        System.out.println(r2);
        
    }
    
}
