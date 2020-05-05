#include<iostream>
using namespace std;
int main()
{
  //Type your code here
   int a,b,c,d,e,f,g;
  std::cin>>g>>a>>b>>c>>d>>e>>f;
  int t=(a+b+c+d+e)*100;
  if(a>8)
    t+=(a-8)*15;
  if(b>8)
    t+=(b-8)*15;
  if(c>8)
    t+=(c-8)*15;
  if(d>8)
    t+=(d-8)*15;
  if(e>8)
    t+=(e-8)*15;
  int y=(f*100)+int(f*25);
   if(f>8)
    t=t+(f-8)*15;
  t=t+y;
 
  int x=(g*100)+(g*50);
  if(g>8)
    t=t+(g-8)*15;
 
  t=t+x;
  if((a+b+c+d+e)>40)
  {
    int o=(a+b+c+d+e-40)*25;
    t=t+o;
   
  }
  std::cout<<t;
 
 
}


