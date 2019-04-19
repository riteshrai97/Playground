#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int num=n;
  int sum=0;
  int digit;
  while(n>0)
  {
    int res=1;
    digit=n%10;
    for(int i=1;i<=digit;i++)
      res=res*i;
    sum=sum+res;
      n=n/10;
  }
  if(num==sum)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}