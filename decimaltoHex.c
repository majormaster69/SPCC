#include <stdio.h>
#include <stdlib.h>
#define BIN_TO_DEC(bin)strtol(bin, NULL, 2);
#define BIN_TO_HEX(bin) ({ \
    char hex_str[10]; \
    sprintf(hex_str, "%x", (unsigned int) strtol(bin, NULL, 2)); \
    hex_str; \
})
int main() {
    char* bin_num = "10101010"; // binary number to convert
    int dec_num = BIN_TO_DEC(bin_num);
    printf("Decimal representation: %d\n", dec_num);
	printf("HEXA");
    char* hex_num = BIN_TO_HEX(bin_num);
    printf("Hexadecimal representation: %s\n", hex_num);

    return 0;
}
