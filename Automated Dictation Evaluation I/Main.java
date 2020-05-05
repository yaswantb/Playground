#include <cstring>
#include <iostream>
int main()
{
   char ptr[50];
   char ch[50];
  std::cin>>ptr>>ch;
//  std::cin.get(ch,50);
  
  int i=0;
  i=std::memcmp(ptr,ch,strlen(ptr));
  if(i<0)
    std::cout << "It is wrong ";
  else if(i>0)
    std::cout <<"It is wrong ";
  else
    std::cout <<  "It is correct ";
}