package project;
/**
* @ClassName: project2
* @Description: TODO(��ת����)
* @author Chen
* @date 2017��9��20�� ����7:55:57
* 
*/
import java.io.*;
import java.util.Scanner;
public class project2 {  
    public static int a; 
    int [][] result = new int[a][a];  
    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
		System.out.println("������һ������a:");
		a=s.nextInt();
    	project2 rm = new project2();  
        rm.XZJZ(1, 0, a);  
        rm.printResult();  
    }  
    //������ת����  
    public void XZJZ(int number, int begin, int size){  
        if(size == 1){  
            result[begin][begin] = number;  
            return;  
        }  
          
        if(size == 0){  
            return;  
        }  
        //��������A  
        int i = begin;  
        int j = begin;  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i++;  
        }    
        //��������B  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j++;  
        }           
        //��������C  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i--;  
        }     
        //��������D  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j--;  
        }   
        //�ݹ����  
        XZJZ(number, begin + 1, size - 2);  
    }      
    //��ӡ���  
    public void printResult(){  
        for(int i = 0; i < a; i++){  
            for(int j = 0; j < a; j++){  
                System.out.print(result[i][j] + "\t");  
                if(j == a - 1){  
                    System.out.println(" ");  
                }  
            }  
        }  
    }  
}  