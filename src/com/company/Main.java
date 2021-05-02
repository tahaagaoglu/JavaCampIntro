package com.company;

public class Main {

    public static void main(String[] args)
    {
        Category category1=new Category(1,"Programlama");
        Category category2=new Category(2,"Finans");

        System.out.println(category1.name+"\n"+category2.name);

        Teacher teacher1 =new Teacher(1,"Engin Demirog");
        Teacher teacher2=new Teacher(2,"Selman Kahya");

        System.out.println(teacher1.name);
        System.out.println(teacher2.name);

        Courses courses1=new Courses(1,"Tanıtım","1.gün");
        Courses courses2=new Courses(2,"Değişkenler","2.gün");

        CoursesManager coursesManager=new CoursesManager();
        coursesManager.FinishAndContinue(courses1);
        coursesManager.PreviousLesson(courses1);
        coursesManager.FinishAndContinue(courses2);
        coursesManager.PreviousLesson(courses2);


    }
}
