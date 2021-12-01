package Payment_System;

public class DebitCard {
    private long cardNumber;
    private int cvv;
    private String bankName;

    DebitCard(long cardNumber, int cvv, String bankName) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.bankName = bankName;
    }
}
