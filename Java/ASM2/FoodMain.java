
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
public class FoodMain {

    public static void main(String[] args) {
        int choose;
        FoodList foodlist = new FoodList();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Xem menu ");
            System.out.println("2. Them mon an");
            System.out.println("3. Xoa mon an");
            System.out.println("0. Ket thuc dat hang ");
            System.out.println("Chon: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    foodlist.showFood();
                    break;
                case 2:
                    foodlist.add_food1("thit ga");
                case 3:
                    foodlist.delete_food();
                case 0:
                    System.out.println("Ket thuc dat hang");
                    break;
            }
        } while (choose != 0);
    }
}
