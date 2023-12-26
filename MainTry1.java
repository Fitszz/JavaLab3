import java.util.Scanner;

class Bank
{
    private long accnum;

    public Bank (long accnum)
    {
        this.accnum = accnum;
    }

    public long getAccnum()
    {
        return accnum;
    }

    public void setAccnum(long accnum)
    {
        this.accnum = accnum;
    }

}

class Customer extends Bank
{
    private String name;

    public Customer(long accnum,String name)
    {
        super (accnum);
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

class Deposit extends Bank
{
    private double payment;

    public Deposit(long accnum,double payment)
    {
        super(accnum);
        this.payment = payment;
    }

    public double getPayment()
    {
        return payment;
    }

    public void setPayment(double payment)
    {
        this.payment = payment;
    }
}

class MainTry1
{
    public static void main(String[]args)
    {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String a = Scanner.nextLine();

        System.out.print("Enter your number Acc : ");
        long b = Scanner.nextLong();

        System.out.print("Enter your payment : ");
        double c = Scanner.nextDouble();


        Customer x = new Customer (b,a);
        Deposit y = new Deposit (b,c);

        System.out.println("--------------------------------------");
        System.out.println("\t\tMAYBANK BERHAD");
        System.out.println("--------------------------------------");

        System.out.println("Acc no is : " + x.getAccnum());
        System.out.println("Customer name is : " + x.getName());
        System.out.println("Payment is : RM " + y.getPayment());
    }
}
