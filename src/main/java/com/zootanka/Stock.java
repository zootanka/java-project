package com.zootanka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.IntStream;

public class Stock {
    private String name;
    private String ticker;
    private String isin;
    private List<Float> earnings = new ArrayList<>();
    private int earningsYearStart;

    public Stock(final String name, final String ticker, final String isin) {
        this.isin = isin;
    }

    public void setEarnings(final int earningsYearStart, final String text) {
        this.earningsYearStart = earningsYearStart;
        final String[] es = text.split("\\s+");
        Arrays.stream(es).forEach(v -> earnings.add(Float.parseFloat(v)));
        System.out.println(earnings);
    }

    public String simulatePe(final int pe) {
        final StringBuilder builder = new StringBuilder();
        final int year = Calendar.getInstance().get(Calendar.YEAR);

        IntStream.range(0, earnings.size()).mapToObj(i -> {
            float stockPrice = pe * earnings.get(i);
            int simYear = earningsYearStart + i;
            return String.format("%d: %2.2f%s", simYear, stockPrice, simYear > year ? "e\n" : "\n");
        }).forEach(builder::append);

        return builder.toString();
    }
}