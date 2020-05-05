#include<iostream>
using namespace std;

struct dist{
	int inch;
  float feet;
}t1,t2;

int main()
{
  int in=0;
  float fe;
  std::cin>>t1.inch>>t1.feet>>t2.inch>>t2.feet;
  in=t1.inch+t2.inch;
  fe=t1.feet+t2.feet;
  if(fe>=12){
    in++;
    fe=fe-12;
  }
  std::cout<<in<<"'-"<<fe<<"\"";
}