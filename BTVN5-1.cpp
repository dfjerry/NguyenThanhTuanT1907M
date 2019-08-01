#include <stdio.h>
int main(){
	int n,f0,f1,fn;
	printf("Nhap vi tri thu n can tim trong day Fiboncacci:  ");
	scanf("%d",&n);
	f0=1,f1=1,fn=1;
	for(int i=2;i<=n;i++){
		fn=f0+f1;
		f0=f1;
		f1=fn;
	}
	printf("So fibo thu %d= %d\n",n,fn);
	return 0;
}
//Tim gia tri so thu n trong day Fiboncacci
