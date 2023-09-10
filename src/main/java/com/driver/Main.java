package com.driver;

public class Main {
static class Product{
       public int product(int x, int y){
         int ans=x*y;
           return ans;
       }
       public int product(int x, int y,int z){
           int ans=x*y*z;
           return ans;
       }
       public double product(double x, double y){
           double ans=x*y;
           return ans;
       }
   }
    public static void main(String[] args){
        Product p=new Product();
        System.out.println(p.product(5,2));
        System.out.println(p.product(5,4,3));
        System.out.print(p.product(4.5,2));
    }
}
