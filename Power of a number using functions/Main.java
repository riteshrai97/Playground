#include<stdio.h>
int power(int a, int b)
{
  int res=1;
  while(b>0)
  {
    res=res*a;
    b--;
  }
  return res;
}
int main(){
    // Type your code here
  int a,b;
  scanf("%d %d",&a,&b);
  printf("%d",power(a,b));
  	return 0;
}