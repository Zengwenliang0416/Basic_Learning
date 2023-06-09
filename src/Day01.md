# 总结：

## 1. Java程序编写和执行过程：

编写：编写代码在.java结尾的源文件中。

编译：对源文件执行编译操作生成字节码文件。

运行：解释运行字节码文件

## 2. JAVA优点：

跨平台性

面向对象性

健壮性

安全性高

简单性

高性能

## 3. 关键字、保留字

关键字共有50个，保留字有两个（goto、const），false、true和null可以当作关键字看待

## 4. 命名规范

包名：全小写；类名：驼峰法（首字母大写）；变量名、方法名：第二个单词开始首字母大写；常量名：全大写，单词之间用下划线连接

## 5. 数据类型

## 基本数据类型（8种）：

| 数据类型 |      字节数       |   长度   |                   说明                   |
| :------: | :---------------: | :------: | :--------------------------------------: |
|   byte   | 1个字节（8个位）  | -128~127 |                                          |
|  short   | 2个字节（16个位） |          |                                          |
|   int    |         4         |          |                开发最常用                |
|   long   |         8         |          | 定义long类型变量时需要加上后缀‘l’或者‘L’ |
|  float   |         8         |          |        定义时要加上后缀‘f’或者‘F’        |
|  double  |        16         |          |      开发中最常用（精度比float高）       |
|   char   |         2         |          |                                          |
| Boolean  |         4         |          |                                          |

浮点型的精度并不高

char型变量内部有且仅有一个字符，用单引号进行赋值。

## 基本数据类型变量间的运算规则

### 自动类型提升

byte、char、short   ------->    int   ------->       long   ------->    float   ------->    double

Note: byte、char、short类型之间的变量之间运算后结果均为int类型。

### 强制类型转换

存在精度降低的现象

## 引用数据类型

### String

字符串，定义方式为双引号，与八种基本数据类型之间的运算为：+，结果也为String型，这个地方连接时String类型变量要放在首位。

当要将字符串“10”转换为int型的数据时，需要使用Integer.parseInt()方法。

## 6. 进制

二进制：0B或者0b开头；八进制：0开头；十六进制：0x或者0X开头

二进制：

- 正数：原码、反码、补码三码合一。

- 负数：原码、反码、补码不相同。了解三者之间的关系。
- 计算机的底层是以`补码`的方式存储数据的。

## 7. 运算符

++和--的用法

### 位运算符

<<和>>能够高效实现乘除操作

### 条件运算符

条件表达式？表达式1:表达式2

满足条件表达式则采用表达式1，否则采用2

执行效率比if-else要高。

## 8. 流程控制

switch-case具有穿透功能，相比于if...else效率更高



# 企业真题

## 1 .java源文件中可否包含多个类？有什么限制？

可以 ，但是最多只能存在一个用public声明的类，且该类与源文件名相同。

## 2 java的优势

跨平台性（依托于JVM）、健壮性、简单性、高性能、面向对象性（）、安全性高

## 3 java中是否存在内存溢出或者内存泄露现象

存在，尽管java中有GC机制，但是当代码量过多时，垃圾回收机制不可能回收所有的空间，

内存泄漏指的是GC机制未能够正常的识别出垃圾空间从而导致垃圾空间未被清理，内存泄漏过多也有可能导致内存溢出现象。

## 4 如何看待java是一门半编译半解释性语言？





## 5 java开发中计算金额使用什么数据类型？

使用BigDecimal类实现任意精度的数据的运算

## 6 char能否存储中文汉字？

可以，char使用unicode字符集，其中包含了世界上的所有字符

## 7 boolean占用几个字节？

在内存中，byte\short\char\boolean\int\folat占用一个槽位（slot）

double\long占用两个slot

## 8 0.1+0.2为什么不等于0.3

这是由于几乎现在所有的现代语言都采用的是IEEE 745标准，在这个标准下，尽管小数的二进制表达能够有最大的精度上的提升，但是仍然无法突破物理边界，也就是说它像表示整数那样保证每一个十进制小数都对应一个二进制小数。

具体的例子：

二进制小数0.0001表示十进制数0.0625 （至于它是如何计算的，不用深究）；二进制小数0.0010表示十进制数0.125；二进制小数0.0011表示十进制数0.1875。看，对于四位的二进制小数，二进制小数虽然是连贯的，但是十进制小数却不是连贯的。比如，你无法用四位二进制小数的形式表示0.125 ~ 0.1875之间的十进制小数。