/**   
* @Title: project1.java
* @Package project
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Chen   
* @date 2017��9��23�� ����6:50:05
* @version V1.0   
*/


package project;

/**
* @ClassName: project1
* @Description: TODO(�ݹ��㷨��1)
* @author Chen
* @date 2017��9��20�� ����6:50:05
* 
*/
import java.io.*;
import java.util.Scanner;
public class project1 {
	public static void main(String[] args) {
		int a;
		Scanner s =new Scanner(System.in);
		System.out.println("������һ������a:");
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
