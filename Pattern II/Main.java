#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int k=0;
  int j;
  for(int i=1;i<=n;i++)
  {
   
    if(i%2!=0)
    {
      for(j=k+1;j<k+i;j++)
      {
        std::cout<<j<<"*";
      }
      std::cout<<j<<"\n";
      k=j;
    }
    else
    {
      k=k+i-1;
      for(j=k+1;j>k-i+2;j--)
      {
        std::cout<<j<<"*";
      }
      std::cout<<j<<"\n";
      k=k+1;
    }
    
    
  }
  
  
  
}