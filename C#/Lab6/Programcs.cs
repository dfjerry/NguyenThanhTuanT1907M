using System;

namespace Demo.Lab6
{
    public delegate int Calcul(int a, int b);
    public class Programcs
    {
        public static void Main(string[] args)
        {
            int choose = 0;
            do
            {
                Console.WriteLine("1. Add");
                Console.WriteLine("2. Sub");
                Console.WriteLine("3. Mul");
                Console.WriteLine("4. Div");
                Console.WriteLine("5. Exit");
                Console.WriteLine("==============");
                Console.WriteLine("Choose your option: ");
                choose = Convert.ToInt32(Console.ReadLine());
                switch (choose)
                {
                    case 1:
                        Calcul add = new Calcul(Calculate.Add);
                        Console.WriteLine("Nhap lan luot a va b: ");
                        add(Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()));
                        break;
                    case 2:
                        Calcul sub = new Calcul(Calculate.Sub);
                        Console.WriteLine("Nhap lan luot a va b: ");
                        sub(Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()));
                        break;
                    case 3:
                        Calcul mul = new Calcul(Calculate.Mul);
                        Console.WriteLine("Nhap lan luot a va b: ");
                        mul(Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()));
                        break;
                    case 4:
                        Calcul div = new Calcul(Calculate.Div);
                        Console.WriteLine("Nhap lan luot a va b: ");
                        div(Convert.ToInt32(Console.ReadLine()), Convert.ToInt32(Console.ReadLine()));
                        break;
                    case 5:
                        Console.WriteLine("Exit!!!");
                        break;
                    default:
                        Console.WriteLine("Choose wrong!!!");
                        break;
                }
            } while (choose != 5);

        }
    }
}