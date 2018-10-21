package demo1020;
/*
 * StringBuilder与StringBuffer方法相似
 */
public class StringBuildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str2 = new StringBuilder();
		str2.append("大连");
		str2.append("数字媒体艺术系");
		System.out.println("在当前字符串中追加字符：    "+str2);
		System.out.println("查找'大'的位置 ：    "+str2.indexOf("大"));
        System.out.println("插入字符 在偏移量为4 的位置插入abcde :"+str2.insert(4,"abcde"));
        System.out.println("删除:   "+ str2.delete(2, 4));
        System.out.println("字符串反转  ： "+str2.reverse());
	}

}
