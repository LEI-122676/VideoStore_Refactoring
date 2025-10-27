package ficha3;

public class ChildrensPrice extends Price {

	public ChildrensPrice() {}

    public int getFrequentRentalPoints(int duration) {
        return 1;
    }

	public double getRentalAmount(int duration) {
		return 1.5 + (duration > 3 ? (duration - 3) * 1.5 : 0);
	}

}
