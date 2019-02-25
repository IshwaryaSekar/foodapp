package com.chainsys.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.foodapp.DAO.FoodDAO;
import com.chainsys.foodapp.model.FoodTable;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String category = request.getParameter("category");
		
		FoodTable foodTable=new FoodTable();
//		System.out.println(category);
		foodTable.setCategory(category);
		FoodDAO dao = new FoodDAO();
		try {
			
			System.out.println("success");
			List<FoodTable> foodList=dao.findByCategory(foodTable);
			request.setAttribute("FOODS", foodList);
			RequestDispatcher rd = request
					.getRequestDispatcher("listfoods.jsp");
			rd.forward(request, response);
		}
		 catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				RequestDispatcher rd = request.getRequestDispatcher("failure.html");
				rd.forward(request, response);
			}

	}

}
