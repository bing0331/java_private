package demo1015;
/*  
 * �̳�      è�͹��̳ж���ķ���������
 * ʵ����       �в��޲εĹ��캯��               get��set����    this
 */
public class Animal {
	int age;
	String color;
public void run() {
	System.out.println("������");
	
}
public void call() {
	System.out.println("���Խ�");
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
	Dog dog1 = new Dog("����","��ɫ",3);
	System.out.println("��һֻ����"+" ����Ϊ��"+dog1.getName()+" ����Ϊ�� "+dog1.getAge()+" ��ɫΪ�� "+dog1.getColor());
	dog1.run();
	Dog dog2 = new Dog("����","��ɫ",7);
	dog2.setColor("�޸�Ϊ��ɫ");
	System.out.println("�ڶ�ֻ����"+" ����Ϊ��"+dog2.getName()+" ����Ϊ�� "+dog2.getAge()+" ��ɫΪ�� "+dog2.getColor());
	dog2.call();
	Cat cat1 = new Cat(2,"��ɫ",8);
	System.out.println("��һֻ(>^��^<)����"+"   ���۾���"+cat1.getEye()+" ����Ϊ�� "+cat1.getAge()+" ��ɫΪ�� "+cat1.getColor());
	cat1.call();
	
}
}
//��
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
//è
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

