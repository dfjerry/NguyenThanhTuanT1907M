#include <stdio.h>
#include <math.h>
int main(){
	float a,b,c,delta,x1,x2;
	printf("Phuong trinh co dang ax^2+bx+c=0\n");
	printf("Nhap vao 3 gia tri a,b,c\n");
	scanf("%f%f%f",&a,&b,&c);
	printf("Ket qua cua bai toan\n");
	if (a==0){
		if(b==0){
			if (c==0){
				printf("Phuong trinh vo so nghiem");
			}else{
				printf("Phuong trinh vo nghiem");
			}
		}else{
			x1=-c/b;
			printf("Phuong trinh co nghiem x1 %f",x1);
		}
	}else{
		delta=b*b-4*a*c;
		if(delta<0){
			printf("Phuong trinh vo nghiem");
		}else if(delta==0){
			x1=-b/(2*a);
			printf("Phuong trinh co nghiem kep %f",x1);
		}else if(delta>0){ 
		x1=(-b+sqrt (delta))/2*a;
		x2=(-b-sqrt (delta))/2*a;
			printf("Phuong trinh co hai nghiem phan biet:%f %f",x1,x2);
		}
	}
	
	
	
	return 0;
}
