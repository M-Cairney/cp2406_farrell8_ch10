public class DebugCustomer
{
    public int idNumber;
    public String name;
    public double creditLimit;
    public void DebugCustomer(int id, String name, double credit)
    {
       idNumber = id;
       this.name = name;
       credit = credit;
    }
    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
