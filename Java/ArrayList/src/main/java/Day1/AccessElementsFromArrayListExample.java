/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        //Check if an ArrayList is empty
        System.out.println("Is the topCOmpanies list empty? "+topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Facebook");
        topCompanies.add("Youtube");
        topCompanies.add("Riot");
        //Tìm kích thước của mảng
        System.out.println("Here are the top "+topCompanies.size()+ " companies in the world");
        System.out.println(topCompanies);
        String bestCompany = topCompanies.get(0);
        String secondCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size()-1);
        System.out.println("Best Company "+bestCompany);
        System.out.println("Second COmpany "+secondCompany);
        System.out.println("Last Company "+lastCompany);
        //Sửa đổi phần tử lại chỉ mục nhất định
        topCompanies.set(3, "Aptech");
        System.out.println("Modifilied top companies list: "+topCompanies);
    }
}
