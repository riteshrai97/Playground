#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int rownum=1; rownum<=n; ++rownum)
  {
    for(int space=1; space<=n-rownum; ++space)
    {
      printf(" ");
    }
    for(int colnum=1; colnum<=2*rownum-1; ++colnum)
    {
		printf("*");
    }
    printf("\n");
  }
	return 0;
}