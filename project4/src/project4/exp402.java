/**   
* @Title: exp402.java
* @Package project4
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author Chen   
* @date 2017��10��15�� ����4:14:18
* @version V1.0   
*/


package project4;

/**
* @ClassName: exp402
* @Description: ��ʾѧ����Ϣ
* @author Chen
* @date 2017��10��15�� ����4:14:18
* 
*/
class Student{
	private String name;   //����
    private int age;       //����
    private String education;   //ѧ��
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
    //���ѧ����Ϣ
    public void show(){
        System.out.println("����:" + this.getName() + "-����:" + this.getAge() + "-ѧ��:" + this.getEducation() );
    }
}
//������
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
     //�����������Ϣ
    public void show(){
        System.out.println("����:" + this.getName() + "-����:" + this.getAge() + "-ѧ��:" + this.getEducation() + "-�о�����:" + this.getSpecialty());
    }
}
//�о���
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
    //����о�����Ϣ
    public void show(){
        System.out.println("����:" + this.getName() + "-����:" + this.getAge() + "-ѧ��:" + this.getEducation() + "-�о�����:" + this.getDirection());
    }
}
public class exp402 {
	public static void main(String[] args) {		
        Undergraduate student1=new Undergraduate("��һ��",19,"����","�������");
        Graduate student2=new Graduate("�����",27,"˶ʿ","ͨ�Ź���");
        student1.show();
        student2.show();
    }
}
