/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C++");
        programmingLanguages.add("JAVA");
        programmingLanguages.add("JAVASCRIP");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        System.out.println("Initial List: "+programmingLanguages);
        //Xóa chỉ mục thứ 5 của mảng
        programmingLanguages.remove(5);
        System.out.println("After remote(5) "+programmingLanguages);
        //Loại bỏ sự xuất hiện của chỉ định đầu tiên
        //Phương thức xóa bỏ trả về false nếu không  tồn tại phần tử trong mảng
        boolean isRemoved = programmingLanguages.remove("JAVA");
        System.out.println("After remove (\"JAVA\"):    "+programmingLanguages);
        //Loại bỏ tất cả các yếu tố tồn tại trong mảng
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("C++");
        scriptingLanguages.add("Kotlin");
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages) "+programmingLanguages);
        //Xóa bỏ những chuỗi có chữ đầu tiên
        programmingLanguages.removeIf(new Predicate<String>(){
            public boolean test(String s){
                return s.startsWith("J");
            }
        });
        System.out.println("After removing all elements that start with \"J\": "+programmingLanguages);
        //Clear
        programmingLanguages.clear();
        System.out.println("After clear: "+programmingLanguages);
    }
}
