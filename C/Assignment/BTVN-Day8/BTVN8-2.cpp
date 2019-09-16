#include<stdio.h>
int main(){
	int b,a[10]={6,5,8,9,0,1,2,4,3,20};
	for(int i=0;i<9;i++){
		for(int j=0;j<9-i;j++){
			if(a[j]>a[j+1]){
				b=a[j];
				a[j]=a[j+1];
				a[j+1]=b;
			}
	}
}
	for(int i=0;i<10;i++){
		printf("%3d",a[i]);
	}
	
	return 0;
	}
