package com.atguigu02.project.shoppingmall;

public class Customer {
    int id;
    String name;
    String sex;
    int age;
    String iphone;
    String email;

    void setInfo(int id,String name, String sex, int age, String iphone, String email){
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.iphone = iphone;
        this.email = email;
    }
    void setName(String name){
        this.name = name;
    }
    void setSex(String sex){
        this.sex = sex;
    }
    void setAge(int age){
        this.age = age;
    }
    void setIphone(String iphone){
        this.iphone = iphone;
    }
    void setEmail(String email){
        this.email = email;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getSex(){
        return sex;
    }
    int getAge(){
        return age;
    }
    String getIphone(){
        return iphone;
    }
    String getEmail(){
        return email;
    }
    void getInfo(){
        System.out.println("编号："+id);
        System.out.println("姓名："+name);
        System.out.println("性别："+sex);
        System.out.println("年龄："+age);
        System.out.println("电话："+iphone);
        System.out.println("邮箱："+email);
    }

}
