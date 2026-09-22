#include <stdio.h>
int main(){
	const int calculationOne = 0x55aa & 0xaa55;
        const int calculationTwo = 0x55aa | 0xaa55;
        printf("0x55aa & 0xaa55 is: %x\n", calculationOne);
        printf("0x55aa | 0xaa55 is: %x\n", calculationTwo);
        return 0;
}
