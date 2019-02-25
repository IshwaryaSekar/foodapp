package com.chainsys.foodapp.DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

import com.chainsys.foodapp.model.FoodTable;
import com.chainsys.foodapp.model.InsertOrder;
import com.chainsys.util.ConnectionUtilJdbc;

public class InsertOrderDAO {
	private static final Statement ConnectionUtil = null;
	public ArrayList<InsertOrder> takeOrder(InsertOrder insertOrder) throws Exception {
		ArrayList<InsertOrder> orderList = new ArrayList<InsertOrder>();
		try {
			Connection connection = ConnectionUtilJdbc.getConnection();
		