/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ex87 {
    public void calcResult(int num1, int num2,String choice){
        switch(choice){
            case"+":System.out.println("Result after addition is: "+
                    (num1+num2));
            break;
            case "-":System.out.println("Result after subtraction is:"+
                    (num1-num2));
            break;
            case"*":System.out.println("Result after multiplication is: "+
                    (num1*num2));
            break;
            case"/":System.out.println("Result after division is : "+
                    (num1/num2));
            break;
        }
        
    }
    public static void main(String[] args) {
        if(args.length==2){
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            Ex87 objEx87 = new Ex87();
            objEx87.calcResult(num1, num2, args[2]);
            
        }else{
            System.out.println("Usage: num1 num2 operator");
        }
    }
}
