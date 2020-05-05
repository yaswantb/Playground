#include<iostream>
using namespace std;
int gcd(int,int ,int ,int);
int main()
{
 int a,b,c,n;
  std::cin>>a>>b>>c>>n;
  int small;
  small=a<b?(a<c?a:c):(b<c?b:c);
  int gc;
  gc=gcd(small,a,b,c);
  if (gc==n)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}

int gcd(int small,int a,int b,int c)
{
  if(a%small==0 &&b%small==0 && c%small==0)
  {
    return small;
  }
  small--;
}