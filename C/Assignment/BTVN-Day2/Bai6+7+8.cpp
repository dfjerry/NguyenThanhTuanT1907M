#include<stdio.h>
int main(){
	int S,n,N,tong;
	printf("Nhap n=: ");
	scanf("%d",&n);
	for(int i=2;i<=n;i++)
	{
		S=S+(1/i);
	}
	
	printf("S= %d\n",S);
	
//Bai 7
	for(int i=1;i<=n;i++)
	{
		N=N*i;
	}
	printf("n! = %d\n",N);
	
//Bai 8
	for(int i=1;i<100;i++)
	{
		tong=tong+i;
	}
	printf("tong=%d\n",tong);
	return 0;
}
//Vi?t chuong trình tính S = 1 + 1/2 + 1/3 + … + 1/N
// Vi?t chuong trình tính n! bi?t n! = 1.2.3.4…n
