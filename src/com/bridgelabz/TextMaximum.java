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
    public Float checkMaximumFloat(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;

        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
    public String checkMaximumString(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0)
            max = str2;

        if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to find the maximum problem using generics");
        TextMaximum obj = new TextMaximum();
        System.out.println("The maximum of the three Integer is:- ");
        System.out.println(obj.checkMaximumInteger(10,20,30));
        System.out.println("The maximum of the three Float is:- ");
        System.out.println(obj.checkMaximumFloat(10.2f, 20.54f, 30.6f));
        System.out.println("The maximum of the three String is:- ");
        System.out.println(obj.checkMaximumString("Apple", "Peach", "Banana"));
    }
}
