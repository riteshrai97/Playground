#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int res=1;
  for(int i=1;i<=n;i++)
    res=res*i;
  printf("%d",res);
	return 0;
}