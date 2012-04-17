#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
using namespace std;

char* reverse (char s[])
{
    //left point to the beginning of the string
    int left = 0;
    //right point to the end of the string
    int right = strlen(s) - 1;

    char temp;
    while(left < right)
    {
        temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }

    cout<< s << endl;
    return strcat(s,"\0");
}

void main()
{
   char s[] = "abcde";

   cout<< "test the length of " << strcat(s,"\0") <<" is "<<strlen(s) << endl;
   reverse(s);
   cout<< "test the length of " << s <<" is "<<strlen(s) << endl;
   cin.get();
}