#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int vow=0,con=0,space=0,dig=0,sym=0;
  std::string str;
  getline(std::cin,str);
  for(int i=0;i<str.size();i++)
  {
    if(str[i]>=65 &&str[i]<=90  || str[i]>=97 &&str[i]<=122)
    {
  		 if(str[i]=='a' || str[i]=='e' ||str[i]=='i' ||str[i]=='o' ||str[i]=='u' ||str[i]=='A' ||str[i]=='E' ||str[i]=='I' ||str[i]=='O' ||str[i]=='U' ) 
			vow++;
  		 else
    		 con++;
    }
    else if((int)str[i]==32)
      space++;
    else if(str[i]>='0' && str[i]<='9')
      dig++;
    else
      sym++;
  }
  std::cout<<"Vowels:"<<vow;
  std::cout<<"\nConsonants:"<<con;
    std::cout<<"\nWhite Spaces:"<<space;
  std::cout<<"\nDigits:"  <<dig;
  std::cout<<"\nSymbols:"  <<sym;
  
}