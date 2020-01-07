/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RacingCar;

/**
 *
 * @author Admin
 */
public class Car {
    
    private String name;
    
    private float speed;
    
    private int x;

    private int y;

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Set the value of y
     *
     * @param y new value of y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Set the value of x
     *
     * @param x new value of x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Get the value of speed
     *
     * @return the value of speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Set the value of speed
     *
     * @param speed new value of speed
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }


    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", speed=" + speed + "m/s, x=" + x + ", y=" + y + "}";
    }

    void getSpeed(double random) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void xephangSpeed(){
        
    }
   
    
    
   
}
