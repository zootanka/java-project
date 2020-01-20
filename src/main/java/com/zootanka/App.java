package com.zootanka;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Stocks World!");
        // tencent
        int year = 2009;
        String earnings = "0.5700	 	0.8900	 	1.1200	 	1.3900	 	1.6900 2.5790	 	3.0970	 	4.3830	 	7.5980	 	8.3360  10.95 11.42 	13.87 	15.92 	20.16";

        final Stock tencent = new Stock("Tencent", "700", "isin....");
        tencent.setEarnings(year, earnings);
        System.out.println(tencent.simulatePe(35));
    }
}
