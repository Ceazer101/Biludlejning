package com.company;

public class BenzinBil extends Bil{

    private double oktanTal;
    private double kmPrL;

    public BenzinBil (String regNr, String mærke, String model, String årgang, int antalDøre, double oktanTal, double kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;

    }

    @Override
    public double beregnGrønEjerafgift() {
        if (kmPrL > 20 && kmPrL <= 50){
            return 330;
        } else if (kmPrL > 15 && kmPrL <= 20) {
            return 1050;
        } else if (kmPrL > 10 && kmPrL <= 15){
            return 2340;
        } else if (kmPrL > 5 && kmPrL <= 10){
            return 5500;
        } else if (kmPrL < 5){
            return 10470;
        }
        return 0;
    }

    public void setOktanTal(double oktanTal) {
        this.oktanTal = oktanTal;
    }

    public double getOktanTal() {
        return oktanTal;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return  "\n" + "Benzinbil: \n" +
                super.toString() +
                "\nOkatan tal. " + getOktanTal() +
                "\nKm per liter " + getKmPrL() +
                "\n";
    }
}

