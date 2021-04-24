/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dell
 */
public class Bai3 {
    
    public int n;
    public int arr[];
    List<List<Integer>> listResult = new ArrayList<>();
    public Bai3(){
        
    }
    
    public Bai3(int n){
        this.n = n;
    }
    
    public List<List<Integer>> b3(){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                List<Integer> coupleValue = new ArrayList<>();
                coupleValue.add(arr[i]);
                coupleValue.add(arr[j]);
                int key = 0;
                if( arr[i] <= 0 && arr[j] >= 0){
                    key = arr[j] - arr[i];
                }
                if(arr[i] >= 0 && arr[j] <= 0){
                    key = arr[i] - arr[j];
                }
                if(arr[i] >= 0 && arr[j] >= 0 && arr[i] >= arr[j]){
                    key = arr[i] - arr[j];
                }
                if(arr[i] >= 0 && arr[j] >= 0 && arr[i] <= arr[j]){
                    key = arr[j] - arr[i];
                }
                coupleValue.add(key);
                list.add(coupleValue);
                temp.add(key);
            }
        }
        
        Collections.sort(temp);
        int compare = 0;
        compare = temp.get(0);
        
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).get(2) == compare){
                List<Integer> listEnd = new ArrayList<>();
                listEnd.add(list.get(i).get(0));
                listEnd.add(list.get(i).get(1));
                listResult.add(listEnd);
            }
        }
        
        return listResult;
        
    }
    
     public void inputDefault(){
        arr = new int[n];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 4;
        arr[3] = 7;
        arr[4] = 9;
        arr[5] = 0;
        arr[6] = -10;
        arr[7] = 13;
        arr[8] = 93;
        arr[9] = 14;
        arr[10] = 15;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + ",");
        }
    }
     
     public void output(){
         System.out.println("Output: " + listResult);
     }
    
}
