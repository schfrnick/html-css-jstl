package com.nick;


import java.io.PrintWriter;
import java.lang.Math;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Random;
/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
       {
    	   int rolls =Integer.parseInt(req.getParameter("num1"));
    	   int attempts[] = new int[rolls];
    	   int min =Integer.parseInt(req.getParameter("num2"));
    	   int max =Integer.parseInt(req.getParameter("num3"));
    	   
    	   int existArr[]= new int[rolls];
    	   int i = 0;
    	   int f;
    	   while(i < rolls)
    	   {
    	   Random random = new Random();
    	   f = random.nextInt(max - min + 1) + min;
    	   attempts[i] = f;
    	   i++;
    	   }
    	   i= 0;
    	   int counter;//store the total times rolled
    	   while( i < rolls){
               f = attempts[i];//store current value
               counter = 0;
               boolean holder =Exists(existArr,f);
               
               if(holder == false)
               {//then we check the array for occurences.
            	   while(i<rolls){
            		   int temp = attempts[i];
            		   	if(f == temp)
            		   	{
            		   		counter ++;
            		   	}
            	   		}
            	   int temp2 = (counter / rolls)*100;
            	   res.getWriter().append("%d occurs %d percentage of times\n",i, temp2);
               }
               
               i++;
           }//end of for loop
    	   


        	   
           }

       public static boolean Exists (int[] arr, int toCheckValue)
       {
           // check if the specified element
           // is present in the array or not
           // using Linear Search method
           boolean test = false;
           for (int element : arr) {
               if (element == toCheckValue) {
                   test = true;
                   break;
               }
           }
    
           return test;
       }
        
    	   
}



