package com.gof.design.pattern.stractural.adapter;

public class CSVFormatter implements CSVFormattable
{
    @Override
    public String formatCSVText(String text) {
        String csvText = text.replace(".",",");
        return csvText;
    }
}
