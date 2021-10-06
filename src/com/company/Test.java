package com.company;

public class Test {

    public static void main(String[] args) {

        Garage garage = new Garage();

        BenzinBil benzin = new BenzinBil("CS29443", "vw", "golf", "2005", 4, 70, 7);

        ElBil el = new ElBil("ZX99384", "Tesla", "Model Musk", "2018", 2, 75, 10, 90000);

        DieselBil diesel = new DieselBil("TJ89443", "Toyota", "Yaris", "2014", 4, true, 17);

        garage.addCar(benzin);
        garage.addCar(el);
        garage.addCar(diesel);

        System.out.println(garage);

    }
}
