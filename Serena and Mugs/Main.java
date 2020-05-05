#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s;
  std::cin>>n>>s;
  int a[n],sum;
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    sum=sum+a[i];
  }
  if(sum>s)
    std::cout<<"NO";
  else
    std::cout<<"YES";
}