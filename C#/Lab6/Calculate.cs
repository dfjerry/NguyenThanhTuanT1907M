using System;

namespace Demo.Lab6
{
    public class Calculate
    {
        public static int Add(int a, int b)
        {
            Console.WriteLine("Tong: " + a+b);
            return a + b;
        }
        public static int Sub(int a, int b)
        {
            Console.WriteLine("Hieu: " + (a - b));
            return a - b;
        }
        public static int Mul(int a, int b)
        {
            Console.WriteLine("Tich: " + a*b);
            return a * b;
        }
        public static int Div(int a, int b)
        {
            Console.WriteLine("Thuong: " + a/b);
            return a / b;
        }
    }
}