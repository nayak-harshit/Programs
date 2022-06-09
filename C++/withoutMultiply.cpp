/*
WAP to Multiply two integers without using multiplication, division and bitwise operators, and no loops
*/

#include <iostream>
#include <cstdlib>
using std::cout;
using std::endl;

int withoutMultiply(int a , int b);
int main()
{
    
    int a = 1;
    int b = 5;
    int multiply = withoutMultiply(a,b);

    cout<<"Multiply without multiplication" << endl;

    std::cout<<multiply ;

    return 0;
}

int withoutMultiply(int a , int b)
{
    if (b==0) return 0;

    if(b==1) return a;

    if (b>0)
    {
        for (int i = 1; i < b; i++) {
                return a + withoutMultiply(a, b-i);
            }
    }

    if (b>0)
    {
        b = abs(b);
        for (int i = 1; i < b; i++) {
                return a + withoutMultiply(a, b-i);
            }
    }
    
    return -1;

}
