
public class SellOrder extends Order{
		
		public SellOrder(int p, int q){
			super(p,q);
		}
		
		//prints a single sell order
		public void print(){
			System.out.println("(sell, " + this.getPrice() + ", " + this.getQuantity() + ")");
		}
}
