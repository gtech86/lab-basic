package pl.wszib.lab1;

import pl.wszib.lab1.MyPackageCass.MyExtendedClass;
import pl.wszib.lab1.MyPackageCass.MyPackageClass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        MyClass.staticName = "StaticName";
        MyClass.staticName1 = "StaticName1";
        MyClass.staticName2 = "StaticName2";
      //  MyClass.staticName3 = "StaticName3";
        MyClass.printStatic();

        MyClass myClass = new MyClass();
        myClass.name = "name";
        myClass.name1 = "name1";
        myClass.name2 = "name2";
        myClass.print();

        MyClass myClass2 = new MyClass();
        myClass2.print();


        MyPackageClass myPackageClass = new MyPackageClass();
        myPackageClass.name = "name";

        myClass.print();
        
        myPackageClass.print();

        MyExtendedClass myExtendedClass = new MyExtendedClass();
        MyClass myExtendedClass2 = new MyExtendedClass();

        myExtendedClass2.name2="asd";
    }
}
