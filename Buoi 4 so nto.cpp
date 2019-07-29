#include <stdio.h>
#include <math.h>
int main(){
	int n;
	
	printf("Nhap gia tri n:");
	scanf("%d",&n);

	if(n>=2){
		int so_uoc=0;
		for(int i=2;i<=n;i++){
		if(n%i==0){
			so_uoc++;
			}
		}
		if(so_uoc==1){
			printf("%d la so nguyen to\n",n);
		}else{
			printf("%d khong la so nguyen to\n",n);
		}
	}else{
		printf("%d khong phai so nguyen to\n",n);
	}
	
	return 0;
}
//Nhap 1 so n tu ban phim kiem tra so minh vua nhap co phai so nguyen to khong.
