#include <cstring>
#include<string>
#include <iostream>
int main()
{
   //Your code goes here
   std::string str;
  getline(std::cin,str);
  int count=0;
  for(int i=0;i<str.size()-1;i++)
  {
   if((int)str[i]==32)
     count++;
  }
  if(count<10)
  std::cout<<"Caption eligible for the contest";
  else
    std::cout<<"Caption not eligible for the contest";
  
}