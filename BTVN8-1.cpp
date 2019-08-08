#include<stdio.h>
int main() {
   int a[10][10], m, n, i, j;

   printf("Nhap kich co cua ma tran: ");
   scanf("%d %d", &m,&n);

   printf("Nhap ma tran: \n");
   for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
      printf("a[%d][%d]: ",i,j);
         scanf("%d", &a[i][j]);
      }
   }

   printf("\nMa tran vua nhap la: \n");
   
   for (i = 0; i < m; i++) {
      printf("\n");
      for (j = 0; j < n; j++) {
         printf("%d\t", a[i][j]);
      }
   }
   int b;
   for(i=0;i<m;i++){
   	for(j=0;j<n;j++){
   		if(b<a[i][j]){
   			b=a[i][j];
		   }
	   }
   }
   printf("\n So lon nhat trong mang la: %d",b);
   
   
   
   return 0;
}
