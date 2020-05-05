#include<iostream>
using namespace std;
int main()
{
 
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array\n";
  std::cin>>n;
   std::cout<<"Enter the elements in the array\n";
  int a[n];
  int eveflag=0,oddflag=0;
  for(int i=0;i<n;i++)
   {
    std::cin>>a[i];
  	if(a[i]%2==0)
      eveflag=1;
    else
      oddflag=1;
  }
  if(eveflag==1 && oddflag==1)
    std::cout<<"The array is Mixed";
  else if(eveflag==1)
     std::cout<<"The array is Even";
  else
     std::cout<<"The array is Odd";
    
    
}