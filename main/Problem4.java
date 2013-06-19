package main;

class Problem3 {
	static public void main(String...args) {
		System.out.println("helllooooo");			
		long factor = 1;
		long start = 600851475143L;
		long test = 0;
		while(true){
			if(start % factor!=0){
				factor++;
				continue;
			}
			test = start / factor++;
			boolean prime = true;
			System.out.println("start2: "+ test);
			for (long i = 2; i< Math.sqrt(test); i++){
				//System.out.println("i: "+ i);
				if(test%i==0){
					prime=false;
				}	
				
			}			 
			if (prime) {
				break;
			}
		}
		System.out.println(test);
	}

}	
