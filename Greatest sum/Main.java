#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  std::cout<<"Sum of rows is ";
    int rmax=0;
  int cl=0;
  for(int i=0;i<r;i++)
  {
    int row=0;
  for(int j=0;j<c;j++)
  {
     row=row+a[i][j];
  } 
    if(row>rmax){
      rmax=row; 
      cl=i+1;
      //std::cout<<;
    }
    std::cout<<row<<" ";
  }
    std::cout<<"\nRow "<<cl<<" has maximum sum";
  std::cout<<"\nSum of columns is ";
int cmax=0;
  int ct=0;
  int col;
  for(int i=0;i<c;i++)
  {
    col=0;
  for(int j=0;j<r;j++)
  {   
     col=col+a[j][i];
  } 
  if(col>cmax){
   cmax=col;
    ct=i+1;
  }
    std::cout<<col<<" ";
  }
    std::cout<<"\nColumn "<<ct<<" has maximum sum";
}