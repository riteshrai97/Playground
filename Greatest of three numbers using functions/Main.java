#include <stdio.h>
int greatest(int a, int b, int c)
{
  int res;
  if(a>b)
    res=a;
  else
    res=b;
  if(res>c)
    return res;
  else
    return c;
}
int main(){
	// Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  printf("%d",greatest(a,b,c));
  	return 0;
}