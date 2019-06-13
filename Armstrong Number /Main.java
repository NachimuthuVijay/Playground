#include <stdio.h>
#include<math.h>
int main() {
	int n,digit,temp,sum=0,n1;
    int NOD(int x);
  scanf("%d",&n);
  n1=n;
  digit=NOD(n);
 // printf("DIGIT:%d",digit);
  while(n!=0)
  {
  	temp=n%10;
   // printf("temp:%d",temp);
    sum=pow(temp,digit)+sum;
    n=n/10;
    //printf("\nsum=%d",sum);
    //printf("\nnum=%d",n);
  }
  if(sum==n1)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}
int NOD(int x)
{
	int tem=0;
  while(x!=0)
  {
  	tem++;
    x=x/10;
  }
  //printf("%d",tem);
  return tem;
}