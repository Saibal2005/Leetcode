/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseBetween(struct ListNode* head, int left, int right) {
    if (!head || left == right) return head;

    struct ListNode dummy = {0, head};
    struct ListNode *before_left = &dummy, *sub_tail = NULL;
    struct ListNode *prev = NULL, *cur = head, *aft = NULL;

    for (int c = 1; cur && c <= right; c++) {
        if (c < left) {
            before_left = cur;
            cur = cur->next;
        } else {
            if (c == left) sub_tail = cur;
            aft = cur->next;
            cur->next = prev;
            prev = cur;
            cur = aft;
        }
    }

    before_left->next = prev;
    sub_tail->next = cur;

    return dummy.next;
}