#include<iostream>
int main()
{
  // Type your code here
  int n,key;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    std::cin>>arr[i];
  std::cin>>key;
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(arr[i]==key){
      std::cout<<"She passed her exam"; 
     flag=1;
      break;
     
    }
  }
  if (flag==0)
    std::cout<<"She failed"; 
  
}