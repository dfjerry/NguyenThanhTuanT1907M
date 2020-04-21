using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Mime;

namespace Demo
{
    public class Product
    {
        public int id;
        public string name;
        public int price;
        public int qty;
        public string image;
        public string desc;
        public List<String> gallery = new List<string>();
        public List<Product> Products = new List<Product>();
        public Product()
        {
        }

        public Product(int id, string name, int price, int qty, string image, string desc)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
        }

        public void getInfo()
        {
            Console.WriteLine("Product list: ");
            foreach (Product product in Products)
            {
                Console.WriteLine("id: " +id +"\nname: "+name+"\nprice: "+price+"\nqty: "+qty+"\nimage: "+image+"\n+desc: "+desc);
            }
        }

        public void addProduct(Product product)
        {
            Products.Add(product);
        }
        public void checkStock()
        {
            string name;
            Console.WriteLine("Nhap ten sp muon check: ");
            name = Convert.ToString(Console.ReadLine());
            foreach (Product product in Products)
            {
                if (name.Equals(product.name))
                {
                    if (product.qty > 0 )
                    {
                        Console.WriteLine("Con hang");
                    }

                    Console.WriteLine("Het hang");
                }
            }
            
        }

        public void addGallery()
        {
            if (gallery.Count < 10)
            {
                foreach (Product product in Products)
                {
                    gallery.Add(image);
                }

                Console.WriteLine("Add success");
                Console.WriteLine("Gallery list: ");
                foreach (var gallery in gallery)
                {
                    Console.WriteLine(gallery);
                }
            }
            else
            {
                Console.WriteLine("vuot qua so luong anh can xoa bot");
                deleteGallery();
            }
        }

        public void deleteGallery()
        {
            Console.WriteLine("Gallery list: ");
            foreach (var gallery in gallery)
            {
                Console.WriteLine(gallery);
            }

            int index;
            Console.WriteLine("Nhap vao anh muon xoa");
            index = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < gallery.Count; i++)
            {
                if (i == index)
                {
                    gallery.RemoveAt(index-1);
                    Console.WriteLine("Xoa thanh cong");
                }
            }
        }
        
    }
}