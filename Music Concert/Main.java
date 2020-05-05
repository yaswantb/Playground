#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,male=0,fem=0;
  std::cin>>n;
  int *ptr=(int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++){
    std::cin>>*(ptr+i);}
  for(int i=0;i<n;i++){
  // std::cout<<*(ptr+i);
  	if((*(ptr+i))%2==0)
      fem++;
    else
      male++;
  }
  std::cout<<male<<"\n"<<fem;
  return 0;
}