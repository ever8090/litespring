sping注解实现思路
1、读取XML文件
2、对指定的package进行扫描（scan），找到那些标记为@compont的类，创建beandefinition
——1、把一个package下面的类变为resource
——2、使用ASM读取resource下面的注解
——3、创建beandefinition
3、通过beandefinition创建bean实例，根据注解进行属性的注入