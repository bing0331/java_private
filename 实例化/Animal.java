package demo1015;
/*  
 * 继承      猫和狗继承动物的方法与属性
 * 实例化       有参无参的构造函数               get与set方法    this
 */
public class Animal {
	int age;
	String color;
public void run() {
	System.out.println("可以跑");
	
}
public void call() {
	System.out.println("可以叫");
}
public int getAge() {
	return age;
}
public String  getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
	
}
public static void main(String[] args) {
	Dog dog1 = new Dog("张三","黄色",3);
	System.out.println("第一只狗："+" 名字为："+dog1.getName()+" 年龄为： "+dog1.getAge()+" 颜色为： "+dog1.getColor());
	dog1.run();
	Dog dog2 = new Dog("李四","白色",7);
	dog2.setColor("修改为棕色");
	System.out.println("第二只狗："+" 名字为："+dog2.getName()+" 年龄为： "+dog2.getAge()+" 颜色为： "+dog2.getColor());
	dog2.call();
	Cat cat1 = new Cat(2,"灰色",8);
	System.out.println("第一只(>^ω^<)喵："+"   有眼睛："+cat1.getEye()+" 年龄为： "+cat1.getAge()+" 颜色为： "+cat1.getColor());
	cat1.call();
	
}
}
//狗
class Dog extends Animal{
	String name;
public Dog(String name,String color,int age) {
	this.age = age;
	this.color = color;
	this.name = name;
}
public String getName() {
	return name;
}	
}
//猫
class Cat extends Animal{
	int eye;
public Cat( int eye,String color,int age) {
	this.age = age;
	this.color = color;
	this.eye = eye;
}
public int getEye() {
	return eye;
}	
}

