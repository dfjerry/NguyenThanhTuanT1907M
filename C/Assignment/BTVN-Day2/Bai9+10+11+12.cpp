#include<stdio.h>
int main(){
	int n,tong,GTTB;
	printf("Nhap n: ");
	scanf("%d",&n);
	int ar[n];
	int a=0,b=ar[0];
	
	for(int i=0;i<n;i++){
		printf("Nhap so thu %d trong mang: \n",i);
		scanf("%d",&ar[i]);
	}


//Bai 11

	for(int i=0;i<n;i++){
		tong+=i;
	}
	GTTB=tong/n;
	printf("GTTB = %d ",GTTB);
	
//Bai 12
	for(int i=0;i<n;i++)
	{
		if(a<ar[i]){
			a=ar[i];
		}
	}
	printf("\nSo ln la: %d",a);
	
	for(int i=0;i<n;i++)
	{
		if(b>ar[i]){
			b=ar[i];
		}
	}
	printf("\nSo nn la: %d",b);
	

	return 0;
}
