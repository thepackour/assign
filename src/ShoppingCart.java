public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void addItem(Item item) {
        if (itemCount >= 10) System.out.println("장바구니가 가득 찼습니다.");
        else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            if (item == null) break;  // itemCount로 개수만큼만 반복해도 되는듯

            String item_name = item.getName();
            int item_total = item.getTotal();
            System.out.println("상품명:" + item_name + ", 합계:" + item_total);
            total += item_total;
        }
        System.out.println("전체 가격 합:" + total);
    }
}
