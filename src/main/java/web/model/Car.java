package web.model;

import java.util.Objects;

public class Car {
    private String country;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String country, String model, int year) {
        this.country = country;
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car from " + country + ": " + model + ", " + year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Car other = (Car) obj;
        return (this.country.equals(other.getCountry())
                && this.model.equals(other.getModel())
                && this.year == other.getYear());
    }
}
