package Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ass1 {
    public static void main(Ass2[] args) {
        int [] Array1 = new int[2];
        int [] Array2 = {1,2,3,4,5,6,10,0,95,1};
//        System.out.println("Array1 "+Array1);
//        for(int i=5;i>0;i--){
//            System.out.println("Array2: "+i);
//        }
//        for(int i: Array1){
//            System.out.println(i);
//        }
//        for(int i=0; i<Array2.length;i++){
//            Array2[i]=i;
//             System.out.printf("Array2[%d] = %d\n",i,Array2[i]);
//        }
//        for(int i: Array2){
//            System.out.println(i);
//        }
        int max = Array2[0];
        int min = Array2[0];
        int sum = 0;
        int avg = 0;
       for(int i=0;i<Array2.length;i++){
           if(max<Array2[i]){
               max=Array2[i];
           }
           if(min>Array2[i]){
                min = Array2[i];
            }
           sum += Array2[i];
       }
       avg = sum/Array2.length;
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
        
    }
}
