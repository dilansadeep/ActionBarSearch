package com.epicapps.actionbarsearch.model;

/**
 * Created by fidenz on 10/19/17.
 */

public class StartUpData {
    int id;
    String catogery;
    String country;
    String item_name;
    String item_logo;
    String item_url;

    public StartUpData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatogery() {
        return catogery;
    }

    public void setCatogery(String catogery) {
        this.catogery = catogery;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_logo() {
        return item_logo;
    }

    public void setItem_logo(String item_logo) {
        this.item_logo = item_logo;
    }

    public String getItem_url() {
        return item_url;
    }

    public void setItem_url(String item_url) {
        this.item_url = item_url;
    }
}
