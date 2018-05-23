import java.math.BigDecimal;

public class Money {
    static final String DOLLAR_CURRENCY = "USD";
    static final String FRANC_CURRENCY = "CHF";

    private BigDecimal amount;
    private String currency;

    Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Money(new BigDecimal(amount), DOLLAR_CURRENCY);
    }

    static Money franc(int amount) {
        return new Money(new BigDecimal(amount), FRANC_CURRENCY);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount.compareTo(money.amount) == 0 && currency.equals(money.currency);
    }

    public Money plus(Money addend) {
        return new Money(amount.add(addend.amount), currency);
    }

    public Money multiply(int multiplier) {
        return new Money(amount.multiply(new BigDecimal(multiplier)), currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
