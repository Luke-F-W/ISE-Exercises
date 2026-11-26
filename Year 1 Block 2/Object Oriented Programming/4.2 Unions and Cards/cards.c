#include <stdio.h>
#include <stdlib.h>
#include <time.h>

 

// TODO 1: Define a union named 'Card' that overlays an 'unsigned char rawByte'
// with a struct of bitfields:
//   - suit   (2 bits)
//   - rank   (4 bits)
//   - unused (2 bits)

union Card{
    unsigned char rawByte;
    struct{
    unsigned char suit : 2;
    unsigned char rank : 4;
    unsigned char unused : 2;
    } fields;
};
// Helper function to print a single card from its raw byte

void printCard(unsigned char rawCard) {
    const char *suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
    const char *ranks[] = {
        "Invalid", "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"
    };
    // TODO 2: Load 'rawCard' into your Card union and print its rank and suit
    // Example output format: "Queen of Spades"
    union Card card;
    card.rawByte = rawCard;
    printf("%s of %s\n", ranks[card.fields.rank], suits[card.fields.suit]);

}
int main() {
    unsigned char deck[52];
    int k = 0;

    srand((unsigned int)time(NULL));
    // TODO 3: Populate the 'deck' array with all 52 unique cards

        // Loop through suits (0 to 3) and ranks (1 to 13), pack them using

    // your Card union, and store 'card.rawByte' into 'deck[index]'.
    for(int x = 0; x < 4; x++){
        for(int i = 1; i <= 13; i++){
            union Card newCard;
            newCard.fields.suit = x;
            newCard.fields.rank = i;
            newCard.fields.unused = 0;
            deck[k] = newCard.rawByte;
            k++;
        }
    }
    //---
    // TODO 4: Randomly select and print 5 unique cards from 'deck'

    // Hint: To avoid drawing the same card twice, either shuffle the array

    // (Fisher-Yates shuffle) or track which indices have already been drawn.
    printf("Your 5-card hand:\n");
    printf("-----------------\n");
    int drawnCards[5] = {-1, -1, -1, -1, -1};
    int random;
    for(int o = 0; o < 5; o++){
    do{
        random = rand() % 52;
    }
    while(random == drawnCards[0] || random == drawnCards[1] || random == drawnCards[2] || random == drawnCards[3] || random == drawnCards[4]);
    drawnCards[o] = random;
    }

    for(int i = 0; i < 5; i++){
        printCard(deck[drawnCards[i]]);
    }
    return 0;
}