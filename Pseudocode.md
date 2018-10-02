#PseudoCode of ATM Application 

     PRINT Enter the Account number 
     INPUT account number 
     PRINT Enter the pin
     INPUT PIN
     set count to zero
     
   while count !=3 
     IF PIN is Correct 
        Then        
        PRINT What type of service do you want
        INPUT service 
       
        IF Withdraw 
            Then 
            
            PRINT the amount that the user wants to withdraw 
            INPUT amountWithdraw
            
            IF amountWithdraw < Total Balance 
                Then
                PRINT Take the money
                new total balance =total balance-amountWithdraw 
                
            ELSE 
                Then
                PRINT You have no Enough Balance and request a new amount 
                    
            END IF 
            
        ELSE IF Deposit 
            Then
            PRINT Enter the money you want to deposit 
            INPUT deposit           
            total balance = total balance + deposit money
        
        ELSE
            Then 
                 PRINT Your Account balance is Amount 
                 PRINT totalAccountBalance
                 
        END IF  
       
     ELSE 
        Then 
        PRINT You put Incorrect pin please put your PIN again
        count increament 
        IF count is 3 
            Then 
            PRINT your account is Locked you have tried 3 times 
             
        END IF
        
     END IF          