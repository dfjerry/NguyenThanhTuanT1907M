#include <stdio.h>
#include <math.h>
int main(){
	int a;
	printf("Nhap so can kiem tra xem co phai la so hoan hao khong: \n");
	scanf("%d",&a);
	int b=0;
	for(int i=1;i<a;i++)
	if(a%i==0)
		b+=i;
	if(b==a){
		printf("%d la so hoan hao",a);
	}else{
		printf("%d khong phai la so hoan hao",a);
	}
	return 0;
	}
	//Nhap vao 1 so kiem tra xem co phai la so hoan hao khong.
