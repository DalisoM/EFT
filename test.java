package test;

public class test {  
    public static void main(String[] args) {          
        String s1 = "000100101";         
        // Passing char and index from  
        int index = s1.indexOf('1', 0); //Returns the index of this char 
        int num = index + 1;
        if (num == 3) {
        System.out.println("index of char "+num);       
    }
        else{
        	System.out.println("index is not available ");
        }}
        }
