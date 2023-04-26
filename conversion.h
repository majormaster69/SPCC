#define CtoF(s)(s*1.8+32);
#define MtoF(s)(s*3.218);
#define LtoC(s)(s*0.035315);
#include <stdio.h>
#include <conio.h>
int main() {
	
while(1) {
int ch,a,z;
float b;
printf("Enter choice:\n1.C to F\n2.metre to feet\n3.litre to cubic feet\n4.EXIT\n");
 scanf("%d",&ch);
    switch(ch) {
    	case 1:
     	    printf("ENter Celsius");
    		scanf("%d",&a);
           z = CtoF(a);
        printf("%d \n",z);
		break;
		case 2: 
		printf("ENter Meters");
    	scanf("%d",&a);
           z = MtoF(a);
        printf("%d \n",z);
	break;	
case 3: 
	printf("ENter Liters");
    	scanf("%d",&a);
           z = LtoC(a);
         printf("%d \n",z);
	break;
case 4: 
		//exit(0);
	break;
default: 
	printf("WRONG CHOICE");
	break;
		  }
      }
}

