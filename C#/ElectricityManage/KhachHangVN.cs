namespace Demo.ElectricityManage
{
    public class KhachHangVN: KhachHang
    {
        private string doituong;


        public KhachHangVN(int id, string name, string billDate, int number, string doituong) : base(id, name, billDate, number)
        {
            this.doituong = doituong;
        }

        public string Doituong
        {
            get => doituong;
            set => doituong = value;
        }
    }
}