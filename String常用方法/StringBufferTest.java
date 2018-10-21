package demo1020;

public class StringBufferTest {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    StringBuffer str1 = new StringBuffer();
    
    str1.append("大连计算机与软件学院 ");
    str1.append("软件工程");
    System.out.println("在StringBuffer对象后添加字符串 :  "+str1);
   
    str1.delete(3, 7);
    System.out.println("删除3到7之间的数:     "+str1);
    str1.insert(2, "ha");
    System.out.println("插入  ："  +str1);
   
    str1.replace(2, 3,"15003");
    System.out.println("替换:  "+str1);
    str1.reverse();
    System.out.println("字符串反转输出 :"+str1);
    System.out.println("字符串长度   :" +str1.length()); 
    str1.toString();
    System.out.println(str1);
    
    
    
    
   
	}

}
