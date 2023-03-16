#include <iostream>
#include <cstring>

class Patient
{
	public:
		Patient()
		{
		PatientId=1000;
		PatientName="Ballu";
		BedType=1;
		Days=1;
		#ifdef TESTING
		puts("Instance Initailized");	
		#endif
		}

		Patient(int Id, std::string Name, int type, int days)
		{
		PatientId=Id;
		PatientName=Name;
		BedType=type;
		Days=days;
		#ifdef TESTING
		puts("Instance Initailized");	
		#endif
		}

		int GetId()
		{
		 return PatientId;
		}
		
		void SetId(int Id)
		{
			PatientId=Id;
		}
	
		
		std::string GetName()
		{
		 return PatientName;
		}
		
		void SetName(std::string Name)
		{
			PatientName=Name;
		}


		int GetBedType()
		{
		 return BedType;
		}
		
		void SetBedType(int type)
		{
			BedType=type;
		}
		
		int Getdays()
		{
		 return Days;
		}
		
		void SetDays(int days)
		{
			Days=days;
		}
	
		int BedPrice()
		{ 
		   
		   switch(BedType)
			{
			 case 3:
				 return 200;
			 case 2:
				 return 350;
			 default:
				 return 500;
			}
		
		
		}
		virtual double GetBill()
		{
			return Days*BedPrice();
		}
	
		~Patient()
		{ 

		#ifdef TESTING
		puts("Instance Deinitailized");	
		#endif
		
		}
	private:
		int 	PatientId;
		std::string  PatientName;
		int 	BedType;
		int 	Days;
	
	
};

	class InHousePatient : public Patient


	{
	public: 
		InHousePatient() : Patient()
		{				    
		
		Discount = 0.05;
		}

		double GetBill()

		{

		double	amount = Getdays() * BedPrice();
			if (amount>5000)
			{	
				return amount*(1-Discount);
			}
			return amount;
		}	


	private:
		float Discount;
	



	};	


