#include<stdio.h>
int main()
{
  //Type your code here
  int arr_size;
  scanf("%d",&arr_size);
  int arr[arr_size];
  for(int i=0;i<arr_size;i++)
    scanf("%d",&arr[i]);
  int elem1,elem2,index1=-1,index2=-1;
  scanf("%d %d",&elem1,&elem2);
  for(int i=0;i<arr_size;i++)
  {
    if(arr[i]==elem1)
      index1=i;
    if(arr[i]==elem2)
      index2=i;
  }
  printf("%d\n%d",index1,index2);
  return 0;
}