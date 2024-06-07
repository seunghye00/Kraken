package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MovieDAO;
import dto.MovieDTO;

@WebServlet("*.movie")
public class MovieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getRequestURI();
		MovieDAO dao = MovieDAO.getInstance();
<<<<<<< HEAD

=======
<<<<<<< HEAD
>>>>>>> a189d8c12e3c0957be0170b883d4fb460c83a59e
		try {

			if (cmd.equals("/input.movie")) {
				String title = request.getParameter("");
<<<<<<< HEAD
				System.out.println(title);
				String name = request.getParameter("");
				System.out.println(name);
=======
				String name = request.getParameter("");
>>>>>>> a189d8c12e3c0957be0170b883d4fb460c83a59e
				response.sendRedirect("index.jsp");

			} else if (cmd.equals("/output.movie")) {
				List<MovieDTO> list = dao.selectAll();
				request.setAttribute("list", list);
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (Exception e) {
<<<<<<< HEAD

		}
=======
=======
		try{
			
		
		if (cmd.equals("/input.movie")) {
			String title = request.getParameter("");
			String name = request.getParameter("");
			response.sendRedirect("index.jsp");
			
		} else if (cmd.equals("/output.jsp")) {
			List<MovieDTO> list = dao.selectAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("outputview.jsp").forward(request, response);
			
>>>>>>> 84d7db17c5927ab7ca38b47fd439820ca774fda7

		}

>>>>>>> a189d8c12e3c0957be0170b883d4fb460c83a59e
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
