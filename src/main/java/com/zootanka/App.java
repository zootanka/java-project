package com.zootanka;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Stocks World!");
        // tencent
        String earnings700 = "0.5700	 	0.8900	 	1.1200	 	1.3900	 	1.6900 2.5790	 	3.0970	 	4.3830	 	7.5980	 	8.3360  10.95 11.42 	13.87 	15.92 	20.16";

        System.out.println(Stock.of("Tencent", "HKEX:700", earnings700, 2009).simulatePe(30));

        // alibaba
        String earningBaba = "$0.04 $0.05 $0.29 $0.57 $1.62 $1.55 $4.29 $2.46 $3.88 $4.97 9.02 11.14 15.5";
        System.out.println(Stock.of("Alibaba", "NYSE:BABA", earningBaba, 2010).simulatePe(29));

        // xilinx
        String earningXilinx = "1.0100 1.0400 1.2700 1.3600 1.3000 2.4300 2.0100 1.8600 2.3700 2.4400 2.1400 2.4700 2.0500 3.5200 3.52 3.6 4.8";
        System.out.println(Stock.of("Xilinx", "NASDAQ:XLNX", earningXilinx, 2006).simulatePe(27));

        // grenke
        String earningsGrenke = "0.7100 0.7430 0.7830 0.8070 0.6000 0.6770 0.9570 1.0330 1.0770 1.4700 1.8100 2.2900 2.7400 2.7800 2.78 3.40 3.93 4.22";
        System.out.println(Stock.of("Grenke", "XETR:GLJ", earningsGrenke, 2005).simulatePe(25));

        // amazon
        String earningsAmazon = "0.8700 0.4600 1.1500 1.5200 2.0800 2.5800 1.3900 -0.0900 0.6000 -0.5200 1.2800 5.0100 6.3200 20.6800 20.51 26.19 38.75 60.54";
        System.out.println(Stock.of("Amazon", "NASDAQ:AMZN", earningsAmazon, 2005).simulatePe(90));
    }
}