#include <stdio.h>

int main(){
	
	int a,b,c;
	
	printf("\nNhap so a= ");
    scanf("%d",&a);
    
    printf("\nNhap so b= ");
    scanf("%d",&b);
    
    printf("\nNhap so c= ");
    scanf("%d",&c);
    
    int max;
    max=a;
    if(max < b){
    	max = b;
	}
    if(max < c){
    	max = c;
	}
	printf("max la: %d", max );
	
	int min;
    min=a;
    if(min > b){
    	min = b;
	}
    if(min > c){
    	min = c;
	}
	printf("\nmin la: %d", min);
	
	return 0;
}
