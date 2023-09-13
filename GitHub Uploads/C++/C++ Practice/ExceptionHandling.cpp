//Exception Handling
#include<iostream>
#include<stdexcept>
using namespace std;

main(){
	
	double bal=10000.00;
	double amt;
	
	try{
		cout<<"Enter deposit amount: ";
		cin>>amt;
		if(amt<=0){
//			cout<<"Invalid!\n";
			throw invalid_argument("Invalid Deposit Amount");
		}
		else{
			bal+=amt;
			cout<<"Current bal: "<<amt<<endl;
		}
		cout<<"Enter withdraw amount: ";
		cin>>amt;
		if(amt>bal){
			cout<<"Invalid!\n";
			throw invalid_argument("Insufficient Funds");
		}
		else{
			bal-=amt;
			cout<<"Current bal: "<<amt<<endl;
		}
	}
	catch(exception& e){
		e.what();
	}
	
}