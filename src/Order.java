
public abstract class Order implements Comparable<Order> {

		private int price;
		private int quantity;
		
		
		public Order(int p, int q){
			this.price = p;
			this.quantity = q;
		}
		
		//create comparable override for type order
		@Override
		public int compareTo(Order anotherOrder) {
		    if (this.price > anotherOrder.getPrice())
		    	return 1;
		    else if (this.price < anotherOrder.getPrice())
		    	return -1;
		    else
		    	return 0;  	
		}
		
		public abstract void print();
		
		//returns price from current order
		public int getPrice() {
			return this.price;
		}
		
		//sets price of current order
		public void setPrice(int p) {
			this.price = p;
		}
		
		//returns qty from current order
		public int getQuantity() {
			return this.quantity;
		}
		
		//sets qty of current order
		public void setQuantity(int q) {
			this.quantity = q;
		} 
}
