#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int x=n;
  int c=0;
  int ct,sum;
  while(n>0)
  {
    n=n/10;
    c++;
  }
  n=x;
   while(n>0)
  {
   
     ct=n%10;
    sum=sum+power(ct,c);
   n=n/10;
   }
  if(sum==x)
    return(1);
    else
      return(0);
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1 )
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}