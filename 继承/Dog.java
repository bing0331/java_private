/*
 * �̳�
 */

package demo1022;

//����  ��  �̳ж���������Ժͷ���
public class Dog extends Animal {
    int eye;
    public void show3() {
    	show1();
    	System.out.println("�۾��ĸ�����" +eye);
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
//����    ������
class Animal {
	int age;
	String color;
	public void run() {
		System.out.println("Running....");
	}
	public void show1() {
		System.out.println("����Ϊ��"+age);
	}
	public void show2() {
		System.out.println("��ɫΪ��"+color);
	}
}