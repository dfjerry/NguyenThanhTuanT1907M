#include <stdio.h> 
int main(){
	int a,b,c;
do{
	printf("Nhap vao ba canh tam giac abc\n");
	printf("Nhap a\n");
	scanf("%d",&a);
	printf("Nhap b\n");
	scanf("%d",&b);
	printf("Nhap c\n");
	scanf("%d",&c);
}while(! (a+b>c && a+c>b && c+b>a));
printf("Day la 3 canh cua 1 tam giac");
	return 0;
}
//Nhap vao 3 so nguyen a,b,c kiem tra xem co phai la 3 canh cua tam giac khong
//Neu sai nhap lai 
