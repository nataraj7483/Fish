package com.nataraj.task;

public class P3 {

	public static void main(String[] args) {
		
		System.out.println("=======");
        int n=4;
        //main loop
        for(int i=1;i<=n;i++) {
        	//printing space
        	for(int j=n-1;j>=i;j--) {
        	System.out.print(" ");
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print("$");
        	}
        	System.out.println("");
        }
        
        System.out.println("=======");
        int a=4;
        //main loop
        for(int i=1;i<=a;i++) {
        	//printing space
        	for(int j=a-1;j>=i;j--) {
        	System.out.print(" ");
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print("$ ");
        	}
        	System.out.println("");
        }
        System.out.println("=======");
        int b=4;
        //main loop
        for(int i=1;i<=b;i++) {
        	//printing space
        	for(int j=b-1;j>=i;j--) {
        	System.out.print(" ");
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print(i);
        	}
        	System.out.println("");
        }
        System.out.println("=======");
        int c=4;
        //main loop
        for(int i=1;i<=c;i++) {
        	//printing space
        	for(int j=c-1;j>=i;j--) {
        	System.out.print(" ");
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print(k);
        	}
        	System.out.println("");
        }
        
        System.out.println("=======");
        int d=4;
        //main loop
        for(int i=1;i<=d;i++) {
        	//printing space
        	for(int j=d-1;j>=i;j--) {
        	System.out.print(j);
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print(k);
        	}
        	System.out.println("");
        }
        
        System.out.println("=======");
        int e=4;
        //main loop
        for(int i=1;i<=e;i++) {
        	//printing space
        	for(int j=e-1;j>=i;j--) {
        		if(j==2) {
        			System.out.print("Nataraj");
        		}
        			else {
        				System.out.print(j);
        			
        		}
        	
        }
        	
			for(int k=1;k<=i;k++)
        	{
        		if(k==2) {
        			System.out.print("Nataraj");
        		}
        			else
        			{
        				System.out.print(k);
        			}
        		
        		
        	}
        	System.out.println("");
        }
        
        System.out.println("=======");
        int f=4;
        //main loop
        for(int i=f;i>=1;i--) {
        	//printing space
        	for(int j=f-1;j>=i;j--) {
        	System.out.print(" ");
        }
        	for(int k=1;k<=i;k++) {
        		System.out.print( k);
        	}
        	System.out.println(" ");
        }
	
	}

}

