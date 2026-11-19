#include <stdio.h>
#include <stdbool.h>

int main() {
   int x = 42;
   float y = 42;
   long z = 42;
   char w = 42;
   bool v = true;

    printf("%zu\n", sizeof(int));
    printf("%zu\n", sizeof(float));
    printf("%zu\n", sizeof(long));
    printf("%zu\n", sizeof(char)); 
    printf("%zu\n", sizeof(bool)); 
   return 0;
}
