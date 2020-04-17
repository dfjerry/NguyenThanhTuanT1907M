using System;
using System.Collections;
using System.Collections.Generic;

//giong import java

namespace Demo //package
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            //string str;
            //str = Console.ReadLine();
            //int i;
            //i = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Nhap vao so n: ");
            int n;
            int fb = 0;
            int fb1 = 1;
            int fb2 = 1;
            
            n = Convert.ToInt32(Console.ReadLine());
            while (fb1 + fb2 < n)
            {
                fb = fb1 + fb2;
                fb2 = fb1;
                fb1 = fb;
            }

            Console.WriteLine("So fibonaci gan n nhat: " + fb);

            dynamic x;//kieu du lieu dong
            x = 20; //x la 1 so nguyen
            Console.WriteLine(x+15);//35
            x = "xinchao";
            Console.WriteLine(x+15);
        }

        static void TotalNumber()
        {
            int numberOne = 2;
            int numberTwo;
            if (numberOne > 2)
            {
                numberTwo = 2;
            }
            else
            {
                numberTwo = 1;
            }

            numberTwo = numberOne > 2 ? 2 : 1;
           // switch (ArrayList)
           // {
           //     case true: break;
           //     case false: break;
            //}
            int[] ary = {1, 2, 3};
            foreach (var VARIABLE in ary)
            {
                Console.WriteLine(VARIABLE);
            }
            double[] ary2 = new double[5];
            ary2[0] = 1.112;
            ary2[1] = 2.112;
            ArrayList arrayList = new ArrayList();
            arrayList.Add(1);
            arrayList.Add("hello");
            List<int> list = new List<int>();
            list.Add(5);//them thong thuong cua list
            list[1] = 6;//them kieu chi muc (index)
            for (int i = 0; i < ary2.Length; i++)
            {
                Console.WriteLine(ary2[i]);
            }
            
        }
        
    }
}