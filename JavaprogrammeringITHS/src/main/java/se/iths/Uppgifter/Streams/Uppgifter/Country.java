package se.iths.Uppgifter.Streams.Uppgifter;

public class Country{
    private final String country;
    private final String capitalCity;
    private final double popInMillion;
    private final int areaInSquareKm;

    public Country(String country, String capitalCity, double popInMillion, int areaInSquareKm) {
        this.country = country;
        this.capitalCity = capitalCity;
        this.popInMillion = popInMillion;
        this.areaInSquareKm = areaInSquareKm;
    }

    public String getCountry() {
        return country;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public double getPopInMillion() {
        return popInMillion;
    }

    public int getAreaInSquareKm() {
        return areaInSquareKm;
    }
    @Override
    public String toString() {
        return country +
                ",\t" + capitalCity +
                ",\t" + popInMillion + "M" +
                ",\t" + areaInSquareKm + "km^2";
    }
}
