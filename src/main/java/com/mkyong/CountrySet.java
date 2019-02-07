package com.mkyong;

import java.util.HashMap;
import java.util.Map;

public class CountrySet {

    private Map<Integer, Country> map = new HashMap<Integer, Country>();

    public Map<Integer, Country> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Country> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "CountrySet{" +
                "map=" + map +
                '}';
    }
}
