import java.util.Scanner;
class ParingCodeChef 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int tcNum=sc.nextInt();
		int result[]=new int[tcNum],z=-1;
		for(int i=0;i<tcNum;i++)
		{
			int cNum=sc.nextInt();
			int arr[]=new int[cNum];
			for(int j=0;j<cNum;j++)
			{
				arr[j]=sc.nextInt();
			}
			z++;
			paringCalc(arr,result,z);
		}
		for (int r : result) {
			System.out.println(r);
		}
		sc.close();
	}

	private static void paringCalc(int[] arr, int[] result, int z) 
	{
		insertionSort(arr);
		int pair=0,highSkill=0;
		if(arr[arr.length-1]==arr[arr.length-2])
		{
			highSkill=arr[arr.length-1];
			for(int i=0;i<arr.length-1;i++)
			{
				if(highSkill==arr[i])
					pair++;
			}
		}
		else
		{
			highSkill=arr[arr.length-2];
			for(int i=0;i<arr.length-1;i++)
			{
				if(highSkill==arr[i])
					pair++;
			}		
		}
		result[z]=pair;
	}

	private static void insertionSort(int[] arr) 
	{
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=0;
			for(j=i;j>0&&key<arr[j-1];j--)
			{
				arr[j]=arr[j-1];
			}
			arr[j]=key;
		}
	}
}

