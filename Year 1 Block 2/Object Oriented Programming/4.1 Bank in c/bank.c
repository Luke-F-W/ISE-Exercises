#include <stdio.h>
#include <stdlib.h>

void checkbalance(double *bal){
    printf("Your balance is: %.2f", *bal);
}

void addMoney(double *bal){
    double myNum = 0;
    double *newBalPointer = &myNum;
    printf("How much would you like to add\n");
    scanf("%lf", newBalPointer);
    if(*newBalPointer > 0){
        *bal = *bal + *newBalPointer;
        printf("Your balance is: %.2f\n", *bal);
    }
    else{
        printf("Invalid Amount\n");
    }
}

void withdrawMoney(double *bal){
    double myNum = 0;
    double *newBalPointer = &myNum;
    printf("How much would you like to withdraw\n");
    scanf("%lf", newBalPointer);
    if (*newBalPointer > 0 && *newBalPointer <= *bal){
        *bal = *bal - *newBalPointer;
        printf("Your balance is: %.2f\n", *bal);
    }
    else{
        printf("Invalid Amount\n");
    }

}



int main()
{
    int n;
    double balance = 1000.0;
    double *bal = &balance;
    void (*operations[3])(double *) = {
    checkbalance,
    addMoney,
    withdrawMoney
    };
    while(true){
    printf("---Bank Menu---\n");
    printf("0. Check Balance\n");
    printf("1. Deposit Money\n");
    printf("2. Withdraw\n");
    printf("3. Exit\n");

    printf("Enter Input\n");
    scanf("%d", &n);

    operations[n];

    if(n == 3){
        exit(0);
    }
    else{
        operations[n](&balance);
    }
}
    return 0;   
}