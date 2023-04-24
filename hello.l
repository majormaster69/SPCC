%option noyywrap
%{
	$include<stdio.h>
%}
"hello world" {print("GOOD BYE \n");}
.	;
%%
int main()
{
yylex();
return 0;
}
