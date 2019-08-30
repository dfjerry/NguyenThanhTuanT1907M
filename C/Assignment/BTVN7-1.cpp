#include<stdio.h>
int main(){
	int a[4][4];
	int tong=0;
	int GTTB=0;
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			printf("Nhap vao a[%d][%d]",i,j);
			scanf("%d",&a[i][j]);
		}
	}
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			printf("%5d",a[i][j]);
			tong=a[0][0]+a[1][1]+a[2][2]+a[3][3];
			
		}
		printf("\n");
	}
	GTTB = tong / 4;
printf("Trung binh cong duong cheo ma tran la: %d",GTTB);
	
	return 0;
}
