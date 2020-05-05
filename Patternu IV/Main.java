#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  std::cin>>n;
  int k=0;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0){
    k++;
    for(int j=1;j<n;j++)
    {
    	std::cout<<k;
    }
    std::cout<<++k<<"\n";
  }
    else{
      std::cout<<++k;
      k--;
    for(int j=1;j<n;j++)
    {
    	std::cout<<k;
    }
      std::cout<<"\n";
    
    }
  }
    return 0;
}