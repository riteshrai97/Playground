#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int num=n;
  int num_of_digits=0;
  int sum=0;
  while(num>0)
  {
    num_of_digits++;
    num=num/10;
  }
  num=n;
  while(n>0)
  {
    sum=sum+(pow((n%10),num_of_digits));
    n=n/10;
  }
  if(num==sum)
    printf("Armstrong Number");
  else
     printf("Not an Armstrong Number");
  
  
	return 0;
}