# Q1 Scanner对象创建

![image-20230612132301338](https://gitee.com/wenliang_zeng/md/raw/master/image-20230612132301338.png)

正确创建方式：

```java
        Scanner opt = new Scanner(System.in);
        int option = opt.nextInt();
```

# Q2 switch使用

当满足某个case时，会从当前这个case一直往下运行（哪怕option不等于当前case），所以要加上continue

```java
switch (option){
                case "1":
                    System.out.println("请输入需要添加的客户信息：");
                    continue;
                case "2":
                    System.out.println("请输入需要修改的客户信息：");
                    continue;
                case "3":
                    System.out.println("请输入需要删除的客户信息：");
                    continue;
                case "4":
                    System.out.println("客户信息如下：");
                    continue;
                case "5":
                    System.out.println("欢迎下次光临！：");
                    break;
            }
```

# Q3 对象数组的使用

错误代码：

此时每一个customer[i]指向的是null，需要创建一个Customer对象才能够进行赋值。

```java
    public void addCustomer(Customer[] customers){
        for (int i = 0; i < customers.length; i++) {
            if (customers[i]==null){
                Scanner setInfo = new Scanner(System.in);
                System.out.println("请输入需要添加的客户信息：");
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
                customers[i].setInfo(i,name,sex, Integer.parseInt(age),iphone,email);
            }
        }
    }
```

正确代码：

```java
public void addCustomer(Customer[] customers){
    for (int i = 0; i < customers.length; i++) {
        if (customers[i]==null){
            customers[i] = new Customer();
            Scanner setInfo = new Scanner(System.in);
            System.out.println("请输入需要添加的客户信息：");
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
            customers[i].setInfo(i,name,sex, Integer.parseInt(age),iphone,email);
        }
    }
}
```