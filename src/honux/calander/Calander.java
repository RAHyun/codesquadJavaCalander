package honux.calander;

import java.util.Scanner;






public class Calander {
	

	//1 -----------------------------------------------------------
	 public static void Jan() {
	  System.out.println("  일    월    화    수  목   금    토");

	  System.out.println("--------------------");
	  System.out.println("    1  2  3  4  5  6");
	  System.out.println(" 7  8  9 10 11 12 13");
	  System.out.println(" 14  15 16 17 18 19 20");
	  System.out.println(" 21  22 23 24 25 26 27");
	  System.out.println(" 28  29 30 31 ");
	}
	//---------------------------------------------------------------	


	//2월-----------------------------------------------------------
	 public static void Feb() {
		System.out.println("  일    월    화    수   목    금    토");

		System.out.println("--------------------");
		System.out.println("             1  2  3");
		System.out.println(" 4  5  6  7  8  9  10");
		System.out.println(" 11 12 13 14 15 16 17");
		System.out.println("18 19 20 21 22 23 24");
		System.out.println("25 26 27 28         ");
	 }
	//---------------------------------------------------------------	
	
	 
		
//3월-----------------------------------------------------------
	 public static void Mar() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println("             1  2  3");
System.out.println(" 4  5  6  7  8  9  10");
System.out.println(" 11 12 13 14 15 16 17");
System.out.println("18 19 20 21 22 23 24");
System.out.println("25 26 27 28 30 31   ");
	 }
//---------------------------------------------------------------	
	
	//4월-----------------------------------------------------------
	 public static void Apr() {
	 System.out.println("  일    월    화    수   목    금    토");

	 System.out.println("--------------------");
	 System.out.println(" 1  2  3  4  5  6  7");
	 System.out.println(" 8  9 10 11 12 13 14");
	 System.out.println("15 16 17 18 19 20 21");
	 System.out.println("22 23 24 25 26 27 28");
	 System.out.println("29 30              ");
	 }
	 //---------------------------------------------------------------
	
		
//5월-----------------------------------------------------------
	 public static void May() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println("       1  2  3  4  5");
System.out.println(" 6  7  8  9 10 11 12");
System.out.println("13 14 15 16 17 18 19");
System.out.println("20 21 22 23 24 25 26");
System.out.println("27 28 29 30 31      ");
	 }

//---------------------------------------------------------------
	
	//6월-----------------------------------------------------------
	 public static void June() {
	 System.out.println("  일    월    화    수   목    금    토");

	 System.out.println("--------------------");
	 System.out.println("                1  2");
	 System.out.println(" 3  4  5  6  7  8  9");
	 System.out.println("10 11 12 13 14 15 16");
	 System.out.println("17 18 19 20 21 22 23");
	 System.out.println("24 25 26 27 28 29 30");
	 }
	 //---------------------------------------------------------------
	 
	 
		
//7월-----------------------------------------------------------
	 public static void July() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
System.out.println("29 30 31           ");
	 }
	 
		
//8월-----------------------------------------------------------
	 public static void Aug() {
	 
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
	 }
//---------------------------------------------------------------

		
//9월-----------------------------------------------------------
	 public static void Sep() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
	 }
//---------------------------------------------------------------	
	 
	 
		
//10월-----------------------------------------------------------
	 public static void Oct() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
	 }
//---------------------------------------------------------------			
//11월-----------------------------------------------------------
	 public static void Nov() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
	 }
//---------------------------------------------------------------	

//12월-----------------------------------------------------------
public static void Dec() {
System.out.println("  일    월    화    수   목    금    토");

System.out.println("--------------------");
System.out.println(" 1  2  3  4  5  6  7");
System.out.println(" 8  9 10 11 12 13 14");
System.out.println("15 16 17 18 19 20 21");
System.out.println("22 23 24 25 26 27 28");
}
//---------------------------------------------------------------			


	 
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {
	
	

		
			





		// 입력받은 달의 최대 일수
		
	
		/*
	int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			Scanner sc2 = new Scanner(System.in);
	
	
		
			System.out.println("반복횟수 입력:");
		int loops= sc2.nextInt();
		
		for(int i=0; i<=loops; i++)
		{
			System.out.println("달 입력");
			int month = sc2.nextInt();
		System.out.println(month + "의 총 일수는 "+ maxDays[month-1]);
		}
		*/


Scanner sc2 = new Scanner(System.in);
int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


System.out.println("반복횟수 입력:");

int loops= sc2.nextInt();
for(int i=0; i<loops; i++)
{

  
	System.out.println("달 입력");
    int month = sc2.nextInt();
    System.out.println(month + "달 달력 ");
    switch(month) {
    case 1: 
    	Jan();
    case 2: { Feb();break;}
    case 3: { Mar();break;}
    case 4: { Apr();break;}
    case 5: { May();break;}
    case 6: { June();break;}
    case 7: { July();break;}
    case 8: { Aug(); break;}
    case 9: { Sep();break;
    }
    case 10: {Oct();break;}
    case 11: {Nov();break;}
    case 12: {Dec();break;}
    case -1: {
    	sc2.close();
    	break;}
    default:
    	{System.out.println("Enter again!");
    	}
    }
    
  
}
}
	
}
