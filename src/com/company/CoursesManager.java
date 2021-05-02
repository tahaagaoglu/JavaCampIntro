package com.company;

public class CoursesManager
{
    public void FinishAndContinue(Courses courses)
    {
        System.out.println("Bitir ve devam et  :"+courses.name+"-"+courses.days);
    }
    public void PreviousLesson(Courses courses)
    {
        System.out.println("Önceki ders git :"+courses.name+"-"+courses.days);
    }

}
