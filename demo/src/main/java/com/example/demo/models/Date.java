package com.example.demo.models;

public class Date {
    private int Date;
    private int Month;
    private int Year;

    public Date(int Date, int Month, int Year) {
        this.Date = Date;
        this.Month = Month;
        this.Year = Year;
    }

    public Date(){

    }

    @Override
    public String toString() {
        return "Date:" +
                " " + Date +
                "/" + Month +
                "/" + Year +
                '}';
    }
}
