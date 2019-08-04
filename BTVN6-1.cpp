#include <stdio.h>

int main(){
	int n;
	int tongmang=0;
	printf("Nhap vao gia tri mang:",n);
	scanf("%d",&n);
	int a[n];
	for(int i=1;i<=n;i++){
		printf("Nhap phan tu: \n");
		scanf("%d",&a[i]);
		tongmang=tongmang+a[i];
	}
	float GTTB;
	GTTB=tongmang / n;
	printf("Gia tri trung binh cua mang: %f",GTTB);

	return 0;
}
//Nhap mang n so nguyen, tim gia tri trung binh cua mang
