#include<iostream>
using namespace std;

main(){
	
	int a=10;
	int*p=&a;
	int**q=&p;
	
	cout<<a<<endl;
	cout<<p<<endl;
	cout<<&a<<endl;
	cout<<*p<<endl;
	cout<<q<<endl;
	cout<<*q<<endl;
	cout<<**q<<endl;	
	
}