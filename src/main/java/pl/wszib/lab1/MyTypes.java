package pl.wszib.lab1;

import java.math.BigInteger;

public class MyTypes {
    public static int myInt;
    public static Integer myInteger = 10;

    public static void main(String[] args) {
        System.out.println(myInt);
        //autoboxing
        Integer myLocalInteger = myInt;
        //autounboxing
        int myLocalInt = myInteger;

        int myLocalInt1 = 100000000;
//        int myLocalInt1 = 100000000000000; // to nie int
        long myLocalLong = 1000000000000000L;
        myLocalLong = myLocalInt1;
//        myLocalInt1 = (int)myLocalLong;
        new BigInteger("10000000000000000000000000000000000");
    }
}
