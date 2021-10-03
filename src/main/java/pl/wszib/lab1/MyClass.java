package pl.wszib.lab1;

import pl.wszib.lab1.MyPackageCass.MyInterface;
import pl.wszib.lab1.MyPackageCass.MyInterface2;

public class MyClass implements MyInterface, MyInterface2 {

    public static String staticName;
    protected static String staticName1;
    static String staticName2;
    private static String staticName3;

    public String name;
    protected String name1;
    String name2;
    private String name3;

    public static void printStatic() {
        System.out.println("Static: ");

        System.out.println("StaticName: "+ staticName);
        System.out.println("StaticName1: "+ staticName1);
        System.out.println("StaticName2: "+ staticName2);
        System.out.println("StaticName3: "+ staticName3);
    }
    @Override
    public void print() {
        System.out.println("Nonstatic:");
        System.out.println("Name: "+ name);
        System.out.println("Name: "+ name1);
        System.out.println("Name: "+ name2);
        System.out.println("Name: "+ name3);




    }
}
