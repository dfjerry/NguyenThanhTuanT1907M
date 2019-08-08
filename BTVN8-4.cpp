#include<stdio.h>
int main(){
	int a[4][4];
	printf("Nhap vao cac phan tu cua ma tran: ");
	
	
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			printf("a[%d][%d]",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	printf("Ma tran 4x4 vua nhap la: \n");
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			printf("%d\t",a[i][j]);
		}
		printf("\n");
	}
	
//Tim so ln trong mang
	int max=0,x;
	for(int i=0;i<4;i++){
		int soln=0;
		for(int j=0;j<4;j++){
		if(soln<a[i][j]){
		soln=a[i][j];
		}
		}
		if(max<soln){
			max=soln;
			x=i;
		}
	}
	int max_1=0;
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			if(a[i][j]>max_1 && a[i][j]<max){
				max_1=a[i][j];
			}
		}
	}
	printf("So gan LN trong mang la: %d",max_1);
	
	return 0;
}
