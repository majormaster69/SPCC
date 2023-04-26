#include <stdio.h>
#define FIB_SERIES(n) \
        int fib_series[(n)]; \
        fib_series[0] = 0; \
        fib_series[1] = 1; \
        printf("%d %d", fib_series[0],fib_series[1]); \
        for (int i = 2; i < (n); i++) { \
            fib_series[i] = fib_series[i-1] + fib_series[i-2]; \
            printf("%d ", fib_series[i]); \
        } \

int main() {
    int n = 10;
    printf("Fibonacci series up to %d terms: ", n);
    FIB_SERIES(n);

    return 0;
}

