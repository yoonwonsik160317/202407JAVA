package drive;

import shop.Product;
import shop.ProductDAO;

public class Ex2 {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		Product product = new Product(1, "샤프1", "최고의 샤프1", 12000, 5);
		dao.updateProduct(product);
		System.out.println("수정 완룍");
	}

}
