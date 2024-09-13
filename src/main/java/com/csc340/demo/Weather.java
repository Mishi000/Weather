package com.csc340.demo;

public class Weather {
    private String city;
    private String zipcode;
    private String temperature;
    private String windSpeed;

    public Weather(String city, String zipcode, String temperature, String windSpeed) {
        this.city = city;
        this.temperature = temperature;
        this.zipcode = zipcode;
        this.windSpeed = windSpeed;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

}
