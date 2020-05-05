#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int a[n][n];
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
   {
   std::cin>>a[i][j]; 
   }
  }
  int sum;
   for(int i=0;i<n;i++)
  {
   sum=sum+a[i][i]; 
  }
 // std::cout<<sum;
  int s;
   for(int i=0;i<n;i++)
  {
   s=s+a[i][n-i-1]; 
  }
  if(sum==s)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}