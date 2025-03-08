package day1;

import java.text.DecimalFormat;

public class Task4ExtractValues {

    /*
        Extract Values

        Given a String displaying the price and discount of an item on our app determine if the correct information is being displayed

        str = 40% off Deal $59.99 List Price: $99.99

        the format of the input String is fixed as seen above

     */

    public static void main(String[] args) {

        String str = "40% off Deal $59.99 List Price: $99.99";
        int percentage = Integer.parseInt(str.substring(0, str.indexOf('%')));
        double deal = Double.parseDouble(str.substring(str.indexOf("$") + 1, str.indexOf(" List")));
        double price = Double.parseDouble(str.substring(str.lastIndexOf('$') + 1));

        double checking = price - (price * (percentage/100.0));
        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        checking = Double.parseDouble(decimalFormat.format(checking));
        System.out.println(checking);
        System.out.println(checking == deal ? "PASS" : "FAIL");


    }

}
