import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level1 {
 public static void main(String[] args) throws IOException {

     FileReader fr=new FileReader("level1_example.in");    
     BufferedReader br=new BufferedReader(fr);   
     String mydelim = ","; 
     
     StringTokenizer ST;
     double temp;
     String temp2;
     temp2=br.readLine();
     int i=Integer.parseInt(temp2);
	 //System.out.println(temp2);
     temp2=br.readLine();
     System.out.println(temp2);
     ST = new StringTokenizer(temp2, mydelim);
     int minTimestamp=Integer.parseInt(ST.nextToken());
     int maxTimestamp=minTimestamp;
     float minLat =Float.parseFloat(ST.nextToken());
     float maxLat=minLat;
     float minLong=Float.parseFloat(ST.nextToken());
     float maxLong=maxLat;
     float maxAltitude=Float.parseFloat(ST.nextToken());
     for (; i >0; i--) {
    	 temp2=br.readLine();
    	 //System.out.println(temp2);
         ST = new StringTokenizer(temp2, mydelim);
         temp =Double.parseDouble(ST.nextToken());
         if(temp<=minTimestamp)
        	 minTimestamp=(int) temp;
         if(temp>=maxTimestamp)
        	 maxTimestamp=(int) temp;
         temp =Double.parseDouble(ST.nextToken());
         if(temp<=minLat)
        	 minLat=(float) temp;
         if(temp>=maxLat)
        	 maxLat=(float) temp;
         temp =Double.parseDouble(ST.nextToken());
         if(temp<=minLong)
        	 minLong=(float) temp;
         if(temp>=maxLong)
        	 maxLong=(float) temp;
         temp =Float.parseFloat(ST.nextToken());
         if(temp>=maxAltitude)
        	 maxAltitude= (float) temp;
	}
     
     System.out.println(minTimestamp +" "+maxTimestamp);
//     System.out.println(((minLat%1==0) ? (new java.text.DecimalFormat("#").format(minLat)) : minLat)+" "+
// 		 	((maxLat%1==0) ? (new java.text.DecimalFormat("#").format(maxLat)) : maxLat));
//     System.out.println(((minLong%1==0) ? (new java.text.DecimalFormat("#").format(minLong)) : minLong)+" "+
//    		 	((maxLong%1==0) ? (new java.text.DecimalFormat("#").format(maxLong)) : maxLong));
//     System.out.println((11597.0%10));
//     System.out.println((maxAltitude%1==0) ? (new java.text.DecimalFormat("#").format(maxAltitude)) : maxAltitude);
     System.out.println(minLat+" "+maxLat);
     System.out.println(minLong+" "+maxLong);
     System.out.print(maxAltitude);
     
//     System.out.println("");
     File file = new File("level1_example.out"); 
//     
     BufferedReader br2 = new BufferedReader(new FileReader(file)); 
//     
     String st;
     int l=0;
     while ((st = br2.readLine()) != null) {
    	 System.out.println(st);
    	 l+=st.length();
     }
     System.out.println(l	);
       	
     } 
}

