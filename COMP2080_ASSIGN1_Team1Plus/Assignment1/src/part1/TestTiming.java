package part1;

import java.math.BigInteger;


public class TestTiming {
	
	 public static void main(String[] args)
	 {
		 //TestDaffy();
		 //TestDonald();
		 //TestMickey();
		 //TestGoofy();
		 //TestMinnie();
		 //TestGoofy();
		 //TestPluto();
		 //TestGyro();
		 TestFact();
	 }
	
	
	public static void TestDaffy() {
		
		Stopwatch timer = new Stopwatch();
		
		for(int i = 30; i <= 44; i++)
		{
			timer.start();
			
			Timing.daffy(i);
			
			timer.stop();

			System.out.println(timer);
		}
		
	} //End TestDuffy
	
	
	
	public static void TestDonald() {
		
		Stopwatch timer = new Stopwatch();
		
		for(int i = 30; i <= 44; i++)
		{
			timer.start();
			
			Timing.donald(i);
			
			timer.stop();

			System.out.println(timer);
		}
		
	} //End TestDonald
	
	
	
	public static void TestMickey() {
		
		Stopwatch timer = new Stopwatch();
		
		int n = 1000;
		while(n <= 8192000)
		{
			int[] arr = Timing.randomarr(n);

			timer.start();
			
			Timing.mickey(arr);
			
			timer.stop();

			System.out.println(n + "\t" + timer.toString());
			
			n *= 2;
		}
		
	} //End TestMickey
	
	
	
	
	
public static void TestMinnie() {
		
		Stopwatch timer = new Stopwatch();
		
		int n = 1000;
		while(n <= 256000)
		{
			int[] arr = Timing.randomarr(n);

			timer.start();
			
			Timing.minnie(arr);
			
			timer.stop();

			System.out.println(n + "\t" + timer.toString());
			
			n *= 2;
		}
		
	} //End TestMinnie



public static void TestGoofy() {
	
	Stopwatch timer = new Stopwatch();
	
	int n = 1000;
	while(n <= 256000)
	{
		int[] arr = Timing.randomarr(n);

		timer.start();
		
		Timing.goofy(arr);
		
		timer.stop();

		System.out.println(n + "\t" + timer.toString());
		
		n *= 2;
	}
	
} //End TestGoofy




public static void TestPluto() {
	
	Stopwatch timer = new Stopwatch();
	
	int n = 1000;
	while(n <= 256000)
	{
		int[] arr = Timing.randomarr(n);

		timer.start();
		
		Timing.pluto(arr);
		
		timer.stop();

		System.out.println(n + "\t" + timer.toString());
		
		n *= 2;
	}
	
} //End TestPluto





public static void TestGyro() {
	
	Stopwatch timer = new Stopwatch();
	
	int n = 1000;
	while(n <= 256000)
	{
		int[] arr = Timing.randomarr(n);

		Timing.pluto(arr);	
		
		timer.start();
		
		Timing.gyro(arr);
		
		timer.stop();

		System.out.println(n + "\t" + timer.toString());
		
		n *= 2;
	}
	
} //End TestGyro




public static void TestFact(){
	
	Stopwatch timer = new Stopwatch();
	
	
	for(long i = 1000; i <= 64000; i *= 2){
		
		System.out.println("fact(BigInteger " + i + ");");
		
		BigInteger bigInt = BigInteger.valueOf(i);

		timer.start();
		
		Timing.fact(bigInt);
		
		timer.stop();
		
		System.out.println(timer + "\n");
		
	}
	
	
  } //End TestFact
	
} //End TestTiming