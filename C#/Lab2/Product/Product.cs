using System;
using System.Linq;
using System.Net.Http;
using System.Net.Mime;

namespace Demo
{
    public class Product
    {
        public int id;
        public string name;
        public double price;
        public int qty;
        public string image;
        public string desc;
        string[] gallery = new string[9];

        public Product()
        {
        }

        public Product(int id, string name, double price, int qty, string image, string desc)
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
            Console.WriteLine("id: " +id +"\nname: "+name+"\nprice: "+price+"\nqty: "+qty+"\nimage: "+image+"\n+desc: "+desc);
        }

        public void checkQty()
        {
            if (qty > 0 )
            {
                Console.WriteLine("Con hang");
            }

            Console.WriteLine("Het hang");
        }

        public void addGallery()
        {
            var newArray = Convert.ToString(Console.ReadLine());
            if (gallery.Length > 10)
            {
                Console.WriteLine("xoa anh truoc khi them");
                deleteGallery();
            }
            else
            {
                for (int i = 0; i < gallery.Length; i++)
                {
                    gallery[i] = Convert.ToString(Console.ReadLine());
                }
            }
        }

        public void deleteGallery()
        {
            Console.WriteLine("Chon gallery muon xoa: ");
            var strInput = Console.ReadLine();
            for (int i = 0; i < gallery.Length; i++)
            {
                Console.WriteLine(gallery[i]);
            }
        }
        
    }
}