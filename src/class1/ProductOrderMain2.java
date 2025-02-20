package class1;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주문개수를 입력해주세요 : ");
        int n = sc.nextInt();
        sc.nextLine();


        ProductOrder[] objArray = new ProductOrder[n];
        for(int i = 0; i < n; i++) {
            objArray[i] = new ProductOrder();
            System.out.println(i+1 + " 번째 주문을 입력해주세요 : ");
            System.out.print("상품명: ");
            objArray[i].productName = sc.nextLine();

            System.out.print("가격: ");
            objArray[i].Price = sc.nextInt();
            System.out.print("수량: ");
            objArray[i].quantity= sc.nextInt();
            sc.nextLine(); // 입력 버퍼를 비우기 위한 코드
        }
        printOrders(objArray);
        getTotalAmount(objArray);
    }

        static void printOrders(ProductOrder[] orders) {
            for (ProductOrder order : orders) {
                System.out.println("상품명: " + order.productName + ", 가격: " +
                        order.Price + ", 수량: " + order.quantity);
            }
        }

    public static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder obj = new ProductOrder();
        obj.productName = productName;
        obj.Price = price;
        obj.quantity = quantity;
        return obj;
    }

    public static void getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.Price;
        }
        System.out.println("총 주문 금액은 : " + sum + "입니다.");
    }
}

