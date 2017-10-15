/**   
* @Title: Account.java
* @Package project4
* @Description: TODO(用一句话描述该文件做什么)
* @author Chen   
* @date 2017年10月15日 上午11:48:06
* @version V1.0   
*/


package project4;

import java.util.Scanner;

/**
* @ClassName: Account
* @Description: 模拟银行存取款功能
* @author Chen
* @date 2017年10月15日 上午11:48:06
* 
*/
import java.util.*;
public class Account {
    public static void main(String[] args) {
    	DepositAccount saver = new DepositAccount(); 
        Scanner s=new Scanner(System.in);
        System.out.print("欢迎登录，请按任意数字键(除0)进入!");
        int choice=s.nextInt();
        while(choice!=0){
        	System.out.println("用户名:张三\n账号:1234567890");
            System.out.println("请输入选项:");
            System.out.println("1.存款");
            System.out.println("2.取款");
            System.out.println("3.显示年利息");
            System.out.println("4.显示月利息");
            int a=s.nextInt();
        switch(a){
        case 1:
            System.out.print("请输入存款金额：");
            double m=s.nextDouble();
            saver.save(m);
            System.out.println("存款成功!");
            System.out.println("当前余额为:"+saver.getbalance());
            break;
        case 2:
            System.out.print("请输入取款金额：");
            double m1=s.nextDouble();
            saver.withdraw(m1); 
            System.out.println("当前余额为:"+saver.getbalance());
            break;
        case 3:
            System.out.println("当前年利息为:"+saver.getapryear());
            break;
        case 4:
            System.out.println("当前月利息为:"+saver.getaprmonth());
            break;
        default:
            System.out.println("输入有误，请重新输入:");
            }
        }
    }        
}
class DepositAccount{
	private double balance; //账户余额
	static double interest = 0.045; //年利率
	//存钱
	public void save(double m) {            
			this.balance = balance + m;
			}	
	//取钱
	public boolean withdraw(double m1) {    
		if(m1<=balance)
		{
			System.out.println("取款成功!");
			this.balance = balance-m1;
			return true;
		}
		else{
			System.out.println("您的余额不足!");
			return false;
		}
	}
	public double getbalance() {return balance;}//查询余额
	public double getapryear() {return interest*balance;}//查询年利息
	public double getaprmonth() {return interest*balance/12;}//查询月利息
}