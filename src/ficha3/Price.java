package ficha3;

public abstract class Price {

    public Price() {}

    public abstract int getFrequentRentalPoints(int duration);

    public abstract double getRentalAmount(int duration);

}
