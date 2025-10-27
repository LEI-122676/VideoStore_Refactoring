package ficha3;

public class RegularPrice extends Price {

	public RegularPrice() {}

    public int getFrequentRentalPoints(int duration)
    {
        return 1;
    }

	public double getRentalAmount(int duration)
	{
		return 2 + (duration > 2 ? (duration - 2) * 1.5 : 0);
	}

}
