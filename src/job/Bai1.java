/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Bai1 {

    public int n;
    public int[] arr;
    List<Integer> result = new ArrayList<>();
    
    public Bai1(int n){
        this.n = n;
    }
    
    public Bai1(){
        
    }
    
    public List<Integer> b1() {
        for (int j = 0; j < n; j++) {
            result.add(arr[3 * j]);
        }
        for (int j = 0; j < n; j++) {
            result.add(arr[3 * j + 1]);
        }
        for (int j = 0; j < n; j++) {
            result.add(arr[3 * j + 2]);
        }
        return result;
    }
    
    public void inputDefault(){
        Scanner sn = new Scanner(System.in);
        arr = new int[3*n];
        arr[0] = 11;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 10;
        arr[4] = 15;
        arr[5] = 99;
        arr[6] = 1;
        arr[7] = 8;
        arr[8] = 9;
        for(int i = 0 ; i < 3*n ; i++){
            System.out.print(arr[i] + ",");
        }
    }
    
    public void input(){
        Scanner sn = new Scanner(System.in);
        arr = new int[3*n];
        for(int i = 0 ; i < 3*n ; i++){
            System.out.print("arr[" + i + "]= ");
            arr[i] = sn.nextInt();
            System.out.println("");
        }
        for(int i = 0 ; i < 3*n ; i++){
            System.out.print(arr[i] + ",");
        }
    }
    
    public void output(){
        for(int i : result){
            System.out.print(i + ",");
        }
    }
}
