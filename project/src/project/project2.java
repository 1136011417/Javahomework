package project;
/**
* @ClassName: project2
* @Description: TODO(旋转矩阵)
* @author Chen
* @date 2017年9月20日 下午7:55:57
* 
*/
import java.io.*;
import java.util.Scanner;
public class project2 {  
    public static int a; 
    int [][] result = new int[a][a];  
    public static void main(String[] args) {
    	Scanner s =new Scanner(System.in);
		System.out.println("请输入一个整数a:");
		a=s.nextInt();
    	project2 rm = new project2();  
        rm.XZJZ(1, 0, a);  
        rm.printResult();  
    }  
    //生成旋转矩阵  
    public void XZJZ(int number, int begin, int size){  
        if(size == 1){  
            result[begin][begin] = number;  
            return;  
        }  
          
        if(size == 0){  
            return;  
        }  
        //生成区域A  
        int i = begin;  
        int j = begin;  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i++;  
        }    
        //生成区域B  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j++;  
        }           
        //生成区域C  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            i--;  
        }     
        //生成区域D  
        for(int k = 0; k < size - 1; k++){  
            result[i][j] = number;  
            number++;  
            j--;  
        }   
        //递归调用  
        XZJZ(number, begin + 1, size - 2);  
    }      
    //打印结果  
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