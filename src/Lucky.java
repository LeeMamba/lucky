import java.util.Scanner;

public class Lucky {
	public static int num1 ;
	int[][] n = new int[9][2];         //���ڴ洢ע����Ϣ
	static int[] s = new int[9];				//���ڴ洢���ɵ����������������10��
	int COUNT = 10;
	public static String name;
//	String name1 = "ads";
	static String password ;
//	public String password = "saw";
//	String password1 = "safe";
	static int num;

	
	static Scanner input = new Scanner(System.in);
	static int userSelect = -1;										
													//�û����������Ͻ���ѡ��
	public static void main(String[] args) {

		while(true)
		{
			userSelect = showMenu();
			switch (userSelect) {
			case 1:
				System.out.println("[���˳齱>ע�᡿");
				reg();								//ע��
				
				break;
			case 2:
				System.out.println("[���˳齱>��¼��");
				login();							//��¼
				
				break;
			case 3:
				System.out.println("[���˳齱>�齱��");
				lottery();									//�齱
				
				break;
				

			default:
				System.out.println("������������");
				break;
			}
			if(userSelect == 0)
				System.out.println("ϵͳ�˳���ллʹ�ã�");
			break;	
		}
	
		
		
	}
	//�û���ʾ����
	public static int showMenu()              
	{
		System.out.println("|************|");
		System.out.println("��ӭ���뱾�γ齱���");
		System.out.println("|*************|");
		System.out.println("*****1.ע��*****");
		System.out.println("*****2.��¼*****");
		System.out.println("*****3.�齱*****");
		System.out.println("*****0.�˳�*****");
		userSelect = input.nextInt();
		return userSelect;
	}
	
	public static String reg()					//�����û���ע��
	{
//		String name ;
//		String password ;
		System.out.println("����д����ע����Ϣ��");
		System.out.println("�û�����");
		name = input.next();
		
		System.out.println("���룺");
		password = input.next();
		int num = (int)((int)10*Math.random());         //�������һ����
		System.out.println("��ϲ�㣬ע��ɹ���");
		System.out.println("���μ�������Ϣ");
		System.out.println("�û�����" + name);
		System.out.println("���룺" + password);
		System.out.println("��Ա�ţ�" + num);
		System.out.println("��8�������˵�");
			System.out.println("�����������");
		
		
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
				showMenu();				//������ҳ��
				break;



			default:
				System.out.println("ϵͳ�˳���ллʹ�ã�");
				break;
			}
			break;
		}
	
		return name;
	
	}
	
	public static void login()					//�û���¼����
	{
		int i = 0;
		while(true)
		{
//			String name1 = null;
			System.out.println("�û�����");
			String name1 = input.next();
			System.out.println("���룺");
			String password1 = input.next();
//			String password = null;
//			String name = null;
//			System.out.println(name);
//			System.out.println(name1);
//			System.out.println(password);
//			if(true)
			if(name1.equals(name)&&password1.equals(password))	
			{			
				System.out.println("��ϲ������¼�ɹ���");
//				System.out.println("zzzzz");
				System.out.println("�Ƿ����ڽ��г齱��");
				System.out.println("ѡ��1������������˳�");
				int s = input.nextInt();
				if(s == 1)
				{
					lottery();											//���г齱
					//showMenu();//�������˵�
					//break;	
				}
				else
					break;
			}
			else
				System.out.println("���ٴ����룡");
			i++;
			if(i==3)
			{
				System.out.println("�Բ����������������Ѵ����Σ�");
				showMenu();//�������˵�
				//return;
			}
//			return;
		}
		
	}
	
	public static void lottery()					//�齱����
	{
		for(int i=0;i<=5;i++)
		{
//			if(s[i+1] == s[i])
			s[i] = (int)((int)10*Math.random());    //����5������ͬ����
			for(int j = 0 ; j<i ; j++)
			{
				if(s[i] == s[j])						//�����ظ�
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
		System.out.println("���Ļ�Ա��" + num);
		for(int k = 0;k<=4;k++)
		{
			System.out.println("�������˺�" + s[k]);
		
		}
		boolean flag = false ;					//�����źţ������ж��Ƿ��н�
		for(int i = 0;i<=5;i++)
		{
			if(num == s[i]){
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("��ϲ�㣬�н��ˣ�");
		else
			System.out.println("���ź���û���н���");
			
	}
	
		
			
}

	

		

	

	

