package com.company;

public class DieselBil extends Bil{

    private boolean partikelFilter;
    private double kmPrL;

    public DieselBil (String regNr, String mærke, String model, String årgang, int antalDøre, boolean partikelFilter, double kmPrL){
        super (regNr, mærke, model, årgang, antalDøre);
        this.partikelFilter = partikelFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double sum = 0;
        if (partikelFilter == false) {
            sum += 1000;
        } if (kmPrL > 20 && kmPrL <= 50){
            sum += 130;
        } else if (kmPrL > 15 && kmPrL <= 20) {
            sum += 1390;
        } else if (kmPrL > 10 && kmPrL <= 15){
            sum += 1850;
        } else if (kmPrL > 5 && kmPrL <= 10){
            sum += 2770;
        } else if (kmPrL < 5){
            sum += 15260;
        }
        return sum;
    }

    public void setPartikelFilter(boolean partikelFilter) {
        this.partikelFilter = partikelFilter;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    public String isPartikelFilter(boolean partikelFilter) {
        if (partikelFilter == true){
            return "Ja";
        } else {
            return "Nej";
        }
    }

    public double getKmPrL() {
        return kmPrL;
    }

    @Override
    public String toString() {
        return "\n" + "Dieselbil: \n" +
                super.toString() +
                "\nBilen har partikelfilter " + "[" + isPartikelFilter(partikelFilter) + "]" +
                "\nKm per liter " + getKmPrL() +
                "\n" + "\n";
    }
}
