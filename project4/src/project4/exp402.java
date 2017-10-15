/**   
* @Title: exp402.java
* @Package project4
* @Description: TODO(用一句话描述该文件做什么)
* @author Chen   
* @date 2017年10月15日 下午4:14:18
* @version V1.0   
*/


package project4;

/**
* @ClassName: exp402
* @Description: 显示学生信息
* @author Chen
* @date 2017年10月15日 下午4:14:18
* 
*/
class Student{
	private String name;   //姓名
    private int age;       //年龄
    private String education;   //学历
    public Student(String name, int age, String education) {
    	super();
        this.name = name;
        this.age = age;
        this.education = education;
        }
    public Student() {
    	super();
    	}
    public String getName() {
    	return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    //输出学生信息
    public void show(){
        System.out.println("姓名:" + this.getName() + "-年龄:" + this.getAge() + "-学历:" + this.getEducation() );
    }
}
//本科生
class Undergraduate extends Student{
	private String specialty;
	public String getSpecialty() {
		return specialty;
    }
 
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String education, String specialty) {
        super(name, age, education);
        this.specialty = specialty;
    }
 
    public Undergraduate(String name, int age, String education) {
        super(name, age, education);
    }
     //输出本科生信息
    public void show(){
        System.out.println("姓名:" + this.getName() + "-年龄:" + this.getAge() + "-学历:" + this.getEducation() + "-研究方向:" + this.getSpecialty());
    }
}
//研究生
class Graduate extends Student{
    private String direction;
    
    public String getDirection() {
        return direction;
    }
 
    public void setDirection(String direction) {
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String education, String direction) {
        super(name, age, education);
        this.direction = direction;
    }
 
    public Graduate(String name, int age, String education) {
        super(name, age, education);
    }
    //输出研究生信息
    public void show(){
        System.out.println("姓名:" + this.getName() + "-年龄:" + this.getAge() + "-学历:" + this.getEducation() + "-研究方向:" + this.getDirection());
    }
}
public class exp402 {
	public static void main(String[] args) {		
        Undergraduate student1=new Undergraduate("阮一轩",19,"本科","软件工程");
        Graduate student2=new Graduate("阮二轩",27,"硕士","通信工程");
        student1.show();
        student2.show();
    }
}
