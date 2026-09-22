#include <stdio.h>
int main(void)
{
        int x = 0x12345678;
        char *y = (char*) &x;
        if(*y == 0x12)
                printf ("this machine is a big-endian\n");
        else if (*y == 0x78)
                printf ("this machine is little-endian\n");
        else
                printf ("this machine is weird\n");
        return 0;
}
