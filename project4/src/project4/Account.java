/**   
* @Title: Account.java
* @Package project4
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Chen   
* @date 2017��10��15�� ����11:48:06
* @version V1.0   
*/


package project4;

import java.util.Scanner;

/**
* @ClassName: Account
* @Description: ģ�����д�ȡ���
* @author Chen
* @date 2017��10��15�� ����11:48:06
* 
*/
import java.util.*;
public class Account {
    public static void main(String[] args) {
    	DepositAccount saver = new DepositAccount(); 
        Scanner s=new Scanner(System.in);
        System.out.print("��ӭ��¼���밴�������ּ�(��0)����!");
        int choice=s.nextInt();
        while(choice!=0){
        	System.out.println("�û���:����\n�˺�:1234567890");
            System.out.println("������ѡ��:");
            System.out.println("1.���");
            System.out.println("2.ȡ��");
            System.out.println("3.��ʾ����Ϣ");
            System.out.println("4.��ʾ����Ϣ");
            int a=s.nextInt();
        switch(a){
        case 1:
            System.out.print("���������");
            double m=s.nextDouble();
            saver.save(m);
            System.out.println("���ɹ�!");
            System.out.println("��ǰ���Ϊ:"+saver.getbalance());
            break;
        case 2:
            System.out.print("������ȡ���");
            double m1=s.nextDouble();
            saver.withdraw(m1); 
            System.out.println("��ǰ���Ϊ:"+saver.getbalance());
            break;
        case 3:
            System.out.println("��ǰ����ϢΪ:"+saver.getapryear());
            break;
        case 4:
            System.out.println("��ǰ����ϢΪ:"+saver.getaprmonth());
            break;
        default:
            System.out.println("������������������:");
            }
        }
    }        
}
class DepositAccount{
	private double balance; //�˻����
	static double interest = 0.045; //������
	//��Ǯ
	public void save(double m) {            
			this.balance = balance + m;
			}	
	//ȡǮ
	public boolean withdraw(double m1) {    
		if(m1<=balance)
		{
			System.out.println("ȡ��ɹ�!");
			this.balance = balance-m1;
			return true;
		}
		else{
			System.out.println("��������!");
			return false;
		}
	}
	public double getbalance() {return balance;}//��ѯ���
	public double getapryear() {return interest*balance;}//��ѯ����Ϣ
	public double getaprmonth() {return interest*balance/12;}//��ѯ����Ϣ
}