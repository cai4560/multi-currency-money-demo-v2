import java.math.BigDecimal;

public class Bank {
    private static final BigDecimal USD_TO_CHF = new BigDecimal(2);
    private static final BigDecimal CHF_TO_USD = new BigDecimal(0.5);

    public Money reduce(Money money, String toCurrency) {
        BigDecimal rate = getRates(money.getCurrency(), toCurrency);
        return new Money(money.getAmount().multiply(rate), toCurrency);
    }

    private BigDecimal getRates(String from, String to) {
        if (from.equals(Money.DOLLAR_CURRENCY) && to.equals(Money.FRANC_CURRENCY)) {
            return USD_TO_CHF;
        } else if (from.equals(Money.FRANC_CURRENCY) && to.equals(Money.DOLLAR_CURRENCY)) {
            return CHF_TO_USD;
        }
        return BigDecimal.ONE;
    }
}
