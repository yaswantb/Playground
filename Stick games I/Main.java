#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c;
  std::cin>>r>>c;
  int num=0;
  int sum=r+c;
  int inter=r*c;
  int arr[r][c];
  int ct=0;
  while(r*c>0)
  {
    r--;
    c--;
    ct++;
  }
  if(ct%2==0)
    std::cout<<"Mani Iyer";
  else
    std::cout<<"Arun Gupta";
}