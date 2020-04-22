using System;

namespace Demo.Lab3
{
    public class Fashion: Product
    {
        

        public void checkStock()
        {
            string name;
            string color;
            int size;
            Console.WriteLine("Nhap ten sp muon check: ");
            name = Convert.ToString(Console.ReadLine());
            color = Convert.ToString(Console.ReadLine());
            size = Convert.ToInt32(Console.ReadLine());
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
    }
}