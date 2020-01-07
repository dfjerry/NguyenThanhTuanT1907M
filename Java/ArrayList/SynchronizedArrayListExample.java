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
public class SynchronizedArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        //su dung collections.synchronized de dong bo hoa
        List<Integer> safeArrayList = new ArrayList<>();
        safeArrayList.add(1);
        safeArrayList.add(2);
        safeArrayList.add(3);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable task = () ->{
            incrementArrayList(safeArrayList);
        };
        for(int i = 0 ;i<100;i++){
            executorService.submit(task);
        }
      executorService.shutdown();
      executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(safeArrayList);
    }

    private static void incrementArrayList(List<Integer> safeArrayList) {
        for(int i =0;i<safeArrayList.size();i++){
            Integer value = safeArrayList.get(i);
            safeArrayList.set(i, value + 1);
        }
    }
}
