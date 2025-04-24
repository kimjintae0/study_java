package lessson15;

public class LambdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i * i;
		
		System.out.println(inter.la(10));
		
	}
}

//Object o2 (MyInter) i -> i * i;
//new Runnable() {
//	public void run() {
//		
//	}
//}

@FunctionalInterface
interface MyInter{
	int la(int i);
	
}


