/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ss5 {
    public static void main(String[] args) {
        //Code snippet 1
//            int num = 1;
//            int product = 0;
//            while (num<5) {            
//                product = num * 10;
//                System.out.printf("\n %d * 10 = %d", num, product);
//                num++;
//            }
//            System.out.println("\n Outside the Loop");
        //Code snippet 2
//            int num1 = 1;
//            int num2 = 30;
//            while (++num1<--num2) {            
//                System.out.println("Midpoint it: "+num1);
//            }
        //Code snippet 3
//        while (true) {            
//            System.out.println("Welcome ti Loops...");
//        }
        //Code snippet 4
//        int num = 1, sum = 0;
//        do{
//            sum = sum + num;
//            num++;
//        }while(num<=10);
//        System.out.printf("Sum of 10 Numbers: %d\n",sum);
        //Code snippet 5
//        int num, product;
//        for(num=1;num<=5;num++){
//            product = num*10;
//            System.out.printf("\n %d * 10 = %d",num,product);
//        }
        //Code snippet 6
//        int product;
//        for(int num=1;num<=5;num++){
//            product = num*10;
//            System.out.printf("\n %d*10 = %d",num,product);
//        }
        //Code snippet 7
//        int i,j;
//        int max = 10;
//        for(i=0,j=max;o<=max;i++,j--){
//            System.out.printf("\n %d + %d = %d",i,j,i+j);
//        }
           //Code snippet 8
//          int num =1;
//          boolean flag = false;
//          for(;!flag;num++){
//              System.out.println("Value of num: "+num);
//              if(num==5){
//                  flag=true;
//              }
//          }
            //Code snippet 9
//            for(;;){
//                System.out.println("This will go on and on");
//            }
            //Code snippet 10
//            int row,col;
//            for(row=1;row<=5;row++){
//                for(col = 1; col<=row;col++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            //Code snippet 11
//            int cnt,number;
//            for(cnt=1,number=0;cnt<=10;cnt++){
//                Scanner input = new Scanner(System.in);
//                System.out.printf("ENter a number: ");
//                number = input.nextInt();
//                if (number==0) {
//                    break;
//                }
//            }
              //Code snippet 12
//              int cnt, square, cube;
//              for(cnt=1;cnt<10;cnt++){
//                  if(cnt%3==0){
//                      continue;
//                  }
//                  square = cnt * cnt;
//                  cube = cnt * cnt * cnt;
//                  System.out.printf("\nSquare of %d is %d and Cube is %d",cnt,square,cube);
//              }
                //Code snippet 13
//                int i;
//                outer:
//                for(i = 0;i<10;i++){
//                    if(i==5){
//                        System.out.println("Hello");
//                        break outer;
//                    }
//                    System.out.println("This is the outer loop.");
//                }
                  //Code snippet 14
//                  tuan:
//                  for(int i=0;i<5;i++){
//                      for(int j=1;j<5;j++){
//                      if(j>i){
//                          System.out.print("\n");
//                          continue tuan;
//                      }
//                          System.out.print(j);
//                       }
//                      System.out.println("\n This is tuan loop.");
//                  }
//                  System.out.println("Het");

                    //Try it yourself
                    
                    //Assignment1
                    
//                    int a=3;
//                    if(a>=0){
//                        if(a==0){
//                            System.out.println("1");
//                        }else{
//                            System.out.print("2");
//                        }
//                        System.out.println("3");
//                    }// Ket qua in ra la : 23;

                    //Assignment2
                    
//                    String c = null;
//                    String b="yes";
//                    String d="no";
//                    Scanner a = new Scanner(System.in);
//                    System.out.println("Chao mung ban den voi ngon ngu lap trinh JAVA");
//                    System.out.println("Ban co muon di tiep, dien yes or no!");        
//                    do {            
//            c = a.nextLine();
//        } while (c==d||c==b);
//                    System.out.println("Welcome!");

                   //Assignment3
                   
//                   int a ;
//                   Scanner b = new Scanner(System.in);
//                   System.out.println("Nhap vao so muon kiem tra: ");
//                   a = b.nextInt();
//                   for(int i=2; i<=a;i++){
//                       int dem = 0;
//                       for(int j=2;j<i;j++){
//                           if(i%j==0){
//                               dem+=1;
//                           }
//                       }
//                       if(dem<=1){
//                       System.out.println(i);
//                   }
//                   }

                   //Assignment4
                   
//                   int a,c,tong = 0;
//                   System.out.println("Nhap so can tinh tong cac so cong lai");
//                   Scanner b = new Scanner(System.in);
//                   a = b.nextInt();
//                   while (a!=0) {            
//                   c = a%10;
//                   a=a/10;
//                   tong+=c;
//        }       System.out.println("Tong cac so cong lai la: ");
//                   System.out.println(tong);
}

                   
}
