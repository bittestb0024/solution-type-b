package problem03;

public class Money {
	public Money() {}
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		int num = this.amount + money.amount;
		return new Money(num);
	}

	public Money minus(Money money) {
		int num = this.amount - money.amount;
		return new  Money(num);
	}

	public Money multiply(Money money) {
		int num = this.amount * money.amount;
		return new  Money(num);
	}

	public Money devide(Money money) {
		int num = this.amount / money.amount;
		return new Money(num);
	}
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		if(money.amount == this.amount){
			return true;
		}
		return false;
	}
}