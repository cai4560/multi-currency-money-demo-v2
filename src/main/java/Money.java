import java.math.BigDecimal;

public class Money implements Expression {
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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Money money = (Money) obj;
        return amount.compareTo(money.amount) == 0 && currency.equals(money.currency);
    }

    public Money reduce(Bank bank, String toCurrency) {
        return bank.reduce(this, toCurrency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression multiply(int multiplier) {
        BigDecimal newAmount = this.amount.multiply(new BigDecimal(multiplier));
        return new Money(newAmount, this.currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
