#include<stdio.h>
int isprime(int n)
{
  int count=0;
  for(int i=2;i<=n;i++)
    if(n%i==0)
      count++;
  if(count==1)
    return 1;
  else
    return 0;
}
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
    if(isprime(i))
      printf("%d\n",i);
    return 0;
}