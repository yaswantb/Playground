#include<iostream>
#include<string>
#include<cstring>
using namespace std;
int main()
{
  std::string ch[20],ch1[20];
  int i=0,a=0;
  char str[100];
  while(std::cin>>ch[i])
    i++;
  for(int j=0;j<i-1;j++)
  {
    for(int k=j+1;k<i;k++)
    {
      if(ch[j].compare(ch[k])==0)
      {
		ch[j].clear();  
        ch[k].clear();
      }
      }    
  }
  //for(int x=0;x<i;x++)
  std::cout<<"remove occurrence of word from entered string";
   
}