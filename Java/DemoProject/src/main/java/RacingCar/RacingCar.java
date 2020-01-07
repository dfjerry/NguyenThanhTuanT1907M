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

class RacingCar {
     public static void main(String[] args) {
        Car a = new Car();
        Car b = new Car();
        Car c = new Car();
        a.setName("Car1");
        b.setName("Car2");
        c.setName("Car3");
        a.setSpeed((float) Math.random()*100);
        b.setSpeed((float) Math.random()*100);
        c.setSpeed((float) Math.random()*100);
//         System.out.println("Speed Car 1 = "+a.getSpeed()+"m/s");
//         System.out.println("Speed Car 2 = "+b.getSpeed()+"m/s");
//         System.out.println("Speed Car 3 = "+c.getSpeed()+"m/s");
        if(a.getSpeed()>b.getSpeed()&& a.getSpeed()>c.getSpeed()){
            System.out.println("Car max speed is Car1, speed = "+a.toString() );
            if(b.getSpeed()>c.getSpeed()){
                System.out.println("Car 2nd speed "+b.toString());
                System.out.println("Car 3nd speed "+c.toString());
            }else{
                System.out.println("Car 2nd speed "+c.toString());
                System.out.println("Car 3nd speed "+b.toString());
            }
        }else 
            if(b.getSpeed()>a.getSpeed()&&b.getSpeed()>c.getSpeed()){
                System.out.println("Car max speed is Car 2, speed = "+b.toString());
                if(a.getSpeed()>c.getSpeed()){
                System.out.println("Car 2nd speed "+a.toString());
                System.out.println("Car 3nd speed "+c.toString());
            }else{
                System.out.println("Car 2nd speed "+c.toString());
                System.out.println("Car 3nd speed "+a.toString());
            }
        }else 
                if(c.getSpeed()>a.getSpeed()&&c.getSpeed()>b.getSpeed()){
                    System.out.println("Car max speed is Car 3, speed = "+c.toString());
                    if(a.getSpeed()>b.getSpeed()){
                System.out.println("Car 2nd speed "+a.toString());
                System.out.println("Car 3nd speed "+b.toString());
            }else{
                System.out.println("Car 2nd speed "+b.toString());
                System.out.println("Car 3nd speed "+a.toString());
            }
                }
    }

}
