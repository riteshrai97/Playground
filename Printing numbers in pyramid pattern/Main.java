#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  int num=1;
  for(int rownum=1;rownum<=n;rownum++)
  {
    for(int space=1;space<=n-rownum;space++)
    {
      printf(" ");
    }
    for(int colnum=1;colnum<=rownum;colnum++)
    {
      printf("%d ",num);
      num++;
    }
    printf("\n");
  }
	return 0;
}