package pl.wszib.lab1.MyPackageCass;

import pl.wszib.lab1.MyClass;

public class MyExtendedClass extends MyClass{
    @Override
    public void print() {
        super.print();
        super.name = "ExtendedName";
        super.name1 = "ExtendedName1";
    }
}
