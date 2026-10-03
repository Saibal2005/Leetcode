/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode *temp=head;
    int c=0;
    while(temp!=NULL)
    {
        c++;
        temp=temp->next;
    }
    if(c%2==0)
    {
        c=(c/2)+1;
    }
    else
    {
        c=(c+1)/2;
    }
    temp=head;
    for(int i=1;i<c;i++)
    {
        temp=temp->next;
    }
    return temp;

    
}