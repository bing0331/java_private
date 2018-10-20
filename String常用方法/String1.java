package demo1020;
/*字符串
 * String对象时不可变的
 * 字符串连接   长度    查找字符串位置
 */
public class String1 {
	
	public static void main(String[] args) {
		String str = "abcdef";   //String类型定义字符串相当于char型数组
		char[] data = {'a','b','c'}; 
		String str1 = new String(data);
		String str2 = "大连计算机与软件学院+软件工程+用计算机做软件";
		String str3 = "ABCDEF";
		String str4 = " abcdef ";
		char c= '与';
		System.out.println("字符串连接  :"+str+str1);//+第一种字符串连接方式
		System.out.println("字符串连接  :"+str.concat(str1));//concat第二种字符串连接方式
		System.out.println("获取字符串的长度字符串长度  :"+str.length());
		System.out.println("查找String类型'软件'第一次出现的位置"+str2.indexOf("软件"));
		System.out.println("指定位置后查找字符'软件'的位置"+str2.indexOf("软件",10));
		System.out.println("查找字符'里'的位置 :"+str2.indexOf("里"));//查找不到返回-1
		System.out.println("查找字符'大'的位置  :"+str2.indexOf("大"));//从char数组下交标为0开始查
		System.out.println("查找字符'编'的位置 :  "+str2.indexOf(c));
		System.out.println("从末尾先前查找字符'软件'的位置   :  "+str2.lastIndexOf("软件"));
		System.out.println("指定位置后查找字符'软件'的位置"+str2.lastIndexOf("软件",10));
		System.out.println("将字符转换为大写    :" +str.toUpperCase());
		System.out.println("将字符转换为小写写    :" +str3.toLowerCase());
		System.out.println("除去任何前导和尾随空格:"+str4.trim());
		System.out.println("字符串本身"+ str3.toString());
		System.out.println("截取字符: "+str2.charAt(3));

	}

}
