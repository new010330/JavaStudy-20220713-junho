package j14_lombok.builder;

public class BuilderMain {

	public static void main(String[] args) {
		Builder builder = new Builder(); // 객체 생성
		Product product = builder.builder() // 
				.productCode(20220802)
				.productName("스타벅스 텀블러")
				.productCategory("텀블러")
				.createDate("2022-08-02")
				.build();
		
		System.out.println(product);
		
	}

}
