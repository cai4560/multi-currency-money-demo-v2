public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar = (Dollar) obj;
        return amount == dollar.amount;
    }

    public Dollar plus(Dollar addend) {
        return new Dollar(amount + addend.amount);
    }

    public Dollar multiply(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
