#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c;
  int arr[r][c],b[r][c];
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        std::cin>>arr[i][j];
      }
    }
       for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        std::cin>>b[i][j];
      }
    }
  
   for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        std::cout<<arr[i][j]+b[i][j]<<" ";
      }
     std::cout<<"\n";
    }
}