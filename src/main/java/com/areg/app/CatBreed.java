package com.areg.app;

public enum CatBreed {
    AMERICAN_BOBTAIL ("американский бобтейл"),
    ANGORA("ангорская кошка"),
    BALINESE("балийская кошка"),
    BENGAL("бенгальская кошка"),
    HIMALAYAN("гималайская кошка"),
    SPHINX("сфинкс");



    private String value;

    CatBreed (String value) {
        this.value = value;
    }


    public String getValue () {
        return value;
    }

    }
