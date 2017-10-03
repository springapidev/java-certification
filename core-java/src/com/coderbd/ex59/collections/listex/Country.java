package com.coderbd.ex59.collections.listex;

public class Country {

    private long id;
    private String countryName;

    public Country(long id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public long getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

}
