import acm.program.*;

public class Perfect extends ConsoleProgram {

		public void run(){
			println("This program calculates Perfect Numbers in the range specified by the constant!");
				for(int i = 1; i < RANGE; i++){
					if(isPerfect(i)){
						println(i + " is a Perfect Number!");
					}
				}
			}
		
		private Boolean isPerfect(int n){
			int temp = 0;
			for(int i = 1; i < n; i++){
				if(n % i == 0){
					temp += i;
				}
			}
			if(temp != n){
				return false;
			}
			return true;
		}
	 private static final int RANGE = 10000;
}
