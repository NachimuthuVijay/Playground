#include <stdio.h>
int main() {
	//Type your code
  int n,count;
  scanf("%d",&n);
  for(count=1;count<=n;count++)
  {
  	if(count%2==1)
      {
      printf("%d\n",count);
       }
  }
	return 0;
}