#include<stdio.h>
int main()
{
  //fill the code
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i=0;i<arr_size;i++)
    scanf("%d",&arr[i]);
  int max=arr[0];
  for(int i=1;i<arr_size;i++)
    if(arr[i]>max)
      max=arr[i];
  printf("%d",max);
    
  return 0;
}