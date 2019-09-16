#include<stdio.h>

bool Timso_lonhon(int a,int b){
	if(a>b){
		return true;
	}
	return false;
}
bool Kiemtra_amduong(int a){
	if(a>=0){
		return true;
	}
	return false;
}

int main(){
	
	int a,b,c;
	printf("Nhap vao so a: \n");
	scanf("%d",&a);
	printf("Nhap vao so b: \n");
	scanf("%d",&b);
	printf("Nhap vao so c: \n");
	scanf("%d",&c);
	
		

//Bai 4

while(c%2!=0){
	printf("moi nhap lai c: ");
	scanf("%d",&c);
}	

//Bai 1
	if(Timso_lonhon(a,b)){
		printf("%d lon hon %d",a,b);
	}else{
		printf("%d lon hon %d",b,a);
	}
//Bai 2
if(Kiemtra_amduong(a)){
	printf("\n%d la so duong",a);
}else{
	printf("\n%d la so am",a);
}
	
//Bai 3
	int x,y;
	printf("\nNhap gia tri x: \n");
	scanf ("%d",&x);
	printf("\nNhap gia tri y: \n");
	scanf("%d",&y);
	c=x;
	x=y;
	y=c;
	printf("Gia tri cua x: %d  y: %d",x,y);

	return 0;
}
