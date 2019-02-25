package com.chainsys.foodapp.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.chainsys.foodapp.model.FoodTable;
import com.chainsys.util.ConnectionUtilJdbc;

public class FoodDAO {
	private static final Statement ConnectionUtil = null;
	public ArrayList<FoodTable> findByCategory(FoodTable foodTable) throws Exception {
		ArrayList<FoodTable> foodList = new ArrayList<FoodTable>();
		try {
			Connection connection = ConnectionUtilJdbc.getConnection();
			String sql1 = "select name,price from Food_Table where category=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.setString(1, foodTable.getCategory());
			ResultSet resultSet = preparedStatement.executeQuery();
			System.out.println(resultSet.getRow());
			foodTable=null;
			while(resultSet.next()) {
				foodTable=new FoodTable();
			

				foodTable.setName(resultSet.getString("name"));
				foodTable.setPrice(resultSet.getInt("price"));
		        foodList.add(foodTable);
				

			}
			
			ConnectionUtilJdbc.close(connection, preparedStatement, resultSet);


		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// throw new Exception("Unable to find book");

		}
		 return foodList;

	}
	public ArrayList<FoodTable> findByQuantity(int[] ids) throws Exception {
		FoodTable food1 = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		ArrayList<FoodTable> details = new ArrayList<FoodTable>();
		try {
		Connection connection = ConnectionUtil.getConnection();
		for (int id : ids) {
		String sql4 = "select id,name,price from Food_Table where id=?";
		preparedStatement = connection.prepareStatement(sql4);
		preparedStatement.setInt(1, id);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
		food1 = new FoodTable();
		food1.setId(resultSet.getInt("id"));
		food1.setName(resultSet.getString("name"));
		food1.setPrice(resultSet.getInt("price"));

		System.out.println(food1);
		details.add(food1);

		}
		}
		ConnectionUtil.close();

		} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception("unable findbyid");
		}

		return details;
		}
		}