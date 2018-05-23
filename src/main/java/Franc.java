public class Franc extends Money {

    public Franc(int amount) {
        super(amount, "CHF");
    }

    public Franc plus(Franc addend) {
        return new Franc(this.amount + addend.amount);
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
