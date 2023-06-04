package com.atguigu02.project.shoppingmall;
import java.util.Scanner;
public class CustomerInput {
    private static Scanner scanner = new Scanner(System.in);
    int customerNumbers(){
        int number = intInput();
        if (number < 0 & number > Integer.MAX_VALUE){
            return -1;
        }
        return number;
    }
    void customerName(Customer[] customer, int id){
        String name = strInput();
        if (name != "") {
            customer[id-1].setName(name);
        }
    }
    int intInput(){
        return scanner.nextInt();
    }
    String strInput(){
        return scanner.nextLine();
    }
}
