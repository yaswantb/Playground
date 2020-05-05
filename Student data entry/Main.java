#include <iostream>
#include<string>
struct student
{
    char name[50];
    int roll;
    float marks;
}s;
int main() 
{
   //Your code goes here
  std::cin.get(s.name,50);
  std::cin>>s.roll>>s.marks;
  std::cout<<"\nStudent Details\n"<<"Name: "<<s.name<<"\nRoll: "<<s.roll<<"\nMarks: "<<s.marks;
}