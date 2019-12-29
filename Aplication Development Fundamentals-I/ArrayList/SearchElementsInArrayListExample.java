/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;
//Tìm kiếm các phần tử

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tuan");
        names.add("Tr Anh");
        names.add("Dat Smile");
        names.add("Thang");
        names.add("Nghia");
        names.add("Phu");
        //Kiểm tra xem ds mảng có chứa phần tử đó không   contains
        System.out.println("Does name array contain \"Phu\": "+names.contains("Phu"));
        //Tìm chỉ mục xuất hiện ĐẦU TIÊN của 1 phần tử trong ds mảng (indexOf)
        System.out.println("indexOf \"Tr Anh\": "+names.indexOf("Tr Anh"));
        System.out.println("indexOf \"Thang\": "+names.indexOf("Nghia"));
        //Tìm chỉ mục xuất hiện CUỐI của 1 phần tử trong ds mảng (indexOf)
        System.out.println("LastIndexOf \"Dat Smile\": "+names.lastIndexOf("Dat Smile"));
        System.out.println("LastIndexOf \"Phu\": "+names.lastIndexOf("Phu"));
        
    }
}
