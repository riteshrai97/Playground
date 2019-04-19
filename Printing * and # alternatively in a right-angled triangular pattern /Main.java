#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  char sym='#';
  for(int cur_row=1;cur_row<=n;cur_row++)
  {
    for(int cur_col=1;cur_col<=cur_row;cur_col++)
    {
      if(sym=='#')
      {
        printf("*");
        sym='*';
      }
      else
      {
        printf("#");
        sym='#';
      }
    }
    printf("\n");
  }
        
      
  	return 0;
}