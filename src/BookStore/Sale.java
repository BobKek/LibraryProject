package BookStore;

public class Sale extends Books {
	protected int price, netprice;

	Sale(String t, String a, int i, int target, int p, int netp) {
		super(t, a, i, target);
		price = p;
		netprice = netp;
	}

	public int getPrice() {
		return price;
	}

	public int getNetPrice() {
		return netprice;
	}

}