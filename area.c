#define square(s)(s*s);
#define rect(s)(a*b);
#define circle(s)(3.14*a)
#define triangle(s)(0.5*a*b);
#include <stdio.h>
#include <conio.h>
void main() {
	while(1) {
		int a,b,ch,z;
		printf("Enter choice: 1.AREA OF SQUARE 2.AREA OF TRIANGLE 3.AREA OF RECTANGLE 4.AREA OF CIRCLE 5.EXIT\n");
		scanf("%d",&ch);
		switch(ch) {
		case 1:
            printf("ENter length:");
 	   		scanf("%d",&a);
            z = square(a);
        	printf("%d",z);
			break;
		case 2:
    		printf("ENter length:");
     		scanf("%d",&a);
        	printf("ENter height:");
    		scanf("%d",&b);
            z = triangle(a);
        	printf("%d",z);
			break;
		case 3:
	    	printf("ENter length:");
    		scanf("%d",&a);
        	printf("ENter breadth:");
    		scanf("%d",&b);
            z = rect(a);
        	printf("%d",z);
			break;
		case 4:
 			printf("ENter radius:");
    		scanf("%d",&a);
        	z = circle(a);
        	printf("%d",z);
			break;
		case 5: 
			exit(0);
			break;
		default: 
			printf("WRONG CHOICE");
			break;
		  }
       }
}

