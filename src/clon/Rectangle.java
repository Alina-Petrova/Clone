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
public class Rectangle implements Cloneable{
    
    private int high, wigh;
    private Point sxd;

    public Rectangle(int high, int wigh, Point sxd) {
        this.high = high;
        this.wigh = wigh;
        this.sxd = sxd;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWigh() {
        return wigh;
    }

    public void setWigh(int wigh) {
        this.wigh = wigh;
    }

    public Point getSxd() {
        return sxd;
    }

    public void setSxd(Point sxd) {
        this.sxd = sxd;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "high=" + high + ", wigh=" + wigh + ", sxd=" + sxd + '}';
    }

   /* @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }*/
    
 /*@Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle clone = (Rectangle) super.clone();
        clone.setSxd((Point) this.getSxd().clone());
        return clone; 
    }*/
    @Override
    public Rectangle clone() {
        try {
            Rectangle clone = (Rectangle) super.clone();
            clone.sxd = (Point)sxd.clone();
            //clone.setSxd((Point) this.getSxd().clone());
            return clone; 
        } catch(CloneNotSupportedException ex) {
            return null;
        }    
    }
}
