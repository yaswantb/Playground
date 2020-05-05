#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int sum=0;
  int a;
  int ct;
  while(sum<=n)
  {
    std::cin>>a;
    ct++;
    sum=sum+a;
    if(sum>=n)
      break;
  }
  std::cout<<"The number of turns is "<<ct;
}