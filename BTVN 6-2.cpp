#include<stdio.h>
int main(){
	int n;
	printf("Nhap so phan tu: \n",n);
	scanf("%d",&n);
	int a[n];
	for(int i=1;i<=n;i++){
		printf("Nhap phan tu: \n");
		scanf("%d",&a[i]);
	
	for(int j=1;j<i;j++){
		while(a[i]==a[j]){
			printf("Trung phan tu moi nhap lai: \n");
			scanf("%d",&a[j]);
		}
	}
}
	return 0;
}
//Nhap vao mang n gia tri, neu nhap trung gia tri moi nhap lai
