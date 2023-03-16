package math;
public class MathUtility {
	

	public static boolean isEven(int p){
		if (p % 2==0)
		   return true;
		
		return false;
	}

	public static boolean isOdd(int a){

		if (a%2!=0)
			return true;
		return false;
	}

	public static boolean isPrime(int a){
		 int m;
		if (a==1)
			return false;
		if(a==2||a==3)
			return true;
		if((a%2)==0)
			return false;

		for(m=3; m*m<=a; m+=2)
		{
		 	if((a % m)==0)
				return false;
		}
		return true;
	}

	public static int countPrimes(int a, int b) {

	int term;
	int count = 0;
	boolean x;
	for(term = a; term<=b; ++term){
	x = isPrime(term);
	if(x==true)
		++count;
	}
	return count;
	}


	public static int reverseNumber(int a) {
		int remainder = 0;
		int reverse = 0;
		while(a != 0){
			remainder = a % 10;
			reverse = reverse * 10 + remainder;
			a = a / 10;
			}
		return reverse;
	}	
/*
	public static char revNumber(char bytes[],int count){
		int i,j;
		for (i=0, j=count-1;i<j;++i,--j){
			char ib=bytes[i];
			char jb=bytes[j];

			bytes[i] = jb;
			bytes[j] =ib;
		
		}
		return bytes[];
	}

*/
	public static int countDigit(int a) {

	int j = 1;
	int c = 0;
	do {
		j = j * 10;
		c = c + 1;
	}
	while(j <= a);
	
		return c;
	}
}

