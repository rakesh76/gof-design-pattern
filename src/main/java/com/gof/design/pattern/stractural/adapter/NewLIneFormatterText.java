package com.gof.design.pattern.stractural.adapter;

import org.junit.Test;

import java.util.Arrays;

public class NewLIneFormatterText {

    @Test
    public void testNewLineTextFormatter(){

        Arrays.asList("Rakesh");
        NewLineFormatter newLineFormatter = new NewLineFormatter();
        String formatText = newLineFormatter.formatText("Formatting line 1. Formatting line 2. Formatting line 3.");
        System.out.println("Formatext Text \n " + formatText);

        CSVFormatter csvFormatter = new CSVFormatter();
        CSVAdapter csvAdapter = new CSVAdapter(csvFormatter);
        String csvText  = csvAdapter.formatText("CSV Formatting line 1. Formatting line 2. Formatting line 3.");
        System.out.println(csvText);



    }
}
