public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }

    public Franc plus(Franc addend) {
        return new Franc(this.amount + addend.amount);
    }

    public Franc multiply(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
