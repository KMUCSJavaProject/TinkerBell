
public class Order {
		
	public int order_num;
	public int table_num = -1;
	public int[] menu_code;
	public static int currentOrderNumber = -1;
	
	public Order(int table_num, int[] menu_code) {
		this.order_num = currentOrderNumber;
		currentOrderNumber++;
		this.table_num = table_num;
		this.menu_code = menu_code;
	}
}
