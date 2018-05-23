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
}
