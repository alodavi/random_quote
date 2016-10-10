package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/random.do")
public class RandomQuoteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		request.setAttribute("quote", quoteGenerator());
		request.getRequestDispatcher("/random-quote.jsp").forward(request, response);
	}

	private String quoteGenerator() {

		String q1 = "\"Space, the final frontier. These are the voyages of the starship Enterprise. Its 5-year mission, to explore strange new worlds, to seek out new life and new civilizations, to boldly go where no man has gone before.\"  Captain Kirk, Star Trek";
		String q2 = "\"You can\'t appreciate Shakespeare until you\'ve read him in the original Klingon.\" General Chang, Star Trek VI";
		String q3 = "\"Dammit, man! I'm a doctor, not a physicist!\" Dr \'Bones\' McCoy";
		String q4 = "\"Pain is a thing of the mind. The mind can be controlled.\" Spock";
		String q5 = "\"Things are only impossible until they\'re not.\" Captain Jean-Luc Picard";
		String q6 = "\"Change is the essential process of all existence.\" Spock";
		String q7 = "\"Logic is the beginning of wisdom; not the end.\" Spock";
		String q8 = "\"The bureaucratic mentality is the only constant in the universe.\" Dr \'Bones\' McCoy";
		String[] list = {q1, q2, q3, q4, q5, q6, q7,q8};
		
		int theNumber = (int)(Math.random()*8);
		return list[theNumber];
		
	}


}
