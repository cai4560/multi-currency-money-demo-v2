public class Dollar extends Money {

    public Dollar(int amount) {
        super(amount, "USD");
    }

    public Dollar plus(Dollar addend) {
        return new Dollar(amount + addend.amount);
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
