#include <stdio.h>
int main() {
	//Type your code
  int n, first_digit,last_digit;
  scanf("%d",&n);
  first_digit=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  last_digit=n;
  int sum=first_digit+last_digit;
  printf("%d",sum);
	return 0;
}