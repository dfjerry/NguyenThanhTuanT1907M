using System.Collections.Generic;

namespace Demo.Lab3
{
    public class Diamond: Product
    {
        private uint cara;

        public Diamond(int id, string name, double price, uint qty, string image, string desc, List<string> gallery,
            uint cara):base(id, name, price, qty, image, desc, gallery)
        {
            this.cara = cara;
        }

        public bool IsReal(int cara)
        {
            if (cara >= 5)
            {
                return true;
            }

            return false;
        }
    }
}