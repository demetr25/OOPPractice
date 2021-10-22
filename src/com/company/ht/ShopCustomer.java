package com.company.ht;

public class ShopCustomer {
    private static String name;
    private static int age;
    private static char sex;


    public ShopCustomer(String name, int age, char sex) {
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        ShopCustomer.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        ShopCustomer.age = age;
    }

    public static char getSex() {
        return sex;
    }

    public static void setSex(char sex) {
        ShopCustomer.sex = sex;
    }
}