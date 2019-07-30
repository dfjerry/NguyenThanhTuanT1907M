#include <stdio.h>
int main(){
	int a;
	printf("Nhap vao so can kiem tra xem co phai la so thuan nghich khong \n");
	scanf("%d",&a);
	int b=a;
	int A;//A la so dao nguoc lai cua a, a=123-->A=321
	while(a>0){
		A=A*10+a%10;
		a/=10;
	}
	if(b==A){
		printf("%d la so thuan nghich",b);
	}else{
		printf("%d khong phai  la so thuan nghich",b);
	}
	return 0;
	}
//Nhap vao 1 so kiem tra xem co phai la so thuan nghich khong
