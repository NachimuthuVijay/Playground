#include <stdio.h>
int main() {
  int num,temp,sum=0,n1;
  int fact(int n);
  scanf("%d",&num);
  n1=num;
  while(num!=0)
  {
  	temp=num%10;
    sum=sum+fact(temp);
    num=num/10;
  }
  if(sum==n1)
    printf("Yes");
  else
    printf("No");
    return 0;
}
int fact(int n)
{
  if(n==1)
    return 1;
  else
	return n*fact(n-1);
}