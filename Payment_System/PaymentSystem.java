package Payment_System;

import java.util.Scanner;
public class PaymentSystem {
    private float amount;

    Person P;
    DebitCard deb;
    Paypal pay;

    PaymentSystem(float amount, Person P, DebitCard deb, Paypal pay) {
        this.amount = amount;
        this.P = P;
        this.deb = deb;
        this.pay = pay;
    }

    PaymentSystem(float amount, Person P, DebitCard deb) {
        this(amount, P, deb, null);
    }

    PaymentSystem(float amount, Person P, Paypal pay) {
        this(amount, P, null, pay);
    }

    void display() {
        P.display();
        System.out.println("Amount = " + this.amount);
        System.out.println("Payment cleared");
    }

    public static void main(String[] args) {
        Person P =new Person("Ram", 987654321);

        Scanner s = new Scanner(System.in);
        
        System.out.print("Choos an option to pay:\n1.Debit Card \n2.Paypal");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                DebitCard deb = new DebitCard(87698697, 123, "Everest Bank");

                PaymentSystem payment1 = new PaymentSystem(20000, P, deb);
                payment1.display();
                break;

            case 2:
                Paypal pay = new Paypal("hello@example.com", "password");
                PaymentSystem payment2 = new PaymentSystem(20000, P, pay);
                payment2.display();

                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }


    }
}
