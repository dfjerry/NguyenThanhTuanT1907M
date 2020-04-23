using System;

namespace Demo.ElectricityManage
{
    public class customer
    {
        protected int id;
        protected string name;
        protected DateTime date;
        protected string customers;
        protected int amount;
        protected int price;
        protected int quota;

        public customer()
        {
        }

        public customer(int id, string name, DateTime date, string customers, int amount, int price, int quota)
        {
            this.id = id;
            this.name = name;
            this.date = date;
            this.customers = customers;
            this.amount = amount;
            this.price = price;
            this.quota = quota;
        }

        public double IntoMoney(int new_price)
        {
            if (amount < quota)
            {
                return amount * price;
            }
            else
            {
                return price * quota + (quota - amount) * new_price;
            }
        }
    }
}