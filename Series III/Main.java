#include <iostream>
#include <cmath>
int main()
{
 int n;
  int t=6;
  int s=5;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cout<<t<<" ";
    t=t+s;
    s=s+5;
  }
 
}