package com.chainsys.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.foodapp.DAO.FoodDAO;
import com.chainsys.foodapp.model.FoodTable;
import com.chainsys.foodapp.model.InsertOrder;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int quantity = Integer.parseInt(request.getParameter("quantity"));
				InsertOrder insertOrder=new InsertOrder();
				insertOrder.setQuantity(quantity);
				FoodTable foodTable=new FoodTable();
			    foodTable.setId(foodId);
				insertOrder.setFoodTable(foodTable);
				InsertOrderDAO dao=new InsertOrderDAO();
				try
				{
					System.out.println("success");
				    dao.takeOrder(insertOrder);
				
}

