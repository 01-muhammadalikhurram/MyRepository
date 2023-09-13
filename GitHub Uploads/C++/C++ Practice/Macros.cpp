//Macros
#include<iostream>
using namespace std;

#define PI 3.141//defined a constant value
#define Square(r) (r*r)//defined a function

int main(){
	
	double radius;
	
	cout<<"Enter Radius: ";
	cin>>radius;

	double area = PI*Square(radius);
	
	cout<<"Area of Circle: "<<area;
	
	return 0;
	
}