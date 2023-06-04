package com.atguigu04.example.exer5_objarr;

public class Student {
    int Number;
    int state;
    int score;

    void show(Student[] student){
        for (int i = 0; i < student.length; i++) {
            System.out.print("该同学的学号是："+student[i].Number+",");
            System.out.print("该同学的年级是："+student[i].state+",");
            System.out.println("该同学的分数是："+student[i].score);
        }
    }

    void showState(Student[] student, int state){
        System.out.println(state+"年级的同学的成绩如下：");
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == state){
                System.out.print("该同学的学号是："+student[i].Number+",");
                System.out.print("该同学的年级是："+student[i].state+",");
                System.out.println("该同学的分数是："+student[i].score);
            }
        }
    }

    void sortScores(Student[] students){
        int length = students.length;
        System.out.println("排序后的同学的成绩如下：");
        for (int i = length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (students[j].score > students[j-1].score){
                    Student tmp = students[j-1];
                    students[j-1] = students[j];
                    students[j] = tmp;
                }
            }
            length -- ;
        }
        Student show = new Student();
        show.show(students);
    }
}
