package org.jsg.creational.factory.staticfactorymethod.equality;
/*
Demonstrates whether or not a Utility class is instantiated or not using the == test
    Note: == compares references of two objects where .equals compares values

    Outcome:
        If two strings contains the same value, typically the JVM points them to the same reference
        Integer.valueOf will reuse the same reference for values from -128 to 127;
            otherwise, a new instance of Integer is use and thus == is false.
 */
public class IsEqualTest {
    public static void main(String[] args) {
        System.out.println(new Integer(10) == Integer.valueOf(10));
        System.out.println(Integer.valueOf(10) == Integer.valueOf(10));
        System.out.println(Integer.valueOf(127) == Integer.valueOf(127));

        String a = "apple";
        String b = "apple";

        System.out.println(a == b);
    }
}
