#include<iostream>
using namespace std;
int main()
{
  int k;
  std::cin>>k;
 // std::cout<<k;
  int ct;
  int sq=k*k;
  int sum;
  int temp1=k;
  int temp=sq;
   
  while(k>0)
  {
    ct++;
    k=k/10;
  }
  
  int div=1;
  for(int i=0;i<ct;i++)
  {
    div=div*10;
  }
  int num=0;
  num=temp%div;
  
  sq=sq/div;
  sum=sq+num;
  //std::cout<<num<<" ";
//std::cout<<sum;
 if(sum==temp1)
  std::cout<<"Kaprekar Number";
  else
     std::cout<<"Not a Kaprekar Number";    

}