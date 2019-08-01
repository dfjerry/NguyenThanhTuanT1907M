#include <stdio.h>
int main(){
	int a,b,A;
	printf("Nhap vao a: \n",a);
	scanf("%d",&a);
	for(int i=1;i<=a;i++){
	b=i;
	A=0;
	while(b!=0){
		A=A*10+b%10;
		b/=10;	
	}if(i==A){
		printf("So thuan nghich: %d\n",i);
	}
}
	return 0;	
}

//Tim cac so thuan nghich 0-->a

