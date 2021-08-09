package com.example.coolweather.db

import org.litepal.crud.DataSupport

class Province: DataSupport() {
    private var id=0
    private var cityName="" //城市名
    private var cityCode=0 //城市代码
    private var provinceCode=0  //上级省级代码
    fun getId(): Int {
        return id
    }
    fun setId(id:Int){
        this.id=id
    }
    fun getCityName():String{
        return cityName
    }
    fun setCityName(cityName:String){
        this.cityName=cityName
    }
    fun getCityCode():Int{
        return cityCode
    }
    fun setCityCode(cityCode:Int){
        this.cityCode=cityCode
    }
    fun getProvinceCode():Int{
        return provinceCode
    }
    fun setProvinceCode(provinceCode:Int){
        this.provinceCode=provinceCode
    }
}