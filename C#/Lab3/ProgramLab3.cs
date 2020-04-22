using System;
using System.Collections.Generic;

namespace Demo.Lab3
{
    public class ProgramLab3
    {
        public static void Main(string[] args)
        {
            Product p1 = new Product(1, "san pham",5, 2, "anh1", "mo ta sp1", new List<string>() );
            p1.AddGallery("anh 2");
            Fashion f1 = new Fashion(2, "quan ao",10, 3, "fashion.jpg", "mo ta fashion1", new List<string>(), "vang", 41);
            Diamond d1 = new Diamond(3, "kim cuong", 100, 1, "kc1.png", "mo ta kc", new List<string>(), 18);
            Cart c1 = new Cart(1, "Nguyen Thanh Tung", 0, new List<Product>(), "Bac Ninh", "Viet Nam");
            c1.AddProduct(p1);//gio hang c1 add sp p1
            c1.AddProduct(f1);
            c1.AddProduct(d1);
            Console.WriteLine("TOng tien phai thanh toan: " + c1.FinalTotal());
            
        }
    }
}