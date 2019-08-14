#include<stdio.h>
void Tong_2so(int a, int b ){
	int tong;
	tong = a + b;
	printf("Tong cua hai so la: %d\n",tong);
}
void Hieu_2so(int a, int b){
	int hieu;
	hieu = a - b;
	printf("Hieu cua hai so la: %d\n",hieu);
}
void Tich_2so(int a, int b){
	int tich;
	tich = a * b;
	printf("Tich cua hai so la: %d\n",tich);
}
void Thuong_2so(int a, int b){
	float thuong;
	thuong = (float) a / (float) b;
	printf("Thuong cua hai so la: %2f\n",thuong);
}
int main(){
	int a,b;
	
	printf("Nhap vao so a: \n");
	scanf("%d",&a);
	printf("Nhap vao so b: \n");
	scanf("%d",&b);
	
	Tong_2so(a,b);
	Hieu_2so(a,b);
	Tich_2so(a,b);
	Thuong_2so(a,b);
	
	return 0;
}
