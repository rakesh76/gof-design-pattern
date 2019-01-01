package com.gof.design.pattern.stractural.adapter;

public class CSVAdapter implements TextFormattable {

    CSVFormattable csvFormattable;

    public CSVAdapter(CSVFormattable csvFormattable) {
        this.csvFormattable = csvFormattable;
    }

    @Override
    public String formatText(String text) {
        return csvFormattable.formatCSVText(text);
    }
}
