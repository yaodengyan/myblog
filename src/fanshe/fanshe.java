package fanshe;

public class fanshe {
	public static void main(String[] args) {
		//第一种方式获取Class对象
		Student stu1 = new Student();//这一new产生一个Student对象，一个Class对象
		Class stuClass = stu1.getClass();//获取Class对象
		System.out.println(stuClass.getName());
		
		//第二种方式获取Class对象
		Class stuClass2 = Student.class;
		System.out.println(stuClass==stuClass2);
		
		//第三种获取方式获取Class对象
		try {
			Class stuClass3 = Class.forName("fanshe.Student");//真实路径，包名和类名
			System.out.println(stuClass==stuClass3);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
