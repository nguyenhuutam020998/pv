/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Bai2 {

    
    public Bai2(){
        
    }
    public Bai2(int n){
        this.n = n;
    }
    public int n;
    public int arr[];
    public void b2() {
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] > arr[j]){
                    int tg = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tg;
                }
            }
        }
        System.out.println("");
        System.out.println("Output: " + (arr[n-1] + arr[n-2]));
    }
    
    public void inputDefault(){
        arr = new int[n];
        arr[0] = 0;
        arr[1] = 100;
        arr[2] = -4;
        arr[3] = 8;
        arr[4] = 143;
        arr[5] = 5;
        arr[6] = 99;
        arr[7] = 100;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + ",");
        }
    }
    
    public void input(){
        Scanner sn = new Scanner(System.in);
        arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("arr[" + i + "]= ");
            arr[i] = sn.nextInt();
            System.out.println("");
        }
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + ",");
        }
    }

}
