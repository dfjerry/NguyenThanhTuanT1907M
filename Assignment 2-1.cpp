#include <stdio.h>
int main(){
	int a,b;
	
	printf("\nNhap so a= ");
    scanf("%d",&a);
    
    printf("\nNhap so b= ");
    scanf("%d",&b);
	if (a>b){
		if (b!=0){
			printf("Ket qua:%d / %d = %d",a,b,a/b);
		}else {
		printf("ERR");
		
}
}else{
	printf("Ket qua:%d * %d = %d",a,b,a*b);
	}
	

return 0;
}
