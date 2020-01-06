/********************************************************************************************
 * Purpose : number of binary tree  
 * @author :vikash kumar
 * @version:1.0
 * @date   :06/01/2020
 * @Filename: NumberofBinarySearchTree.java
 ********************************************************************************************/


package com.BridgeLabz.DataStructure;

import com.bridgeLabz.util.Utility;

public class NumberofBinarySearchTree {  
    
    //Represent the node of binary tree  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
          
        public Node(int data){  
            //Assign data to the new node, set left and right children to null  
            this.data = data;  
            this.left = null;  
            this.right = null;  
            }  
        }  
      
    //..................Represent the root of binary tree  
    public Node root;  
      
    public NumberofBinarySearchTree(){  
        root = null;  
    }  
    
    
    /*************************
     *  numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key  
     * @param key
     * @return noOfBst
     * 
     ********/
    public int numOfBST(int key) {  
        return Utility.factorial(2 * key)/(Utility.factorial(key + 1) * Utility.factorial(key));  
         
    }  
      
    public static void main(String[] args) {  
          
        NumberofBinarySearchTree bt = new NumberofBinarySearchTree();
      
        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(1));  
      }  
}  