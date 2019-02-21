package problem03;

public class Money {
	public Money() {}
	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		this.amount += money.amount;
		return new Money(this.amount);
	}

	public Money minus(Money money) {
		this.amount -= money.amount;
		return new Money(this.amount);
	}

	public Money multiply(Money money) {
		this.amount *= money.amount;
		return new Money(this.amount);
	}

	public Money devide(Money money) {
		this.amount /= money.amount;
		return new Money(this.amount);
	}
}