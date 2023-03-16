#include<cstdio>
#include<cmath>
class Investment
{
	public:
		Investment()
		{
		amount = 1000;
		period = 3;
		#ifdef TESTING
		puts("Initialized instance");
		#endif
		}
		const double GetAmount()
		{
		return amount;
		}


		void SetAmount(double a)
		{	
			amount=a;
		}

		const int GetPeriod()
		{
		return period;
		}
		void SetPeriod(int p)
		{
			period=p;
		}

	

		double SetRate()
		{	double rate=0;
			
			if(amount<10000)
			{
				rate=8;
			}	
			else if(10000<=amount<=50000)
			{	 
				rate=9;
			}
			else if	(amount>50000)
			{
				rate=10;
			}
			
			
			if (period>5)
			{
			  rate+= 1;
			}	
			return rate;
		}
		double GetInterest(bool x)

		{
		if(x == true)
			return (amount * period * SetRate()/100);
		else 
		{	
			double CI=(amount* pow((1+SetRate()/100), period));
			return CI-= amount;
		}
		}	
		
		
		~Investment()
		{
		 #ifdef TESTING
		  puts("Instance Deinitialized");
		 #endif	  
		}
	
	private:
		double amount;
		int period;








};
