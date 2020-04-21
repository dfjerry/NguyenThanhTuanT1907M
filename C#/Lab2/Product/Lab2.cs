﻿using System;

namespace Demo
{
    public class Lab2
    {
        public static void Main(string[] args)
        {
            Product pd1 = new Product();
            int choice, id, qty, price;
            string name, image, desc;
            do
            {
                 Console.WriteLine("1: Add product:");
                 Console.WriteLine("2: Get Info:");
                 Console.WriteLine("3: Check Stock: ");
                 Console.WriteLine("4: Add gallery");
                 Console.WriteLine("5: Remove gallery");
                 Console.WriteLine("6: Exit");
                 Console.WriteLine("=================");
                 Console.WriteLine("Enter choice:");
                 choice = Convert.ToInt32(Console.ReadLine());
                 switch (choice)
                 {
                     case 1:
                         Console.WriteLine("Enter id: ");
                         id = Convert.ToInt32(Console.ReadLine());
                         Console.WriteLine("Enter name:");
                         name = Convert.ToString(Console.ReadLine());
                         Console.WriteLine("Enter price:");
                         price = Convert.ToInt32(Console.ReadLine());
                         Console.WriteLine("Enter qty:");
                         qty = Convert.ToInt32(Console.ReadLine());
                         Console.WriteLine("Enter image:");
                         image = Convert.ToString(Console.ReadLine());
                         Console.WriteLine("Enter desc:");
                         desc = Convert.ToString(Console.ReadLine());
                         pd1.addProduct(new Product(id, name, price, qty, image, desc));
                         break;
                     case 2:
                         p1.getInfo();;
                         break;
                     case 3: 
                         p1.checkStock();
                         break;
                     case 4: 
                         p1.addGallery();
                         break;
                     case 5:
                         p1.removeGallery();
                         break;
                     case 6: 
                         Environment.Exit(0);
                         break;
                     default:
                         Console.WriteLine("Wrong choice please choice 1-6!");
                         break;
                 }
            } while (choice != 6);
        }
    }
}