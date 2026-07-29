/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    vector<int> nextLargerNodes(ListNode* head) {

     vector<int>ans;

     ListNode* temp=head;
    ListNode* prev=NULL;
    while(temp){
    // calculate largest num
    int num=temp->val;
    prev=temp->next;
    int flag=0;
    while(prev){
    if(num<prev->val){
        flag=1;
        ans.push_back(prev->val);
        break;
    }
    prev=prev->next;
    }
    temp=temp->next;  
    if(flag==0){
    ans.push_back(0);
    }
    }
    return ans;
    }
};