package Encapsulation;
import java.util.*;

class Bank {
    private int acc_no;
    private int bal;
    private String name;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int amt) {
        bal += amt;
        System.out.println("---Deposited Successfully---");
    }

    public void withdraw(int amt) {
        if (amt > bal) {
            System.out.println("---Insufficient Balance---");
        } else {
            bal -= amt;
            System.out.println("---Withdrawn Successfully---");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank obj = new Bank();

        System.out.print("Enter Account Number : ");
        obj.setAcc_no(sc.nextInt());

        System.out.print("Enter Name : ");
        obj.setName(sc.next());

        System.out.print("Enter Initial Balance : ");
        obj.setBal(sc.nextInt());

        int option = 0;
        while (option != 3) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Deposit Amount : ");
                    obj.deposit(sc.nextInt());
                    System.out.println("Balance : " + obj.getBal());
                    break;
                case 2:
                    System.out.print("Enter Withdraw Amount : ");
                    obj.withdraw(sc.nextInt());
                    System.out.println("Balance : " + obj.getBal());
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
