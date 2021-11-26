package asnmentConditionLoop;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String args[])
	{ Scanner sc = new Scanner(System.in);
	int basic = sc.nextInt();
	char grade = sc.next().charAt(0);
	if ((basic <= 7500000)&&(basic >= 0)&&(grade<=67)&&(grade>=65))
		
	{ if (grade == 65)
	{System.out.print(basic + (basic / 5) + (basic / 2) + 1700 - ((basic*11)/100));}
	else if (grade == 66)
		{System.out.print(basic + (basic / 5) + (basic / 2) + 1500);}
	else 
		{System.out.print(basic + (basic / 5) + (basic / 2) + 1300);}
	}
	}
}
