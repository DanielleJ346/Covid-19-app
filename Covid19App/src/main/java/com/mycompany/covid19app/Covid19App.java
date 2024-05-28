package com.mycompany.covid19app;

// imports
import java.io.Serializable;

public class Covid19App implements Serializable {
    private String province;
    private int totalCases;
    private double percentageTotal;

    public Covid19App(String province, int totalCases, double percentageTotal) {
        this.province = province;
        this.totalCases = totalCases;
        this.percentageTotal = percentageTotal;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(int totalCases) {
        this.totalCases = totalCases;
    }

    public double getPercentageTotal() {
        return percentageTotal;
    }

    public void setPercentageTotal(double percentageTotal) {
        this.percentageTotal = percentageTotal;
    }

    @Override
    public String toString() {
        return "Province: " + province + ", Total Cases: " + totalCases + ", Percentage Total: " + percentageTotal;
    }
}

