#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,odd,even,x;
  std::cin>>n;
  while(n>0)
  {
    x=n%10;
    if(x%2==0)
    even=even+x;
    else
      odd=odd+x;
    n=n/10;
  }
  if(odd==even)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}