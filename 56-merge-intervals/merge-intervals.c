#include <stdlib.h>

int cmp(const void* a, const void* b) {
    return (**(int**)a - **(int**)b);
}

int** merge(int** intervals, int n, int* colSize, int* returnSize, int** returnColumnSizes) {
    qsort(intervals, n, sizeof(int*), cmp);

    int** res = malloc(sizeof(int*) * n);
    *returnColumnSizes = malloc(sizeof(int) * n);

    int k = 0;
    res[0] = intervals[0];
    (*returnColumnSizes)[0] = 2;

    for (int i = 1; i < n; i++) {
        if (intervals[i][0] <= res[k][1]) {
            if (intervals[i][1] > res[k][1]) {
                res[k][1] = intervals[i][1];
            }
        } else {
            res[++k] = intervals[i];
            (*returnColumnSizes)[k] = 2;
        }
    }

    *returnSize = k + 1;
    return res;
}