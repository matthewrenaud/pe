package main;

class Problem1 {
	static public final int target = 1000;
	static public void main(String...args) {
		System.out.println("helllooooo");			
		boolean[] boolArray = new boolean[target];
		int sum = 0;
		for (int i = 1; i < boolArray.length; i++) {
			if (i % 3==0 || i % 5 == 0){
				sum +=i;
			} 		
		}
		System.out.println(sum);
	}

}	
