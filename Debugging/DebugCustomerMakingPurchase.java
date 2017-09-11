public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;
    private double credit;
    public void FixDebugCustomerMakingPurchase(int id,
       String name, double credit, double purchAmount)
    {
       super.name = name;
        super.creditLimit = credit;
        super.idNumber = id;
        amountOfPurchase = purchAmount;
       if(amountOfPurchase > creditLimit)
          overLimit = true;
       else
          overLimit = false;
    }
    @Override
    public void display()
    {
       super.display();
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
