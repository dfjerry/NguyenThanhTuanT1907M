using System;
using System.Threading;

namespace Demo.Session8
{
    public class Lab8
    {
        public static void Main(string[] args)
        {
            Thread t1 = new Thread(ThreadRun);
            t1.Start(15);//truyen vao 15p
        }

        public static void ThreadRun(object o)
        {
            int n = (int) o;
            for (int i = n-1; i >= 0; i--)
            {
                for (int j = 59; j >= 0; j--)
                {
                    Console.WriteLine(i.ToString("D2")+ ":"+j.ToString("D2"));//number format 01 02 in c#
                    Thread.Sleep(10);
                }
            }

            Console.WriteLine("Boom!!!");
        }

        
    }
}