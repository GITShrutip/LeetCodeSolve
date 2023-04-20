package LeetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		int x[]= {4,2,1,1,2};
		System.out.println(kidsWithCandies(x,1));

	}
	
public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ls=new ArrayList<Boolean>();
        Boolean x=true;
        int max=0;
       // ls.add(true);
       max=candies[0];
        for(int i=1;i<candies.length;i++) {
        	System.out.println(candies[i]);
            if(max<candies[i]){
                max=candies[i];
                 
            }
           System.out.print(".max="+max+" ");

        } 
         System.out.print("max="+max+" ");
            for(int j=0;j<candies.length;j++){
                    System.out.print(candies[j]);
                        if(candies[j]+extraCandies>=max){
                            System.out.print(candies[j]+extraCandies);
                            ls.add(true);

                        }else{
                            ls.add(false);
                        }

                    }
                                    
            

           

        
        System.out.println(ls);
        return ls;
    }
    

}
