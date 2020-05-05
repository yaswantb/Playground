#include<iostream>

void swap(int &a,int &b)
{
  int temp;
  temp=a;
  a=b;
  b=temp;

}
int main()
{
 int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  swap(a,b);
  std::cout<<"\nAfter swapping a= "<<a<<" and b="<<b;
}