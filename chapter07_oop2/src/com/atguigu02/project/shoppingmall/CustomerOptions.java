package com.atguigu02.project.shoppingmall;

import java.util.Scanner;

public class CustomerOptions {
    public static Scanner opt = new Scanner(System.in);
    String menuOption(){
        String option = opt.nextLine();
        checkOption(option);
        return option;
    }

    private boolean checkOption(String option){
        if (option.isEmpty()){
            return false;
        }else if (option.length()>1){
            System.out.println("选项输入错误，请重新输入！");
            return false;
        }
        return true;
    }


    private Customer info(int id){
        CustomerInput customerInput = new CustomerInput();
        Scanner setInfo = new Scanner(System.in);
        System.out.print("姓名：");
        String name = setInfo.nextLine();
        System.out.print("性别：");
        String sex = setInfo.nextLine();
        System.out.print("年龄：");
        String age = setInfo.nextLine();
        System.out.print("电话号码：");
        String iphone = setInfo.nextLine();
        System.out.print("邮箱：");
        String email = setInfo.nextLine();
        Customer cust = new Customer();
        cust.setInfo(id+1,name,sex, Integer.parseInt(age),iphone,email);
        return cust;
    }

    private String checkString(String str1,String str2){
        if (str1 == "") {
            str1 = str2;
        }
        return str1;
    }
    private String checkString(String str1,int str2){
        if (str1 == "") {
            str1 = String.valueOf(str2);
        }
        return str1;
    }
    private Customer info(int id,Customer cust){
        System.out.println(cust);
        Scanner setInfo = new Scanner(System.in);
        System.out.print("姓名（"+cust.name+"）：");
        cust.name = checkString(setInfo.nextLine(),cust.name);
        System.out.print("性别（"+cust.sex+"）：");
        cust.sex = checkString(setInfo.nextLine(),cust.sex);
        System.out.print("年龄（"+cust.age+"）：");
        cust.age = Integer.parseInt(checkString(setInfo.nextLine(),cust.age));
        System.out.print("电话号码（"+cust.iphone+"）：");
        cust.iphone = checkString(setInfo.nextLine(),cust.iphone);
        System.out.print("邮箱（"+cust.email+"）：");
        cust.email = checkString(setInfo.nextLine(),cust.email);

        return cust;
    }
    public void addCustomer(Customer[] customers){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i]==null){
                customers[i] = info(i);
                break;
            }
        }
    }
    public void initCustomer(Customer[] customers){
        Customer cust = new Customer();
        cust.setInfo(1,"张三", "男", 30, "13843255423","abc@126.com");
        customers[0] = cust;
    }

    public void showCustomers(Customer[] customers){
        System.out.println("-------------------客 户 信 息-----------------");
        System.out.println("编号"+"\t\t\t\t"+"姓名"+"\t\t\t\t"+"性别"+"\t\t\t\t"+"年龄"+"\t\t\t\t"+"电话"+"\t\t\t\t\t"+"邮箱");
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] == null) {
                break;
            }
            System.out.println(customers[i].getId()
                    +"\t\t\t\t"+customers[i].getName()
                    +"\t\t\t\t"+customers[i].getSex()
                    +"\t\t\t\t"+customers[i].getAge()
                    +"\t\t\t\t"+customers[i].getIphone()
                    +"\t\t\t\t"+customers[i].getEmail());
        }
    }

    public void removeCustomer(Customer[] customers){
        System.out.println("请输入需要删除的客户编号：");
        Scanner getIndex = new Scanner(System.in);
        int index = getIndex.nextInt();
        int i;
        for (i = index-1; i < customers.length - 1; i++) {
            customers[i]=customers[i+1];
        }
        System.out.println(customers.length);
    }

    public void updateCustomer(Customer[] customers){
        System.out.println("请输入需要修改的客户编号：");
        Scanner getIndex = new Scanner(System.in);
        int index = getIndex.nextInt();
        customers[index-1] = info(index-1,customers[index-1]);
    }
}
