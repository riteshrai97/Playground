#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int num=n;
  for(int rownum=1;rownum<=n;rownum++)
  {
    for(int colnum=num;colnum>=1;colnum--)
    {
      printf("%d",colnum);
    }
    printf("\n");
    num-=1;
  }
	return 0;
}