import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.Vector;


public class level2 {
	public static void main (String []  args) throws IOException {
		FileReader fr=new FileReader("level2_5.in");    
	     BufferedReader br=new BufferedReader(fr);   
	     String mydelim = ","; 
	     StringTokenizer ST;
	     double temp;
	     String temp2;
	     temp2=br.readLine();
	     int i=Integer.parseInt(temp2);
		 //System.out.println(temp2);
	     temp2=br.readLine();
//	     System.out.println(temp2);
	     ST = new StringTokenizer(temp2, mydelim);
	     ST.nextToken();
	     ST.nextToken();
	     ST.nextToken();
	     ST.nextToken();
	     Hashtable <String,Vector <Integer>> AirportswithTime=new Hashtable<String, Vector<Integer>>();
	     Hashtable <String,Integer> AirportsCount=new Hashtable<String, Integer>();
	     String airports=ST.nextToken()+ " "+ST.nextToken();
    	 int time=Integer.parseInt(ST.nextToken());
    	 Vector<Integer> temp3=new Vector();
         temp3.add(time);
         AirportswithTime.put(airports, temp3);
    	 AirportsCount.put(airports, 1);
	     for(i=i-1;i>0;i--) {
	    	 temp2=br.readLine();
	    	 ST = new StringTokenizer(temp2, mydelim);
		     ST.nextToken();
		     ST.nextToken();
		     ST.nextToken();
		     ST.nextToken();
		     airports=ST.nextToken()+ " "+ST.nextToken();
		     time=Integer.parseInt(ST.nextToken());
		     if(AirportswithTime.get(airports)==null) {
		    	 temp3=new Vector();
		         temp3.add(time);
		    	 AirportswithTime.put(airports, temp3);
//		         System.out.println(AirportswithTime.get(airports).size());
		         AirportsCount.put(airports, 1);
		     }
		     else {
		    	 if(!(AirportswithTime.get(airports).contains(time))) {
//		    		 AirportsCount.put(airports, AirportsCount.get(airports)+1);
		    		 AirportswithTime.get(airports).add(time);
		             AirportswithTime.put(airports, AirportswithTime.get(airports));
		    	 }
		     }
	     }
	     ArrayList<String> v = new ArrayList<String>(AirportswithTime.keySet());
	     Collections.sort(v);
	     for(int j=0;j<v.size();j++) {
	    	 if((AirportswithTime.get(v.get(j)).size())!=0) {
	    		System.out.print(v.get(j)+" ");
	    	 	System.out.println(AirportswithTime.get(v.get(j)).size());
	    	 }
	     }
	     System.out.println("");
	     File file = new File("level2_example.out"); 
//	     
	     BufferedReader br2 = new BufferedReader(new FileReader(file)); 
//	     
	     String st;
	     int l=0;
	     while ((st = br2.readLine()) != null) {
//	    	 System.out.println(st);
	    	 l+=st.length();
	     }
////	     System.out.println(l	);
	       	
	     } 
	}

