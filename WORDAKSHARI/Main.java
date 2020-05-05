#include<iostream>

#include<string>
using namespace std;
int main()
{
  //Type your code here.
  std::string str[100];
  int i=-1;
  do{
    i++;
    std::cin>>str[i];
  }while((int)str[i][0]!=35);
  std::cout<<str[0]<<"\n";
 for(int j=0;j<i;j++)
 {
   if(str[j+1][0]==str[j][str[j].size()-1])
     std::cout<<str[j+1]<<"\n";
 }
  
 // std::cout<<str[0]<<str[1].size()<<i;
  
}