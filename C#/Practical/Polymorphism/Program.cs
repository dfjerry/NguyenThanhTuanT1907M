namespace Demo.Polymorphism
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Lion lion = new Lion("", 0);
            Tiger tiger = new Tiger("", 0);
            lion.SetMe("lion", 200);
            tiger.SetMe("tiger",100);
            lion.Show();
            tiger.Show();
        }
    }
}