public class Server {
	
	public void MakeOrder(int table_num, int[] menu_code){//손님으로부터 주문받고 주문만들고 보내기를 해야함
		Order o = new Order(table_num, menu_code);//주문받고 주문 만들기
		// Counter.takeOrder(o); 카운터로 주문보내기
	}
	
}
