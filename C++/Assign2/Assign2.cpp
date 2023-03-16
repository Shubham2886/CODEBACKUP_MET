#include "money.h"
#include <cstdio>

int main(void)
{	
	int m, p;

	printf("Enter Rupees and Paise in your wallet\n");
	scanf("%d %d",&m, &p);
	Money a(m,p);
	a.Print();

	printf("Enter Rupees and paise from you neightbour wallet\n");
	scanf("%d %d", &m, &p);
	Money b(m,p);
	b.Print();

	Money c=a+b;
	      c.Print();
	      c=a-b;
	      c.Print();
	
      
		
}	
