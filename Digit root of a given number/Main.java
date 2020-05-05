#include<iostream>

int sum(int );
int lastdig(int );

int main()
{
   int n;
  std::cin>>n;
  int res=lastdig(n);
   std::cout<<res;
  
}

int lastdig(int n)
{
 if (n<10)
   return n;
  else{
    n=sum(n);
  	return lastdig(n);
  }
   
}

int sum(int n)
{
  int s=0;
 while(n>0)
 {
   s=s+n%10;
   n=n/10;
 }
	return s;  
}