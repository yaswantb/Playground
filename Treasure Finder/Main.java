#include<iostream>
using namespace std;
int gcd(int x,int y,int z,int s)
{
	if(x%s==0 && y%s==0 && z%s==0 )
      return(s);
  else
  s--;
}
int main()
{
  //Type your code here.
  int x,y,z;
  std::cin>>x>>y>>z;
 int small=x>y?(x<z?x:(y>z?y:z)):(x>z?x:(y<z?y:z));
	std::cout<<"The treasure is in box which has number "<<small;
  int gc=gcd(x,y,z,small);
  std::cout<<"\nThe code to open the box is "<<gc;
  
}