package com.atguigu02.project.shoppingmall;

import java.util.Scanner;

public class Windows {
    CustomerInput customerInput = new CustomerInput();
    Windows(){

    }
    Windows(boolean n){
        System.out.println("-------------------拼电商客户管理系统-----------------");
        System.out.println("-------------------1 添 加 客 户-----------------");
        System.out.println("-------------------2 修 改 客 户-----------------");
        System.out.println("-------------------3 删 除 客 户-----------------");
        System.out.println("-------------------4 客 户 列 表-----------------");
        System.out.println("-------------------5 退      出-----------------");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------请选择（1-5）-----------------");
    }

    int confirmCustomersWindow(){
        System.out.print("请输入客户列表大小：");
        int number;
        while (true){
            number = customerInput.customerNumbers();
            if (number == -1) {
                System.out.println("客户列表列表大小设置错误，请重新输入！");
                continue;
            }
            System.out.println("您的用户总个数为："+ number + "，正在进入拼电商客户管理系统......");
            return number;
        }
    }
    boolean exitWindow(){
        System.out.println("确认退出（Y or N）");
        Scanner logOut = new Scanner(System.in);
        String exitState = logOut.nextLine();
        if (exitState.equals("Y")){
            System.out.println("欢迎下次光临！");
            return false;
        }else if (exitState.equals("N")){
            System.out.println(exitState);
            return true;
        }
        return exitWindow();
    }
    void errorWindow(){
        System.out.println("输入格式错误，请重新输入！");
    }
}
