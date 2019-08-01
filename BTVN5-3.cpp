#include <stdio.h>

int main(){
	int n,i,j,uoc;
	printf("Nhap gia tri n ");
	scanf("%d",&n);
	printf("Cac so nguyen to trong day la: ");
	for(i=2;i<=n;++i){
		uoc=0;
	for(j=2;j<=i;j++){
		if(i%j==0){
		uoc++;
		}
	}if(uoc==1){
		printf("%d\t",i);
	}
}
	return 0;
}
//Nhap vao 1 gia tri n va tim cac so nguyen to, in ra cac so nguyen to tu 0-->n.
