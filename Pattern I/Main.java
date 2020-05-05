#include<iostream>
int main()
{
 int n;
  std::cin>>n;
  for(int i=1;i<5;i++)
  {
    for(int j=0;j<i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
    n=n+1;
  }
  for(int i=4;i>0;i--)
  {
     n=n-1;
    for(int j=0;j<i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
   
  }
  
  
  
  
  
}