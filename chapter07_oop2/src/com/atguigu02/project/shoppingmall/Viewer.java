package com.atguigu02.project.shoppingmall;

public class Viewer {
    public static void costomerView(Customer[] customers){
        boolean logOut = true;
        CustomerOptions customerUtilitys = new CustomerOptions();
        customerUtilitys.initCustomer(customers);
        do {
            Windows mainWindow = new Windows(true);
            String option = customerUtilitys.menuOption();
            switch (option){
                case "1":
                    customerUtilitys.addCustomer(customers);
                    break;
                case "2":
                    customerUtilitys.updateCustomer(customers);
                    break;
                case "3":
                    customerUtilitys.removeCustomer(customers);
                    break;
                case "4":
                    customerUtilitys.showCustomers(customers);
                    break;
                case "5":
                    logOut = mainWindow.exitWindow();
                    break;
            }
        }while (logOut);
    }
    public static void main(String[] args) {
        Customer[] customers = new Customer[new Windows().confirmCustomersWindow()];
        costomerView(customers);
    }
}
