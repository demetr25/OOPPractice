package com.company;

import com.company.ht.Book;
import com.company.ht.Post;
import com.company.ht.ShopCustomer;

public class Main {

    public static void main(String[] args) {
        Book book = new Book(1000, 25);
        Post post = new Post(true);
        ShopCustomer cust = new ShopCustomer("Nikolay",25,'m');

        System.out.println("Class Book\nName => "+Book.NAMING+"\n"+"Pages => "+book.pages+"\n"+"Chapters => "+book.chapters+"\n");
        System.out.println("Class Post\nLocation => "+Post.LOCATION+"\n"+"Post Office => "+Post.NUMBER+"\n"+"My parsel is delivered => "+post.delivered+"\n");
        System.out.println("Class Shop Customer\nName => "+cust.getName()+"\n"+"Age => "+cust.getAge()+"\n"+"sex => "+cust.getSex()+"\n");

        cust.setName("Nazar");
        cust.setAge(10);
        cust.setSex('m');

        System.out.println("Class Shop Customer with changes\nName => "+cust.getName()+"\n"+"Age => "+cust.getAge()+"\n"+"sex => "+cust.getSex()+"\n");
    }
}
