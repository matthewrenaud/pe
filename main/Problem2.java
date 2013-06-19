package main;

class Problem2 {
	static public final int target = 1000;
	static public void main(String...args) {
		System.out.println("helllooooo");			
		int f0 = 1;
		int f1 = 2;
		int f = 0;
		int sum = 2;
		while(true){
			f = f1 + f0;
			if (f >= 4000000){
				break;
			}	
			if (f %2 ==0){
				sum += f;
			}
			f0 = f1;
			f1 = f;
		}
		System.out.println(sum);
	}

}	
