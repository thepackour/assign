import java.util.Scanner;

public class ProductOrderMain3 {
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        for (ProductOrder order : orders) total += order.quantity * order.price;
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ProductOrder[] productOrders = new ProductOrder[3];

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= N; i++) {
            System.out.println(i + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = input.nextLine();

            System.out.print("가격: ");
            int productPrice = input.nextInt();
            input.nextLine();

            System.out.print("수량: ");
            int productQuantity = input.nextInt();
            input.nextLine();

            productOrders[i-1] = createOrder(productName, productPrice, productQuantity);
        }

        printOrders(productOrders);
        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
    }
}
