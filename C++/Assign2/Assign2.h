#include <cstdio>
class Money
{
	private:
		int rupees;
		int paise;	
	public:
		Money(int rupees=0, int paise=0)
		{
		this->rupees=rupees+paise/100;
		this->paise=paise%100;
		#ifdef TESTING
		puts ("Instance Initalize");
		#endif
		}
	/*	
		void Access(int m,int p)
		{
			rupees=m;
			paise=p;
		}
	*/

		Money operator+(const Money& op2) const 
		{
		return Money(rupees+op2.rupees, paise+op2.paise);
		}
	
		Money operator-(const Money& op2) const 
		{	
		 return Money(rupees-op2.rupees, paise-op2.paise);
		}
		
		void Print() const
		{
			printf("%d.%02d\n",rupees, paise);
		}
		~Money()
		{	
		#ifdef TESTING
		puts ("Instance DE-Initalized");	
		#endif
		}

};
