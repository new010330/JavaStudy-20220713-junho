package j14_lombok.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product {
	private Product product;
	
	
	private int productCode;		// 제품 코드		:20220802
	private String productName;		// 제품명			:스타벅스
	private String productCategory;	// 제품 카테고리	:텀블러
	private String createDate;		// 생산일자			:2022-08-02
	
	public static Product builder() {
		return new Product();
	}

	public Product build() {
		return this;
	}
	
	public Product productCode(int productCode) {
		this.productCode = productCode;
		return this;
	}
	
	public Product productName(String productName) {
		product.setProductName(productName);
		return this;
	}
	
	public Product productCategory(String productCategory) {
		product.setProductCategory(productCategory);
		return this;
	}
	
	public Product createDate(String createDate) {
		product.setCreateDate(createDate);
		return this;
	}
	
}
