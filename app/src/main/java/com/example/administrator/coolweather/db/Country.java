package com.example.administrator.coolweather.db;

/**
 * Created by Administrator on 2017/8/7 0007.
 */

public class Country extends DataSupport {
    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getcountyName(){
        return countyName;
    }
    public void setcountyName(String countyName){
        this.countyName = countyName;
    }
    public int getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(int weatherId){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}