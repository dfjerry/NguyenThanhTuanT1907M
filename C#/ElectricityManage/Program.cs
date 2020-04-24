using System;
using System.Collections.Generic;

namespace Demo.ElectricityManage
{
    public class Program
    {
        public static void Main(string[] args)
        {
            List<KhachHangVN> listKHVN = new List<KhachHangVN>(); 
            listKHVN.Add(new KhachHangVN(1, "Nguyen Thanh Tung", "01/2019",155, "sinh hoat" ));
            listKHVN.Add(new KhachHangVN(2, "Nguyen Thanh Tuan", "01/2019",122, "sinh hoat" ));
            List<KhachHangNuocNgoai> listKHNN = new List<KhachHangNuocNgoai>();
            listKHNN.Add(new KhachHangNuocNgoai(3, "Alex", "01/2019", 78, "US")); 
            listKHNN.Add(new KhachHangNuocNgoai(4, "Tom", "01/2019", 122, "UK"));
            int totalVN = 0;
            foreach (KhachHangVN x in listKHVN)
            {
                totalVN += x.ThanhTien();
            }

            int totalNN = 0;
            foreach (KhachHangNuocNgoai x in listKHNN)
            {
                totalNN += x.ThanhTien();
            }

            Console.WriteLine("VN" + totalVN);
            Console.WriteLine("NN" + totalNN);
            Console.WriteLine("TRUNG BINH");
            Console.WriteLine("VN" + ((float)totalVN/listKHVN.Count));
            Console.WriteLine("NN" + ((float)totalNN/listKHNN.Count));
            Console.WriteLine("Hoa don thang 1/2019");
            foreach (KhachHangVN x in listKHVN)
            {
                if (x.BillDate.Equals("01/2019"))
                {
                    x.ShowBill();
                }
            }
        }
    }
}