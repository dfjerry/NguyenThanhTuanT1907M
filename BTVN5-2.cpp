#include<stdio.h>
	 int main(){
	 	int n,m,tg;
	 	printf("nhap so n:",n);
	 	scanf("%d",&n);
	 	
	 	for(int i=1; i<=n; i++){
	 		m=i;
	 		tg=0;
	 		while(m!=0){
	 		tg=tg*10 + m%10;
	 		m/=10;
}
		 if(tg==i){
		 	printf("%d\n",tg);
		 }
}
	 	return 0;
	 	
	 }
