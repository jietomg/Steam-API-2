package org.future.code.homework.ph;

public class Phone implements Comparable<Phone> {
    private final String manufacturer;
    private final String model;
    private final double price;

    public Phone(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    @Override
    public int compareTo(Phone phone) {
        return Double.compare(price, phone.price);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
