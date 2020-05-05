#include<iostream>
int main()
{
 int j;
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
   for( j=1;j<i;j++) 
   {
     std::cout<<i<<"*";
   }
    std::cout<<i<<"\n"; 
  }
  for(int i=n;i>0;i--)
  {
   for( j=1;j<i;j++) 
   {
     std::cout<<i<<"*";
   }
    std::cout<<i<<"\n"; 
  }
  
  
}