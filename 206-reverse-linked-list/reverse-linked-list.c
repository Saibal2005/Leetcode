/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *prev=NULL;
    struct ListNode *cur=head;
    struct ListNode *aft=NULL;
    while(cur!=NULL)
    {
        aft=cur->next;
        cur->next=prev;
        prev=cur;
        cur=aft;
    }
    head=prev;
    return head;
    
}