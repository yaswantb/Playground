#include <iostream>
#include <cmath>
int main()
{
 int n;
  float sum=0.5;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cout<<sum<< " ";
    sum=sum+pow(3,i);
    
    
  }
 
}