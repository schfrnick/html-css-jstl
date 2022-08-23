import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Servlet2b")
public class Servlet2b extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet2b() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("<table bgcolor=\"#fdddff\">\n" + 
				"	  <tr style=\"font-weight:bold\">\n" + 
				"	    <th>Trial 1</th>\n" + 
				"	    <th>Trial 2</th>\n" + 
				"	    <th>Trial 3</th>\n" + 
				"	    <th>Horizontal sum</th>\n" + 
				"	    <th>Horizontal avg</th>\n" + 
				"	  </tr>    ");
		
		int x,y,z;
		int table[][] = new int[28][3];
		int sum[] = new int[28];
		double average[] = new double[28];
		String avgStr[] = new String[28];
		
		int colSum[] = new int[3];
		double colAverage[] = new double[3];
		String colAvgStr[] = new String[3];

        for (int i = 0; i < 28; i++) {
				
		table[i][0] = (int) (Math.random() * 10);
		table[i][1] = (int) (Math.random() * 10);
		table[i][2] = (int) (Math.random() * 10);
		
		sum[i] = table[i][0] + table[i][1] + table[i][2]; 
		average[i] = sum[i]/3.0; 
		avgStr[i] = String.format("%.2f", average[i]);
		
		colSum[0] += table[i][0];
		colSum[1] += table[i][1];
		colSum[2] += table[i][2];
		
		response.getWriter().append(" <tr style=\"font-weight:bold\">\n" + 
				"		    <td>" + table[i][0] + "</td>\n" + 
				"		    <td>" + table[i][1] + "</td>\n" + 
				"		    <td>" + table[i][2] + "</td>\n" + 
				"		    <td>" + sum[i] + "</td>\n" + 
				"		    <td>" + avgStr[i] + "</td>\n" + 
				"		  </tr>");
       }
	
        colAverage[0] = colSum[0]/28.0;
	  	colAverage[1] = colSum[1]/28.0;
	  	colAverage[2] = colSum[2]/28.0;
	  	
	  	colAvgStr[0] = String.format("%.2f", colAverage[0]);
	  	colAvgStr[1] = String.format("%.2f", colAverage[1]);
	  	colAvgStr[2] = String.format("%.2f", colAverage[2]);
	  	
	  	response.getWriter().append(" <tr>\n" + 
	  			"			<td>" + colSum[0] + "</td>\n" + 
	  			"		    <td>" + colSum[1] + "</td>\n" + 
	  			"		    <td>" + colSum[2] + "</td>\n" + 
	  			"		    <td><b>Vertical sum</b></td>\n" + 
	  			"		  </tr>\n" + 
	  			"		  <tr>\n" + 
	  			"			<td>" + colAvgStr[0] + "</td>\n" + 
	  			"		    <td>" + colAvgStr[1] + "</td>\n" + 
	  			"		    <td>" + colAvgStr[2] + "</td>\n" + 
	  			"		    <td><b>Vertical avg</b></td>\n" + 
	  			"		  </tr>	\n" + 
	  			"	</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}