#include <ctype.h>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>

void ifStringInt1 (char* s);
void ifStringInt2 (char* s);

using namespace std;
int main()
{
	char* s = "a123";
	ifStringInt1(s);
	ifStringInt2(s);
	cin.get();
}

void ifStringInt1 (char* s)
{
	char* endP;
	int result = strtol(s,&endP,10);
	cout<<(endP == 0)<<endl;
}

void ifStringInt2 (char* s)
{
	int check;
	int i = 0;
	while(i < strlen(s)-1)
	{
		check = isdigit(s[i]);
		if(!check)
		{
			cout<<"0"<<endl;
			return;
		}
		i++;
	}
	
	cout<<"1"<<endl;
}