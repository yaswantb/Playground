#include<iostream>
int main()
{
   // Type your code here
  int n;
  std::cin>>n;
  int arr[n];
  int max=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  if(arr[i]>max)
    max=arr[i];
  }
  std::cout<<max;
 
}
    