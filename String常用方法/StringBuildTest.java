package demo1020;
/*
 * StringBuilder��StringBuffer��������
 */
public class StringBuildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str2 = new StringBuilder();
		str2.append("����");
		str2.append("����ý������ϵ");
		System.out.println("�ڵ�ǰ�ַ�����׷���ַ���    "+str2);
		System.out.println("����'��'��λ�� ��    "+str2.indexOf("��"));
        System.out.println("�����ַ� ��ƫ����Ϊ4 ��λ�ò���abcde :"+str2.insert(4,"abcde"));
        System.out.println("ɾ��:   "+ str2.delete(2, 4));
        System.out.println("�ַ�����ת  �� "+str2.reverse());
	}

}
