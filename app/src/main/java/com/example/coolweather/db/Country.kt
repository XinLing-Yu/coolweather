package com.example.coolweather.db

import org.litepal.crud.DataSupport

class Country:DataSupport() {
    private var id=0
    private var countryName=""
    private var countryCode=0
    private var weatherId=0
    private var cityId=0
    fun getId():Int{
        return id
    }
    fun setId(id:Int){
        this.id=id
    }
    fun getCountryName():String{
        return countryName
    }
    fun setCountryName(countryName:String){
        this.countryName=countryName
    }
    fun getCountryCode():Int{
        return countryCode
    }
    fun setCountryCode(countryCode:Int){
        this.countryCode=countryCode
    }
    fun getWeatherId():Int{
        return weatherId
    }
    fun setWeatherId(weatherId:Int){
        this.weatherId=weatherId
    }
    fun getCityId():Int{
        return cityId
    }
    fun setCityId(cityId:Int){
        this.cityId=cityId
    }

}