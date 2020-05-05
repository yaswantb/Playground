#include<iostream>
using namespace std;

struct col{
	char name[10],city[20];
  int year;
  float pass;
};
int main()
{
  int n;
  std::cout<<"Enter the number of colleges";
  std::cin>>n;
  col s[n];
  for(int i=0;i<n;i++){
  std::cout<<"\nEnter the details of college "<<i+1;
  std::cout<<"\nEnter name";
   std::cin>>s[i].name;
    std::cout<<"\nEnter city";
   std::cin>>s[i].city;
    std::cout<<"\nEnter year of establishment";
   std::cin>>s[i].year;
    std::cout<<"\nEnter pass percentage";
   std::cin>>s[i].pass;
  }
  std::cout<<"\nDetails of colleges";
  for(int i=0;i<n;i++){
  std::cout<<"\nCollege:"<<i+1;
  std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nCity:"<<s[i].city;
    std::cout<<"\nYear of establishment:"<<s[i].year;
    std::cout<<"\nPass percentage:"<<s[i].pass;
  }
  
}