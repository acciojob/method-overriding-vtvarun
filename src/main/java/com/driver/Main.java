

package com.driver;

class A{
    public String meth(){
        return "This is from Class A";
    }
}

class B extends A{
    public String meth(){
        return "This is from Class B";
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }
}