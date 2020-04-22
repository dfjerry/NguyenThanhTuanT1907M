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
        protected int id;
        protected string name;
        public double price;
        protected uint qty;
        protected string image;
        protected string desc;
        protected List<string> gallery;

        public Product()
        {
            this.gallery = new List<string>();//dam bao gallery chac chan co o nho
        }

        public Product(int id, string name, double price, uint qty, string image, string desc, List<string> gallery)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
            this.gallery = gallery;
        }

        public void GetInfo()
        {
            Console.WriteLine("id: " +id +"\nname: "+name+"\nprice: "+price+"\nqty: "+qty+"\nimage: "+image+"\n+desc: "+desc);
        }

        public bool CheckStock()
        {
            if (qty > 0) return true;
            return false;
        }

        public bool AddGallery(string image)
        {
            if (gallery.Count >= 10)
            {
                Console.WriteLine("Anh da vuot qua so luong, phai xoa bot di truoc khi them!");
                return false;
            }
            //Console.WriteLine("Nhap link anh: ");
            //string new_image = Console.ReadLine();
            //gallery.Add(new_image);
            gallery.Add(image);
            return true;
        }

        public void DeleteGallery()
        {
            Console.WriteLine("Danh sach anh");
            for (int i = 0; i < gallery.Count; i++)
            {
                Console.WriteLine(i + "." + gallery[i]);
            }
            Console.WriteLine("Chon anh de xoa: ");
            int stt = Convert.ToInt32(Console.ReadLine());
            gallery.RemoveAt(stt);
        }

        public bool DeleteImage(string image)
        {
            return gallery.Remove(image);
        }

        public bool DeleteAt(int number)
        {
            if (number < gallery.Count && number > 0)
            {
                gallery.RemoveAt(number);
                return true;
            }

            return false;
        }
        
    }
}