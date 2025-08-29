

// Complete the mergeLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
SinglyLinkedListNode* mergeLists(SinglyLinkedListNode* head1, SinglyLinkedListNode* head2) {
    if(head1==NULL) return head2;
    if(head2==NULL) return head1;
    SinglyLinkedListNode* l;
    
    if(head1->data<=head2->data){
        l=head1;
        l->next=mergeLists(head1->next,head2);
    }else{
        l=head2;
        l->next=mergeLists(head1, head2->next);
    }
    return l;

}

