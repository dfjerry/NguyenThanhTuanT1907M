
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class FoodList {
    private ArrayList<Food> foodlist;


    public FoodList(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;
    }
    Food food = new Food();

    public FoodList(){
        
    }
    //Show food 
    public void showFood(){
    for(int i=0;i<foodlist.size();i++){
            System.out.println("Food list: ");
            System.out.println(+(i+1)+foodlist.get(i).getFood()
                                +foodlist.get(i).getMoney()
                    +foodlist.get(i).getAmount()
                    +foodlist.get(i).getPayment()
            );
        }
    }
    //Check food
    public void checkFood(){
        String tenmon;
        String SL;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon an gi? ");
        tenmon = sc.next();
        
        for(int i=0;i>foodlist.size();i++){
        if(tenmon.equals(foodlist.get(i).getFood())){
            this.add_food1(tenmon);
        }else{
            this.add_food1(tenmon);
        }
    }
    }
    //Oder food
    public void add_food(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-Moi chon ten mon: ");
        String tenmon = sc.next();
        System.out.println("-So luong muon goi: ");
        int soluong = sc.nextInt();
        food = new Food(tenmon, tenmon, soluong);
        foodlist.add(food);
    }
    public void add_food1(String tenmon){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<foodlist.size();i++){
            food = foodlist.get(i);
            if(food.getFood().equals(tenmon)){
                System.out.println("Moi nhap sl dat: ");
                int sl_moi = sc.nextInt();
                food.setAmount(food.getAmount() + sl_moi);
                foodlist.set(i, food);
            }
        }
    }
    public void delete_food(){
        String tenmon = null;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<foodlist.size();i++){
            food = foodlist.get(i);
            if(food.getFood().equals(tenmon)){
                System.out.println("Moi nhap mon ma ban muon bo: ");
                foodlist.remove(i);
                System.out.println("Da xoa "+ tenmon + "trong menu");
            }else{
                System.out.println("Khong tim thay mon an ma ban da goi ");
            }
        }
    }

    

   
}
