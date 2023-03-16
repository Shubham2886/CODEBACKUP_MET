#include <stdlib.h>
#include <iostream>
#include <string>
#include "Hospitaltest1.h"

using namespace std;

double GetHospital(Patient& pass)

	{
	int amount = 0;
	amount= pass.GetBill()*1.05;	
	return amount;


	}

void SetGet(Patient& P)
	{ 
 	 int ID, type, days;
 	 string name;

 	 cout << "Enter ID" << endl;
 	 cin >> ID;
 	 P.SetId(ID);
 	 cout <<"ID="<<P.GetId() << endl;
  
 	 cout<< "5Enter Name" <<endl;
 	 cin>> name;
 	 P.SetName(name);
 	 cout<<"name:"<<P.GetName() << endl;
 
 	 cout << "Enter bed type" << endl;
 	 cin >> type;
 	 if (type>3)
 	 {
	 cout<<"Invalid Input"<< endl;
	 exit;
 	 }	
 	 P.SetBedType(type);
 	 cout << "BedType:"<< P.GetBedType() << endl;

 	 cout<< "Enter number of days admitted" << endl;
 	 cin >> days;
  
 	 P.SetDays(days);
 	 cout<< "Number of days admitted:"<< P.Getdays() << endl;
	}

 int main (void)
	
	 {
 	 int temp;
 	 cout<<"press 1 for Regular Patient\n2 for In housePatient"<< endl;
 	 cin>> temp;
	 if(temp==2)	
	 {
   	   	InHousePatient a;
   	   	SetGet(a);

 	   cout<< "Billamount:"<< GetHospital(a) <<endl;
	 }
	 else
 	{
 	  	Patient regular;
 	  	SetGet(regular);
 	  cout<< "Billamount:"<< GetHospital(regular) <<endl;
 	}
  

}
