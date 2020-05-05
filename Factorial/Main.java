#include<iostream>
int fact(int );
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int pr=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<pr;
}

int fact(int n)
{
  if(n>0)
  return n*fact(n-1); 
	else
      return 1;
}