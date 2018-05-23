public class Money {
    private static final String DOLLAR_CURRENCY = "USD";
    private static final String FRANC_CURRENCY = "CHF";

    private int amount;
    private String currency;

    private Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, DOLLAR_CURRENCY);
    }

    static Money franc(int amount) {
        return new Money(amount, FRANC_CURRENCY);
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
