package demo1020;

public class StringBufferTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    StringBuffer str1 = new StringBuffer();
    
    str1.append("��������������ѧԺ ");
    str1.append("�������");
    System.out.println("��StringBuffer���������ַ��� :  "+str1);
   
    str1.delete(3, 7);
    System.out.println("ɾ��3��7֮�����:     "+str1);
    str1.insert(2, "ha");
    System.out.println("����  ��"  +str1);
   
    str1.replace(2, 3,"15003");
    System.out.println("�滻:  "+str1);
    str1.reverse();
    System.out.println("�ַ�����ת��� :"+str1);
    System.out.println("�ַ�������   :" +str1.length()); 
    str1.toString();
    System.out.println(str1);
    
    
    
    
   
	}

}
