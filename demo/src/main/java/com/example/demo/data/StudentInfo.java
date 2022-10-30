package com.example.demo.data;

public class StudentInfo {
    private String etuNimi;
    private String sukuNimi;
    private String opeNimi;
    private String luokka;

    public StudentInfo (String etuNimi, String sukuNimi, String opeNimi, String luokka ) {
        this.etuNimi = etuNimi;
        this.sukuNimi = sukuNimi;
        this.opeNimi = opeNimi;
        this.luokka = luokka;
    }

    public StudentInfo () {
        this("", "", "", "");
    }

    // GETTERIT
    public String getEtunimi () {
        return this.etuNimi;
    }

    public String getSukunimi () {
        return this.sukuNimi;
    }

    public String getOpenimi () {
        return this.opeNimi;
    }

    public String getLuokka () {
        return this.luokka;
    }

    // SETTERIT
    public void setEtunimi (String etuNimi) {
        this.etuNimi = etuNimi;
    }

    public void setSukunimi (String sukuNimi) {
        this.sukuNimi = sukuNimi;
    }

    public void setOpenimi (String opeNimi) {
        this.opeNimi = opeNimi;
    }

    public void setLuokka (String luokka) {
        this.luokka = luokka;
    }
}
