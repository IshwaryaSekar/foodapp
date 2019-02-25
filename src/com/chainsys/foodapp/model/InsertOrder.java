package com.chainsys.foodapp.model;

public class InsertOrder {
private int quantity;
private FoodTable foodTable;
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public FoodTable getFoodTable() {
	return foodTable;
}
public void setFoodTable(FoodTable foodTable) {
	this.foodTable = foodTable;
}

}
