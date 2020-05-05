#include<iostream>
using namespace std;
struct emp{
  char name[30];
  char desig[30];
  int id,age;
  float sal;
}s;

int main()
{
  //Type your code here.
  std::cout<<"Enter name:";
    std::cin>>s.name;
    std::cout<<"\nEnter ID:";
    std::cin>>s.id;
    std::cout<<"\nEnter age:";
    std::cin>>s.age;
    std::cout<<"\nEnter designation:";
    std::cin>>s.desig; 
	std::cout<<"\nEnter Salary:";
    std::cin>>s.sal; 
    std::cout<<"\nEmployee Details";
    std::cout<<"\nName of the Employee : "<<s.name;
    std::cout<<"\nID of the Employee : "<<s.id;
    std::cout<<"\nAge of the Employee : "<<s.age;
  	std::cout<<"\nDesignation of the Employee : "<<s.desig;
  	std::cout<<"\nSalary of the Employee : "<<s.sal;
  }