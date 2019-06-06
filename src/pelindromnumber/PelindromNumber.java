/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pelindromnumber;
import java.util.Scanner;


class demo
{
    int n,r,sum,tmp;
   

    void s(){
             System.out.println("enter number");
             Scanner sc = new Scanner(System.in);
             System.out.println("please enter three degit number ");
             n = sc.nextInt();

                tmp=n;
                sum =0;
            while(n>0)
            {
                
                r = n%10;
                sum=(sum*10)+r;
                n=n/10;
                
            }
               
              if (sum == tmp){
                System.out.println(sum + "  pelindrom number");
                } else{
                  System.out.println(tmp+" not pelindrom number");
                  
                       for(int i=0;i<=10;i++){
                            
                           n=tmp+i;
                         
                           while(n>0)
                            {
                             r = n%10;
                             sum=(sum*10)+r;
                             n=n/10;
                            } 
                           n = tmp+i;
                         
                          if (n == sum){
                              System.out.println(sum+" forward pelidrom number...");
                              break;
                          }else{}sum=0;
                       }
                           for(int j=0;j<=10;j++){
                            
                           n=tmp-j;
                       
                           while(n>0)
                            {
                             r = n%10;
                             sum=(sum*10)+r;
                             n=n/10;
                            } 
                           n = tmp-j;
                         
                          if (n == sum){
                              System.out.println(sum+" backword pelidrom number...");
                              break;
                          }else{
                          
                          }
                          sum=0;
                      }
                      }
                       
                      }
              
            
        }
public class PelindromNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        demo d = new demo();
//        d.fn();
        d.s();
    }
    
}
