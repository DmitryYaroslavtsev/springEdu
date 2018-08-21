package com.education.spring.spring;

import java.util.Properties;

public class OneManBand implements Performer {
    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.stringPropertyNames()) {
            System.out.println(key + " : " + instruments.getProperty(key));
        }
    }

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }
}
