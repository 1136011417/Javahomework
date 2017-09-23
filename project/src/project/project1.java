/**   
* @Title: project1.java
* @Package project
* @Description: TODO(用一句话描述该文件做什么)
* @author Chen   
* @date 2017年9月23日 下午6:50:05
* @version V1.0   
*/


package project;

/**
* @ClassName: project1
* @Description: TODO(递归算法题1)
* @author Chen
* @date 2017年9月20日 下午6:50:05
* 
*/
import java.io.*;
import java.util.Scanner;
public class project1 {
	public static void main(String[] args) {
		int a;
		Scanner s =new Scanner(System.in);
		System.out.println("请输入一个整数a:");
		a=s.nextInt();
		number(a);
		}
	public static void number(int n) {
		System.out.println(n);
		if (n <= 5000) {
			n = n*2;
			number(n);
			n = n/2;
			}
		System.out.println(n);
		}
	}
