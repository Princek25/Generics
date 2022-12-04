package com.bridgelabz;

public class TextMaximum {

    public Integer checkMaximumInteger(Integer num1, Integer num2, Integer num3){
        Integer maximum = num1;
        if (num2.compareTo(maximum) > 0){
            maximum = num2;
        }
        if (num3.compareTo(maximum) > 0){
            maximum = num3;
        }
        return maximum;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find the maximum problem using generics");
        TextMaximum obj = new TextMaximum();
        System.out.println("The maximum of the three Integer is:- ");
        System.out.println(obj.checkMaximumInteger(10,20,30));
    }
}
