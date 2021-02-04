/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asak;

/**
 *
 * @author krish
 */
public class creditCardValidation {
    int digitSum = 0;
    String card;
    public creditCardValidation() {
        
    }
    
    static int sumDigit(int num){
        int s = 0;
        while (num>0){
            
            s += num%10;
            num /= 10;
            
        }
        return s;
    }
    
    public creditCardValidation(String card) {
        this.card = card;
    }
    
    boolean checkCard(){
        for (int i=0; i<card.length(); i++){
            int temp = card.charAt(i) - 48;
            
            if (i%2==1){
                digitSum += temp;
                
            }
            else{
                temp *= 2;
                if (temp>9){
                    temp = sumDigit(temp);
                    digitSum += temp;
                
                }
                else{
                    digitSum += temp;
                }
                          
                            
            }
        }
        
        if (digitSum%10==0){
            System.out.print("Valid card \n");
            return true;
        }
        else{
            System.out.print("InValid card \n" + digitSum);
            return false;
        }
    }
    
    public static void main(String arg[]){
        creditCardValidation obj = new creditCardValidation("4335877865305626");
        obj.checkCard();
    }
}
