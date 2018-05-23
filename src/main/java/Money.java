public class Money {
    protected int amount;
    private String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && currency.equals(money.currency);
    }

    public Money plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    public Money multiply(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
}
