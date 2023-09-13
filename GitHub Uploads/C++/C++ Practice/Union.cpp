#include<iostream>
using namespace std;

union Emp{
	int id; //4bytes
	double sal; //8bytes
	char i; //1byte
};

int main(){
	
	//union is a datatype to store different data types in the same memory location
	
	/*
	union emp{ //size equals to size of largest member
	
		double sal;
		int age;
	
	}
	*/
	
	union Emp E;
	
	E.id=123;
	cout<<E.id<<endl;
	
	E.sal=1234;
	cout<<E.sal<<endl;
	
	cout<<sizeof(E);
	
	
	return 0;
}