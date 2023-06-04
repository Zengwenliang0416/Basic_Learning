package com.atguigu04.example.exer5_objarr;

public class Solution {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].Number = i+1;
            students[i].state = (int) (Math.random()*5 + 1);
            students[i].score = (int) (Math.random()*100);
        }
        Student show = new Student();
        show.show(students);
        show.showState(students,3);
        show.sortScores(students);
    }
}
