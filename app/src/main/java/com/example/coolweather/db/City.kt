package com.example.coolweather.db

import org.litepal.crud.DataSupport

class City:DataSupport() {
    private var id=0   //每一个实体类都有一个id
    private var cityName=""  //记录市名称
    private var cityCode=0   //几率市的代码
    private var provinceCode=0  //记录该市的上级省级代码
    fun getId():Int {
        return id
    }
    fun setId(id:Int) {
        this.id = id
    }
    fun getCityName():String {
        return cityName
    }
    fun setCityName(cityName:String) {
        this.cityName = cityName
    }
    fun getCityCode():Int {
        return cityCode
    }
    fun setCityCode(cityCode:Int) {
        this.cityCode = cityCode
    }
    fun getProvinceCode():Int {
        return provinceCode
    }
    fun setProvinceCode(provinceCode:Int) {
        this.provinceCode = provinceCode
    }
}