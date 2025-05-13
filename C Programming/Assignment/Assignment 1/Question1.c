//Finding F from c(temp)
#include<stdio.h>
int main()
{
	float T,F;
	printf("Enter temprature in fahrenheit");
	scanf("%f",&F);
	T=(F-32)*5/9;
	printf("Temprature in celcius is %f",T);
}
