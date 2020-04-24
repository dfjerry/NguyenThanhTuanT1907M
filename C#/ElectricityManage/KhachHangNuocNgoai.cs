namespace Demo.ElectricityManage
{
    public class KhachHangNuocNgoai: KhachHang
    {
        private string quoctich;

        public KhachHangNuocNgoai(int id, string name, string billDate, int number, string quoctich) : base(id, name, billDate, number)
        {
            this.quoctich = quoctich;
        }

        public string Quoctich
        {
            get => quoctich;
            set => quoctich = value;
        }

        public override int ThanhTien()
        {
            return Number * 2000;
        }
    }
}