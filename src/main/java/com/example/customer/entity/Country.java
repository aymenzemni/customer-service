package com.example.customer.entity;

public class Country {
    private String countryName;
    private long occurrenceCount;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getOccurrenceCount() {
        return occurrenceCount;
    }

    public void setOccurrenceCount(long occurrenceCount) {
        this.occurrenceCount = occurrenceCount;
    }

    public Country(String countryName, long occurrenceCount) {
        this.countryName = countryName;
        this.occurrenceCount = occurrenceCount;
    }
}
