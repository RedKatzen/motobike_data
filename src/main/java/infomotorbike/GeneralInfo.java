package infomotorbike;

import java.util.Date;

public class GeneralInfo {
    private String date;
    private double kmTraveled;
    private double litersStocked;
    private double totalKm;
    private double averageLitersPerKm;

    public GeneralInfo(){
    }

    public GeneralInfo(String data, double kmTraveled, double litersStocked, double totalKm, double averageLitersPerKm) {
        this.date = data;
        this.kmTraveled = kmTraveled;
        this.litersStocked = litersStocked;
        this.totalKm = totalKm;
        this.averageLitersPerKm = averageLitersPerKm;
    }

    public String getData() {
        return date;
    }

    public void setData(String data) {
        this.date = data;
    }

    public double getKmTraveled() {
        return kmTraveled;
    }

    public void setKmTraveled(double kmTraveled) {
        this.kmTraveled = kmTraveled;
    }

    public double getLitersStocked() {
        return litersStocked;
    }

    public void setLitersStocked(double litersStocked) {
        this.litersStocked = litersStocked;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }

    public double getAverageLitersPerKm() {
        return averageLitersPerKm;
    }

    public void setAverageLitersPerKm() {
        this.averageLitersPerKm = this.kmTraveled / this.litersStocked;
    }
    
}
