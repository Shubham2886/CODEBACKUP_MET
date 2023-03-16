#define TESTING 
#include"Investment.h"
#include<cstdio>
bool Intrest(int y)
{
	if (y==1)
	return true;
	
       return false;	
}	

int main(void)
{
	int temp;
	double pri;
	int period;
	printf("Enter amount,period\n");
	scanf("%lf%d",&pri, &period);

	Investment a;
	a.SetAmount(pri);
	printf("Amount is %lf\n",a.GetAmount());	
	
	a.SetPeriod(period);
	printf("Period is %d\n",a.GetPeriod());	
	
	
	
	printf("Rate is %lf\n",a.SetRate());
	printf("Press 1: SI\nPress 2:CI\n");
	scanf("%d",&temp);
	bool x;
	x= Intrest(temp);
	double Int=a.GetInterest(x);
	printf("Interest is %lf\n",Int);
	

}
