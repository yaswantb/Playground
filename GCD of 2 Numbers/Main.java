#include<iostream>
int gcd(int,int);
int main()
{
  //Type your code here.
  int a,b;
  std::cin>>a>>b;
  int res=gcd(a,b);
  std::cout<<"G.C.D of "<< a <<" and "<< b <<" = "<<res;
  return(0);
}
int gcd(int a,int b)
{
  if(b!=0)
    return gcd(b,a%b);
  else
    return a;
}