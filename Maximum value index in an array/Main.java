#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int max=arr[0];
  int index=0;
  for(int i=1;i<n;i++)
    if(arr[i]>max)
    {
      max=arr[i];
      index=i;
    }
  printf("%d",index);
  
   return 0;
}