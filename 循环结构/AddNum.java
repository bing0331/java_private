package demo1015;
/*   1-100累加和                  循环结构
 * 
 */        
public class AddNum {
	
	public static void main(String[] args) {
//for循环
	/*	
		 int num=1;
		 int sum = 0;
	    for(;num<=100;num++) {
	    	sum += num;
	    	
	    }
	    System.out.println(sum);
*/
//do-while循环      先执行一次，在判断

		 int num=1;
		 int sum = 0;
		do{
			sum += num;
			num++;
			
			
		}while(num<=100);
		System.out.println(sum);
		//while循环        先判断，后执行
/*		 int num=1;
		 int sum = 0;
		while(num<=100) {
			
			sum += num;
			num++;
			
		}
		System.out.println(sum);
*/		
		
		
//增强for循环
	/*
		int[] numbers = {10,20,30,40,50};
		for(int x : numbers) {
			System.out.println(x);
			
		}
	
	*/
	}
}
