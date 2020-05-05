#include<iostream>
#include<cmath>
using namespace std;
void fun(int ,int ,int );

int main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
fun(m,n,req);
  return(0);
}

void fun(int m,int n,int req)
{
  if(pow(m,n)>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}