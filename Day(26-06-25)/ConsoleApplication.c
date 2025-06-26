#include <stdio.h>

int cid = 0;
   struct Customer{
       int cusId;
       char cusname[50];
       char cusNum[50];
       char cusMail[50];
   }cus[100];
   
   void createCustomer(){
       printf("Enter the customer Name:");
       scanf("%s",cus[cid].cusname);
       printf("Enter the customer number:");
       scanf("%s",cus[cid].cusNum);
       printf("Enter the customer mail:");
       scanf("%s",cus[cid].cusMail);
       cus[cid].cusId = cid+1;
       cid++;
   }

void DisplayCustomers(){
    for(int i=0;i<cid;i++){
        printf(cus[i].cusname);
    }
}

int main() {
   while(1){
       int n;
       printf("Select option:");
       scanf("%d",&n);
       switch(n){
           case 1:{
               createCustomer();
                break;
           }
           case 2:{
               DisplayCustomers();
               break;
           }
       }
   }
    return 0;
}