package AbstractFactory;

public abstract class CreditCard {
    protected int cardNumberLength;
    protected int cscNumber;

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
