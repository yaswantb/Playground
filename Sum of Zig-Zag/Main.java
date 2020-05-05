#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  int sum;
  for(int i=0;i<r;i++){
    for(int j=i;j<c-i;j++){
      sum=sum+a[i][j];
    }
  }
   for(int i=0;i<r;i++){
    sum=sum+a[r-1][i]; 
   }
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
  
}