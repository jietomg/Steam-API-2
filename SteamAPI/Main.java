package org.future.code.homework.ph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>(List.of(
                new Phone("Apple", "IPhone 14", 129999.99),
                new Phone("Samsung", "Galaxy", 59999.99),
                new Phone("Apple", "IPhone 8", 89999.99)));

        ArrayList<Phone> applePhones = phones.stream()
                .filter(phone -> phone.getManufacturer().equals("Apple"))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Отсортированные телефоны по производителю:");
        for (Phone phone : applePhones) {
            System.out.println("Телефон №" + (applePhones.indexOf(phone) + 1));
            System.out.println(phone.getManufacturer());
            System.out.println(phone.getModel());
            System.out.println(phone.getPrice());
            System.out.println("------------------");
        }

        Collections.sort(phones);
        System.out.println("Отсортированные телефоны по цене:");
        phones.forEach(phone -> System.out.println(phone.getModel() + ": " + phone.getPrice()));
    }
}
