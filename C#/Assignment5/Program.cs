using System;

namespace Demo.Assignment5
{
    public class Program
    {
        public static void Main(string[] args)
        {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.insertPhone("Tuan","123123");
            phoneBook.insertPhone("Hien","654654");
            phoneBook.insertPhone("Tung","456456");
            phoneBook.removePhone("Hien"); // delete
            phoneBook.updatePhone("Tung","789789");//update
            phoneBook.show();
            Console.WriteLine("Thong tin search phone");
            phoneBook.searchPhone("Tung");//search
        }
    }
}