#include<stdio.h>
int sum(int n)
{
	int s=0;
  	while(n>0)
    {
      s+=n;
      n-=1;
    }
  return s;
}
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
    printf("%d",sum(n));
  	return 0;
}