package pkg;

public class clothes{
	String producer;
	int price;
	
	public clothes(String producer, int price){
		this.producer = producer;
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getProducer(){
		return producer;
	}
	
	public String greetings(){
		System.out.println("Welcome to the store");
	}
}