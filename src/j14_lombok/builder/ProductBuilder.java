package j14_lombok.builder;

public abstract class ProductBuilder {
	protected Product product;
	
	public Product build() {
		return product;
	}
	
	public ProductBuilder builder() {
		product = new Product(); // 새로운 product 주소 메모리를 할당받는다.
		return this; // ProductBuilder
	}
	
	public abstract ProductBuilder productCode(int productCode);
	public abstract ProductBuilder productName(String productName);
	public abstract ProductBuilder productCategory(String productCategory);
	public abstract ProductBuilder createDate(String createDate);
}
