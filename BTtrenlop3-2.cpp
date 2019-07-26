#include <stdio.h> 
#include <math.h> 
int main(){
	int a,b,c;

	printf("Nhap a\n");
	scanf("%d",&a);
	printf("Nhap b\n");
	scanf("%d",&b);
	printf("Nhap c\n");
	scanf("%d",&c);
	
	
	if(a+b>c && a+c>b && c+b>a){  // hoac if(!  (a+c<=b || a+b<=c || c+b <=a) giong nhau
		printf("Day la ba canh cua 1 tam giac\n");
		
		int C = a + b + c;
		double P= (double)C/2;
		double s;
		
		s = sqrt (P*(P-a)*(P-b)*(P-c));
		
		printf("Chu vi tam giac C = %d\n",C );
		printf("Dien tich tam giac S: %lf",s);//%lf long float = double
		
	}else{
		printf("Day khong phai la 3 canh cua tam giac\n");
	}

	
	return 0;
}
//Nhap vao 3 so nguyen a,b,c kiem tra xem co phai la 3 canh cua tam giac khong
//Neu dung tinh dien tich va chu vi(S,C)
