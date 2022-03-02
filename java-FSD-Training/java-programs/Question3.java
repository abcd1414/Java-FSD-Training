package com.ust;

public class Question3 {
	public static void main(String[] args)
	{
	outerforloop:
		for(int i=1;i<=3;i++)
		{
			innerforloop:
				for(int j=1;j<=3;j++)
				{
					if(i==2&&j==2)
					{
						break outerforloop;
					}
					System.out.println(i+ " , " +j);
				}
			}
	}

}
