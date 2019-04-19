#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  while(n>0)
  {
    if(n/100==0)
    {
      printf("%d",n%10);
        break;
    }
    n=n/10;
  }
	return 0;
}