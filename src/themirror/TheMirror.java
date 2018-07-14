/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themirror;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TheMirror {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int c;
        int num = 0;
        for(int k = 0; k < n ; k++){
            int a = reader.nextInt();
            int b = reader.nextInt();
            int low = a;
            int high = b;
            if(low<=2)
                low = 2;
            int n1 = low;
            int n2 = 1;
            for(int i = low; i < high; i++){
                c = 0;
                for(int j = 1; j <= i; j++){
                    if(n1%n2 == 0){
                        c++;
                    }
                    n2++;
                }
                if(c == 2){
                    num ++;
                }
                n1++;
                n2 = 1;
            }
            System.out.println(num);
        }
    }
}
