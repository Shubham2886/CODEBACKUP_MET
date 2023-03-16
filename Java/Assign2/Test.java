import math.MathUtility;
class Test {
	public static void main(String[] args) {

int	p = Integer.parseInt(args[0]);
int	q = Integer.parseInt(args[1]);
//char    bytes[]=Charachter.parseChar(args[0]);
//int 	count=bytes.length();
		boolean e = MathUtility.isEven(p);{
		if(e==true)
			 System.out.println("Number is even");
		else 
			 System.out.println("Number is not even");
		}

		boolean f = MathUtility.isOdd(p); {

		if(f==true)

			 System.out.println("Number is odd");
		else
			 System.out.println("Number is not odd");


		}

		boolean k = MathUtility.isPrime(p); {


		if(k==true)

			 System.out.println("Number is prime");
		else
			 System.out.println("Number is not prime");
		}
		

		System.out.printf("Number of digit is:%d%n",MathUtility.countDigit(p));

		
		System.out.printf("Reverse of digit is:%d%n",MathUtility.reverseNumber(p));

		System.out.printf("number of countprimes is %d%n",MathUtility.countPrimes(p, q));

	}

}
