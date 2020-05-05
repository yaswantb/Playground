#include<iostream>
using namespace std;
int power(int ,int );
int main()
{
  //Type your code here.
  int a,n;
  std::cin>>a>>n;
  int p=power(a,n);
  
  
  std::cout<<"Enter the value of a\nEnter the value of n\nThe value of "<<a<<" power "<<n<<" is "<<p;
}

int power(int a,int n)
{
 if(n==0)
   return 1;
  else
    return a*power(a,n-1);
  
}