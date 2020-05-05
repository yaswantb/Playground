#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  std::cin>>str;
  for(int i=0;i<strlen(str);i++)
  {
    if((int)str[i]>=65 && (int)str[i]<=90 || (int)str[i]>=97 && (int)str[i]<=122)
    std::cout<<str[i];
  }
  
}