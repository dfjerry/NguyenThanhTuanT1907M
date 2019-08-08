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
	
//Tim hang co tong lon nhat trong ma tran 
	int max=0,x;
	for(int i=0;i<4;i++){
		int sum=0;
		for(int j=0;j<4;j++){
		sum+=a[i][j];
		}
		if(max<sum){
			max=sum;
			x=i;
		}
	}
	printf("Hang co gia tri lon nhat trong ma tran la hang a[%d][4] voi GTLN:%d",x,max);
	
	return 0;
}
