package com.atguigu08.constructor.exer1;

public class Student {
    String name;
    int age;
    String school;
    String major;
    //构造器：与类名同名的方法，相互之间可以构成重载，方法签名中的参数列表和参数类型必须不同
    public Student(String n , int a){
        name = n;
        age = a;
    }

    public Student(String n , int a, String s){
        name = n;
        age = a;
    }
    public Student(String n , int a, String s, String m){
        name = n;
        age = a;
    }

}
