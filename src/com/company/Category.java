package com.company;

public class Category
{
    public Category()
    {
        System.out.println("Tümü");
    }
    public Category(int id,String name)
    {
        this();
        this.id=id;
        this.name=name;
    }

    int id;
    String name;
}
