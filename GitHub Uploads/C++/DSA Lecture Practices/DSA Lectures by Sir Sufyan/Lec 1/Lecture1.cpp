using namespace std;

#include<string>
#include<iostream>
//Recommended to create classes in another file and then import them here


//:: is called scope resolution operator

int person::getAge(){
	return (age);
}

void person::setAge(string a){
	name = a;
}

string person::getName(){
	return name;
}

void person::setName(string n){
	name=n;
}

main(){
	
	Person* p = new Person();
	
	int age;
	age=p->getAge();
	
	String name = p->getName();
	
}



