#include <stdio.h>
struct
{
        short s;
        int i;
        char c;
}
my_struct;

int main(){
        printf ("sizeof char is %d\n", sizeof (char));
        printf ("sizeof short is %d\n", sizeof (short));
        printf ("sizeof int is %d\n", sizeof (int));
        printf ("sizeof long is %d\n", sizeof (long));
        printf ("sizeof struct is %d\n", sizeof (my_struct));
}
