package demo1015;
/*   1-100�ۼӺ�                  ѭ���ṹ
 * 
 */        
public class AddNum {
	
	public static void main(String[] args) {
//forѭ��
	/*	
		 int num=1;
		 int sum = 0;
	    for(;num<=100;num++) {
	    	sum += num;
	    	
	    }
	    System.out.println(sum);
*/
//do-whileѭ��      ��ִ��һ�Σ����ж�

		 int num=1;
		 int sum = 0;
		do{
			sum += num;
			num++;
			
			
		}while(num<=100);
		System.out.println(sum);
		//whileѭ��        ���жϣ���ִ��
/*		 int num=1;
		 int sum = 0;
		while(num<=100) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum);
*/		
		
		
//��ǿforѭ��
	/*
		int[] numbers = {10,20,30,40,50};
		for(int x : numbers) {
			System.out.println(x);
			
		}
	
	*/
	}
}
