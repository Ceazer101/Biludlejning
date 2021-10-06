package com.company;

public class ElBil extends Bil{

    private double batterikapacitetKW;
    private double maxKm;
    private double whPrKm;

    public ElBil(String regNr, String mærke, String model, String årgang, int antalDøre, double batterikapacitetKW, double maxKm, double whPrKm){
        super (regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKW = batterikapacitetKW;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = ((whPrKm / 91.25) / 100);
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

    public void setBatterikapacitetKW(double batterikapacitetKW) {
        this.batterikapacitetKW = batterikapacitetKW;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }

    public double getBatterikapacitetKW() {
        return batterikapacitetKW;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    @Override
    public String toString() {
        return "\n" + "Elbil: \n" +
                super.toString() +
                "\nBatteri kapacitet. " + getBatterikapacitetKW() +
                "\nMax km. " + getMaxKm() +
                "\nWatt per km. " + getWhPrKm() +
                "\n";
    }
}
