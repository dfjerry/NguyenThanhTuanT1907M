/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Admin
 */
public class UnsafeArrayLisExample {
    //Dong bo hoa quyen truy cap vao arraylist
    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArray = new ArrayList<>();
        unsafeArray.add(1);
        unsafeArray.add(2);
        unsafeArray.add(3);
        //Tao 1 thread pool of size 10
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //Tao ra 1 tac vu Runnable lam tang phan tu cua danh sach mang
        Runnable task = () -> {
        incrementArrayList(unsafeArray);
    };
       for(int i = 0 ;i<100;i++){
           executorService.submit(task);
       } 
       executorService.shutdown();
       executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(unsafeArray);
    }

    private static void incrementArrayList(List<Integer> unsafeArray) {
        for(int i = 0;i<unsafeArray.size();i++){
            Integer value = unsafeArray.get(1);
            unsafeArray.set(1, value + 1);
        }
    }
    
    
}
