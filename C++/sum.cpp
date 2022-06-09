#include<iostream>
using namespace std;

int main(){
    int a = 13, b = 14;
    float f1 = 1.3, f2 = 2.3;

    int sum = a+b;
    float sumf = f1+f2;
    
    cout<<"Sum of int variables: " << sum << endl;// to give a new line we can use endl or \n at the end of line
    cout<< "Sum of float variables: "<<sumf;

    return 0;
}