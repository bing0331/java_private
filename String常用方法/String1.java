package demo1020;
/*�ַ���
 * String����ʱ���ɱ��
 * �ַ�������   ����    �����ַ���λ��
 */
public class String1 {
	
	public static void main(String[] args) {
		String str = "abcdef";   //String���Ͷ����ַ����൱��char������
		char[] data = {'a','b','c'}; 
		String str1 = new String(data);
		String str2 = "��������������ѧԺ+�������+�ü���������";
		String str3 = "ABCDEF";
		String str4 = " abcdef ";
		char c= '��';
		System.out.println("�ַ�������  :"+str+str1);//+��һ���ַ������ӷ�ʽ
		System.out.println("�ַ�������  :"+str.concat(str1));//concat�ڶ����ַ������ӷ�ʽ
		System.out.println("��ȡ�ַ����ĳ����ַ�������  :"+str.length());
		System.out.println("����String����'���'��һ�γ��ֵ�λ��"+str2.indexOf("���"));
		System.out.println("ָ��λ�ú�����ַ�'���'��λ��"+str2.indexOf("���",10));
		System.out.println("�����ַ�'��'��λ�� :"+str2.indexOf("��"));//���Ҳ�������-1
		System.out.println("�����ַ�'��'��λ��  :"+str2.indexOf("��"));//��char�����½���Ϊ0��ʼ��
		System.out.println("�����ַ�'��'��λ�� :  "+str2.indexOf(c));
		System.out.println("��ĩβ��ǰ�����ַ�'���'��λ��   :  "+str2.lastIndexOf("���"));
		System.out.println("ָ��λ�ú�����ַ�'���'��λ��"+str2.lastIndexOf("���",10));
		System.out.println("���ַ�ת��Ϊ��д    :" +str.toUpperCase());
		System.out.println("���ַ�ת��ΪСдд    :" +str3.toLowerCase());
		System.out.println("��ȥ�κ�ǰ����β��ո�:"+str4.trim());
		System.out.println("�ַ�������"+ str3.toString());
		System.out.println("��ȡ�ַ�: "+str2.charAt(3));

	}

}
