﻿using System.Collections.Generic;

namespace Demo.Lab3
{
    public class Cart: Product
    {
        private int id;
        private string customer;
        private double grandTotal;
        private List<Product> listProduct;
        private string city;
        private string country;

        public Cart(int id, string customer, double grandTotal, List<Product> listProduct, string city, string country)
        {
            this.id = id;
            this.customer = customer;
            this.grandTotal = grandTotal;
            this.listProduct = listProduct;
            this.city = city;
            this.country = country;
        }

        public bool AddProduct(Product product)
        {
            listProduct.Add(product);
            //thieu them tien trong grandtotal
            return true;
        }

        public bool RemoveProduct(Product product)
        {
            //thieu tru tien trong grandtotal
            return listProduct.Remove(product);
        }

        public double FinalTotal()
        {
            double grand = 0;
            foreach (Product p in listProduct)
            {
                grand += p.price;
            }

            grand += ShippingFee(grand);
            
            this.grandTotal = grand;
            return grandTotal;
        }

        public double ShippingFee(double grand)
        {
            if (country.Equals("VN") && (city.Equals("HN") || (city.Equals("HCM"))))
            {
                return grand *0.01;
            }if (country.Equals("VN"))
            {
                return grand *0.02;
            }
            return grand *0.05;    
        }
    }
}