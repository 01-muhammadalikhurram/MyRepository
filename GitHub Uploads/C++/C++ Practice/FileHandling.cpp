//File Handling
#include<iostream>
#include<fstream>

using namespace std;

main(){
	
	string str;
	char str1;
	
	ifstream inFile;
	ofstream onFile;
	
	onFile.open("C:\\Users\\MUHAMMAD ALI\\OneDrive\\Desktop\\file.txt");
	inFile.open("C:\\Users\\MUHAMMAD ALI\\OneDrive\\Desktop\\file1.txt");
	
	cout<<"File Created Successfully\n";
	
	onFile<<"Data written in file\n";
	
	cout<<"Data written in file\n";
	
//	inFile>>str;

	while(getline(inFile,str)){
		inFile>>str;
	}

	cout<<str;
	
	while(inFile.get(str1)){
		onFile.put(str1);//copiying data
	}
	
	
	inFile.close();
	onFile.close();
	
	
	
}
