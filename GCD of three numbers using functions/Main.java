#include <stdio.h>
int gcd(int a,int b)
{
  int min;
  if(a<b)
    min=a;
  else
    min=b;
  while(min>0)
  {
    if(a%min==0 && b%min==0)
      return min;
    else
      min--;
  }
}
int main() {
	//Type your code here
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  printf("%d",gcd(gcd(a,b),c));
	return 0;
}