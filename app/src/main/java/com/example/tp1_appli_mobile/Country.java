package com.example.tp1_appli_mobile;


public class Country {

    private String name;
    private String capital;
    private String imgFile;
    private String language;
    private String currency;
    private int population;
    private int area;

    public Country(String name, String capital, String imgFile, String language, String currency, int population, int area) {
        this.name = name;
        this.capital = capital;
        this.imgFile = imgFile;
        this.language = language;
        this.currency = currency;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String capital) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getImgUri() {
        return "@drawable/ic_"+imgFile+"_320px";
    }

    public void setImgFile(String imgFile) {
        this.imgFile = imgFile;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public static Country[] countries = {new Country("France", "Paris", "ic_flag_of_france", "français", "euro", 67348000, 640679),
            new Country("Allemagne", "Berlin", "ic_flag_of_germany", "Allemand", "euro", 82887000, 357340),
            new Country("Espagne", "Madrid", "ic_flag_of_spain", "Espagnol", "euro", 48958159, 505911),
            new Country("Afrique du Sud", "Pretoria", "ic_flag_of_south_africa", "Anglais, afrikaans et 9 langues bantoues", "rand", 55653654, 1219912),
            new Country("Japon", "Tokyo", "ic_flag_of_japan", "Japonais", "yen", 126168156, 377915),
            new Country("États-Unis", "Washington DC", "ic_flag_of_united_states", "Anglais", "dollar américain", 327167434, 9833517)};
}
