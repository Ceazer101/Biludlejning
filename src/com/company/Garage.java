package com.company;

import java.util.ArrayList;

public class Garage {

    ArrayList<Bil> biler = new ArrayList<>();

    public void addCar(Bil bil){
        biler.add(bil);
    }

    public Garage(){
    }

    public double beregnGrønAfgiftTotal(){
        double sum = 0;
        for (Bil bil: biler) {
            sum += bil.beregnGrønEjerafgift();
        }
        return sum;
    }

    @Override
    public String toString() {
        String text = "";
        for (Bil bil: biler) {
            text += bil;
        }

        return  "\n" + "Garagen holder på følgende biler: \n" +
                text
                + "\nSamlede grønne afgift er "+ beregnGrønAfgiftTotal()
                + " kr.";
    }
}
