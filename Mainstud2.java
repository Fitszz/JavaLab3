import java.util.Scanner;

class Bank {
    private long accnum;

    public Bank(long accnum) {
        this.accnum = accnum;
    }

    public long getAcc() {
        return accnum;
    }

}

class Customer extends Bank {
    private String name;

    public Customer(long accnum, String name) {
        super(accnum);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Deposit extends Bank {
    private double payment;

    public Deposit(long accnum, double payment) {
        super(accnum);
        this.payment = payment;
    }

public double getPay() {
    return payment;
    }

public void setPay(double payment) {
    this.payment=payment;
    }
}

public class Mainstud2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Please put in customer name: ");
        String b = obj.nextLine();

        System.out.print("Please put in account number: ");
        long a = obj.nextLong();

        System.out.print("Please put in payment: RM");
        double c = obj.nextDouble();

        Customer x = new Customer(a, b);

        System.out.println("-----------------------------------------------");
        System.out.println(" MAYBANK BERHAD ");
        System.out.println("-----------------------------------------------");
        System.out.println("\nAccount number is: " + x.getAcc());
        System.out.println("Customer name is: " + x.getName());

        Deposit y = new Deposit(a, c);

        System.out.println("Payment is: RM" + y.getPay());
        System.out.println("-----------------------------------------------");
        }
}