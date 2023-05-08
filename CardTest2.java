package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CardTest2
 */
@WebServlet("/CardTest2")
public class CardTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CardTest2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String suit = request.getParameter("suit");
		String number[] = request.getParameterValues("number");
		String color = request.getParameter("color");
		String query = request.getParameter("query");
		
		System.out.println("--------");
		List<String> numberlist = null;
		if (number == null) {
			numberlist = new ArrayList<>();
		} else {
			numberlist = Arrays.asList(number);
		}
		System.out.println(numberlist);
		System.out.println("color=" + color);
		System.out.println("query=" + query);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println(suit);
		out.println("<hr>");
		boolean numberFlag[] = new boolean[53];
		
		if(suit.equals("all")) {
			if(color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♠");
					out.print(number[i]);
					
				}
				for(int i = 0;i<number.length;i++) {
					out.print("♥");
					out.print(number[i]);
					
				}
				for(int i = 0;i<number.length;i++) {
					out.print("♦");
					out.print(number[i]);
					
				}
				for(int i = 0;i<number.length;i++) {
					out.print("♣");
					out.print(number[i]);
					
				}
			}
			if(color.equals("red")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♥");
					out.print(number[i]);
					
				}
				for(int i = 0;i<number.length;i++) {
					out.print("♦");
					out.print(number[i]);
					
				}
			}
			if(color.equals("black")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♠");
					out.print(number[i]);
					
				}
				for(int i = 0;i<number.length;i++) {
					out.print("♣");
					out.print(number[i]);
					
				}
			}
		}
		if(suit.equals("spade")) {
			if(color.equals("black")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♠");
					out.print(number[i]);
					
				}
			}
		}
		if(suit.equals("heart")) {
			if(color.equals("red")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♥");
					out.print(number[i]);
					
				}
			}
		}
		if(suit.equals("diamond")) {
			if(color.equals("red")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♦");
					out.print(number[i]);
					
				}
			}
		}
		if(suit.equals("clover")) {
			if(color.equals("black")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					out.print("♣");
					out.print(number[i]);
					
				}
			}
		}
		
		out.println("<hr>");
		out.println(color);
		out.println("<hr>");
		out.println("query");
		out.println("<hr>");
		boolean suitFlag[] = new boolean[53];
		if(suit.equals("all")) {
			if(color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i]] = true;

				}
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 13] = true;
					
				}
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 26] = true;
					
				}
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 39] = true;
					
				}
			}
			if(color.equals("red")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 13] = true;
					
				}
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 26] = true;
					
				}
			}
			if(color.equals("black")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i]] = true;
					
				}
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 39] = true;
					
				}
			}
		}
		if(suit.equals("spade")) {
			if(color.equals("black")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i]] = true;
					
				}
			}
		}
		if(suit.equals("heart")) {
			if(color.equals("red")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 13] = true;
					
				}
			}
		}
		if(suit.equals("diamond")) {
			if(color.equals("red")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 26] = true;
					
				}
			}
		}
		if(suit.equals("clover")) {
			if(color.equals("black")||color.equals("both")) {
				for(int i = 0;i<number.length;i++) {
					suitFlag[number[i] + 29] = true;
					
				}
			}
		}
		out.println("<br>");
		
		for (int i=1; i<=52; i++) {
			if (suitFlag[i]==true) {
				String filename = "cards/" + i + ".png";
				out.printf("<img src=\"%s\" width=\"100\" height=\"150\">\n", filename);
			}
		}
		out.println("</html>");
	}

}
