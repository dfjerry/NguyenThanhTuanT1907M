/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWord;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ss4 {
     enum Cards{
            Spade, Heart, Diamond, Club
        }
    public static void main(String[] args) {
        //Code snippet 1
        int first = 400, second = 700, result;
        result = first + second;
        if(result>100){
            second = second + 100;
        }
        System.out.println("The value of second is:" +second);
        //Code snippet 2
         if(result>100){
            second = second + 100;
            System.out.println("The value of second is:" +second);
        }
        //Code snippet 3
        int number = 11, remainder;
        remainder = number % 2;
        if(remainder ==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
        //Code snippet 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = input.nextInt();
        if(num%3==0){
            System.out.println("Inside Outer if Block");
        if(num%5==0){
            System.out.println("Number is divisible by 3 and 5");
        }else{
            System.out.println("Number is divisible by 3, but not by 5");
        }
        }else{
            System.out.println("Number is not divisible by 3");
        }
        //Code snippet 5
        int totalMarks = 59;
        if(totalMarks>=90){
            System.out.println("Grade = A+");
        }else if(totalMarks>=60){
            System.out.println("Grade=A");
        }else if(totalMarks>=40){
            System.out.println("Grade=B");
        }else if(totalMarks>=30){
            System.out.println("Grade=C");
        }else{
            System.out.println("Fail");
        }
        //Code snippet 6
        int choice = 3;
        switch (choice){
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;   
        default:
                System.out.println("InvalidChoice");
    }
        //Code snippet 7
        int month = 5;
        int year = 2001;
        int numDays = 0;
        switch (month){
            case 1:
                        case 3:
                            case 5:
                                case 8:
                                        case 12:
                                            numDays = 31;
                                            break;
                                        case 4:
                                        case 6:
                                        case 9:
                                        case 11:
                                            numDays = 30;
                                            break;
                                        case 2:
                                            if(year % 4 == 0){
                                                numDays = 29;
                                            }else{
                                                numDays = 28;
                                            }
                                            break;
                                        default:
                                            System.out.println("InvalidMonth");
                                            System.out.println("Month: "+month);
                                            System.out.println("Number of Days: "+numDays);
        //Code snippet 8                            
        String day = "Monday";
        switch(day){
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Second Day of the Week");
                break;
            case "Tuesday":
                System.out.println("Third Day of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourth Day of the Week");
                break;
            case "Thursday":
                System.out.println("Fifth Day of the Week");
                break;
            case "Saturday":
                System.out.println("Sixth Day of the Week");
                break;
            default:
                System.out.println("Invalid Day");
        }
        }
        //Code snippet 9
        Cards card = Cards.Diamond;
        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
                
        }
        //Code snippet 10
        String day1 = "Monday";
        String hour = "am";
        switch (day1){
            case "Sunday":
                System.out.println("Sunday í a Holiday...");
                switch (hour){
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            case "Monday":
                System.out.println("Monday is a Working Day...");
                 switch (hour){
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            default: System.out.println("InvalidDay");
            
        }
    }
}
