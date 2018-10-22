/*
 * 继承
 */

package demo1022;

//子类  狗  继承动物类的属性和方法
public class Dog extends Animal {
    int eye;
    public void show3() {
    	show1();
    	System.out.println("眼睛的个数：" +eye);
    }
    
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.age = 8;
		dog.eye = 2;
		dog.show3();
		dog.show1();
		dog.run();
	}

	
}
//父类    动物类
class Animal {
	int age;
	String color;
	public void run() {
		System.out.println("Running....");
	}
	public void show1() {
		System.out.println("年龄为："+age);
	}
	public void show2() {
		System.out.println("颜色为："+color);
	}
}