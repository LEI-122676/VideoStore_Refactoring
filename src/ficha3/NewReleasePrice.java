package ficha3;

public class NewReleasePrice extends Price {

	public NewReleasePrice() {}

    public int getFrequentRentalPoints(int duration)
    {
        return duration > 1 ? 2 : 1;
    }

    public double getRentalAmount(int duration)
	{
		return duration * 3;
	}

}
