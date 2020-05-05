#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string str,str1;
  std::string cp; 
  int flag=0;
  std::cin>>str>>str1;
  int j=str.size()-1;

  for(int i=0;i<str.size();i++)
  {
    if(str[i]==str1[j])
      flag++;
    j--;
  }
  if(flag==str.size())
  std::cout<<"It is correct";
  else
  std::cout<<"It is wrong";
    
}