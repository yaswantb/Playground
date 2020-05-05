#include <iostream>
int main()
{
char str[100], rev[100];     
int count = 0, i=0,end=0;    
//Your code goes here
  std::cin.get(str,100);
  while((str[i]!='\0') )// (str[i]=='\0' && str[i+1]!='\0') )
  {
    count++; 
    i++;
  }
  for(int j=count-1;j>=0;j--)
  {
    rev[end]=str[j];
    end++;
  }
  for(int x=0;x<count;x++){
    
    std::cout<<rev[x];
  }
  //std::cout<<count;
}