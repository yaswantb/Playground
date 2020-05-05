#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int x=-2;
  int s=2;
  int ct=0;
  if(n%2==0){
  for(int i=0;i<n/2;i++)
  {
    for(int j=0;j<2;j++)
    {
     x=x+s;
    	std::cout<<x<<" ";
    }
    s=s+4;
  }
  }
  else{
  for(int i=0;i<n/2+1;i++)
  {
    for(int j=0;j<2;j++)
    {
     x=x+s;
     std::cout<<x<<" ";
     ct++;
     if(ct==n)
        break;
    }
    s=s+4;
  }
  }
  
}