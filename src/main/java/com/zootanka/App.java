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

        // lufthansa
        String earningsLufthansa = "0.9900	 	1.7500	 	3.6100	 	1.3100	 	-0.2400 2.4700	 	-0.0300	 	2.1600	 	0.6800	 	0.1200 3.6700	 	3.8100	 	5.0300	 	4.5800  2.45 3.44	4.04	4.99 	5.32";
        System.out.println(Stock.of("Lufthansa", "XETR:LHA", earningsLufthansa, 2005).simulatePe(7));
        // grenke
        String earningsGrenke = "0.7100 0.7430 0.7830 0.8070 0.6000 0.6770 0.9570 1.0330 1.0770 1.4700 1.8100 2.2900 2.7400 2.7800 2.78 3.40 3.93 4.22";
        System.out.println(Stock.of("Grenke", "XETR:GLJ", earningsGrenke, 2005).simulatePe(25));

        // amazon
        String earningsAmazon = "0.8700 0.4600 1.1500 1.5200 2.0800 2.5800 1.3900 -0.0900 0.6000 -0.5200 1.2800 5.0100 6.3200 20.6800 20.51 26.19 38.75 60.54";
        System.out.println(Stock.of("Amazon", "NASDAQ:AMZN", earningsAmazon, 2005).simulatePe(90));

        // amgen
        String earningsAmgen = "2.9700 2.5100 2.8300 3.9200 4.9100 4.8200 4.0700 5.6100 6.7500 6.8000 9.1500 10.3200 2.7100 12.7000 12.7000 14.56 16.19 17.39 18.51";
        System.out.println(Stock.of("Amgen", "NASDAQ:AMGN", earningsAmgen, 2005).simulatePe(15));

        // starbucks
        String earningsStarbucks = "0.3700 0.4500 0.2200 0.2700 0.6400 0.8300 0.9200 0.0100 1.3800 1.8400 1.9100 1.9900 3.2700 2.9500 3.04 3.42 3.82 4.16";
        System.out.println(Stock.of("Starbucks", "NASDAQ:SBUX", earningsStarbucks, 2006).simulatePe(30));

        // unilever
        String earningsUnilever = "1.2900 1.6500 1.3500 1.7900 1.2100 1.5100 1.5100 1.5800 1.7100 1.8200 1.8200 1.7300 1.8300 2.1600 3.5000 3.5 2.72 2.90 3.21 3.58";
        System.out.println(Stock.of("Unilever", "AMS:UNA", earningsUnilever, 2005).simulatePe(15));

        // veeva
        String earingsVeeva = "0.14 0.20 0.31 0.41 0.51 1.01 1.59 2.17 2.51 3.02";
        System.out.println(Stock.of("Veeva", "NYSE:VEEV", earingsVeeva, 2014).simulatePe(70));

        // google
        String earningsGoogle = "2.6600 5.1100 6.7700 6.7300 10.3100 13.3500 15.0900 16.4100 19.4100 21.3700 24.6300 28.3200 18.2700 44.2200 46.48 54.53 62.62 72.69 82.44";
        System.out.println(Stock.of("Google", "NASDAQ:GOOGL", earningsGoogle, 2005).simulatePe(25));

        // apple
        String earningsApple = "0.3400 0.5800 0.7800 0.9100 2.2000 4.0100 6.3800 5.7200 6.4900 9.2800 9.2800 8.3500 9.2700 12.0100 11.9700 14.89 15.91 13.98 14.87";
        System.out.println(Stock.of("Apple", "NASDAQ:AAPL", earningsApple, 2005).simulatePe(18));
    }
}