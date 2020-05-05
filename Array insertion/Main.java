#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  std::cout<<"\nEnter the elements in the array";
  int a[n],b[n+1];
  for(int i=0;i<n;i++){
  std::cin>>a[i];
   // std::cout<<a[i]<<"\n";
  }
  std::cout<<"\nEnter the location where you wish to insert an element";
  int loc;
  std::cin>>loc;
  if(loc>n)
    std::cout<<"\nInvalid Input";
  else{
  std::cout<<"\nEnter the value to insert\n";
  int val;
  std::cin>>val;
  if(loc<=n)
  {
	for(int i=0;i<n+1;i++)
    {
      if(i!=loc-1)
      b[i]=a[i];
      else{
        b[i]=val;
    	break;
      }
    }
    for(int i=loc;i<n+1;i++)
    {
      b[i]=a[i-1];
    } 
  }
  
  std::cout<<"Array after insertion is\n";
 for(int i=0;i<n+1;i++)
    std::cout<<b[i]<<"\n";
  }
}