import java.util.Scanner;

public class Lucky {
	public static int num1 ;
	int[][] n = new int[9][2];         //用于存储注册信息
	static int[] s = new int[9];				//用于存储生成的随机数，可以生成10个
	int COUNT = 10;
	public static String name;
//	String name1 = "ads";
	static String password ;
//	public String password = "saw";
//	String password1 = "safe";
	static int num;

	
	static Scanner input = new Scanner(System.in);
	static int userSelect = -1;										
													//用户在主界面上进行选择
	public static void main(String[] args) {

		while(true)
		{
			userSelect = showMenu();
			switch (userSelect) {
			case 1:
				System.out.println("[幸运抽奖>注册】");
				reg();								//注册
				
				break;
			case 2:
				System.out.println("[幸运抽奖>登录】");
				login();							//登录
				
				break;
			case 3:
				System.out.println("[幸运抽奖>抽奖】");
				lottery();									//抽奖
				
				break;
				

			default:
				System.out.println("您的输入有误");
				break;
			}
			if(userSelect == 0)
				System.out.println("系统退出，谢谢使用！");
			break;	
		}
	
		
		
	}
	//用户显示界面
	public static int showMenu()              
	{
		System.out.println("|************|");
		System.out.println("欢迎参与本次抽奖活动！");
		System.out.println("|*************|");
		System.out.println("*****1.注册*****");
		System.out.println("*****2.登录*****");
		System.out.println("*****3.抽奖*****");
		System.out.println("*****0.退出*****");
		userSelect = input.nextInt();
		return userSelect;
	}
	
	public static String reg()					//用于用户的注册
	{
//		String name ;
//		String password ;
		System.out.println("请填写个人注册信息：");
		System.out.println("用户名：");
		name = input.next();
		
		System.out.println("密码：");
		password = input.next();
		int num = (int)((int)10*Math.random());         //随机生成一个数
		System.out.println("恭喜你，注册成功！");
		System.out.println("请牢记您的信息");
		System.out.println("用户名：" + name);
		System.out.println("密码：" + password);
		System.out.println("会员号：" + num);
		System.out.println("按8返回主菜单");
			System.out.println("按任意键返回");
		
		
//		int sel = input.nextInt();
//		switch (sel) {
//		case 8:
//			showMenu();
//			break;
//
//		default:
//			break;
//		}
			
		
		
		while(true)
		    	{
			int sel = input.nextInt();
			switch (sel)
			{
			case 8:
				main(null);
				showMenu();				//返回主页面
				break;



			default:
				System.out.println("系统退出，谢谢使用！");
				break;
			}
			break;
		}
	
		return name;
	
	}
	
	public static void login()					//用户登录界面
	{
		int i = 0;
		while(true)
		{
//			String name1 = null;
			System.out.println("用户名：");
			String name1 = input.next();
			System.out.println("密码：");
			String password1 = input.next();
//			String password = null;
//			String name = null;
//			System.out.println(name);
//			System.out.println(name1);
//			System.out.println(password);
//			if(true)
			if(name1.equals(name)&&password1.equals(password))	
			{			
				System.out.println("恭喜您，登录成功！");
//				System.out.println("zzzzz");
				System.out.println("是否现在进行抽奖？");
				System.out.println("选择1继续，任意键退出");
				int s = input.nextInt();
				if(s == 1)
				{
					lottery();											//进行抽奖
					//showMenu();//返回主菜单
					//break;	
				}
				else
					break;
			}
			else
				System.out.println("请再次输入！");
			i++;
			if(i==3)
			{
				System.out.println("对不起，您输入错误次数已达三次！");
				showMenu();//返回主菜单
				//return;
			}
//			return;
		}
		
	}
	
	public static void lottery()					//抽奖环节
	{
		for(int i=0;i<=5;i++)
		{
//			if(s[i+1] == s[i])
			s[i] = (int)((int)10*Math.random());    //生成5个不相同的数
			for(int j = 0 ; j<i ; j++)
			{
				if(s[i] == s[j])						//避免重复
				{
					s[i] = (int)((int)10*Math.random());
					j=-1;
				}
			}
	

//			s[i+1] = (int)((int)10*Math.random());			
			
		}

//		for(int l=0;l<=4;l++)
//		{
//			for(int u=0;u<=4;u++)
//			{
//				if(s[l] == s[u])
//					s[u]=(int)((int)10*Math.random());
//			}
//		}
//		int num1 = (int)((int)10*Math.random());
		System.out.println("您的会员号" + num);
		for(int k = 0;k<=4;k++)
		{
			System.out.println("本次幸运号" + s[k]);
		
		}
		boolean flag = false ;					//设置信号，用于判断是否中奖
		for(int i = 0;i<=5;i++)
		{
			if(num == s[i]){
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("恭喜你，中奖了！");
		else
			System.out.println("很遗憾，没有中奖！");
			
	}
	
		
			
}

	

		

	

	

