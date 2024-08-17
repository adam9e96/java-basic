package chapter_22_collection_map;

import java.util.HashMap;
import java.util.Map;

/**
 * 2. 제품 재고 관리
 * 제품의 재고를 관리할 때, 제품 코드를 키로, 재고 수량을 값으로 사용하여 재고를 빠르게 조회하고 업데이트 하는 예제
 */

class InventoryManager {
    private final Map<String, Integer> inventoryMap = new HashMap<>();

    // 제품 추가 또는 재고 수량 업데이트
    public void addProduct(String productCode, int quantity) {
        inventoryMap.put(productCode, inventoryMap.getOrDefault(productCode, 0) + quantity);
    }

    // 제품 재고 조회
    public int getProductStock(String productCode) {
        return inventoryMap.getOrDefault(productCode, 0);
    }

    // 제품 재고 감소
    public void removeProduct(String productCode, int quantity) {
        if (inventoryMap.containsKey(productCode)) {
            int newQuantity = inventoryMap.get(productCode) - quantity;
            if (newQuantity > 0) {
                inventoryMap.put(productCode, newQuantity);
            } else {
                inventoryMap.remove(productCode);
            }
        }
    }

    // 모든 재고 정보 출력
    public void printAllProducts() {
        for (Map.Entry<String, Integer> entry : inventoryMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Stock: " + entry.getValue());
        }
    }

    public static class HashMapDemo02 {
        public static void main(String[] args) {

            InventoryManager inventoryManager = new InventoryManager();

            // 제품 추가 및 재고 수량 업데이트
            inventoryManager.addProduct("P001", 100);
            inventoryManager.addProduct("P002", 200);
            inventoryManager.addProduct("P003", 300);

            // 특정 제품 재고 조회
            int stock = inventoryManager.getProductStock("P002");
            System.out.println("P002 재고 수량: " + stock);

            // 없는 제품 재고 조회 해보기
            int stock2 = inventoryManager.getProductStock("P005");
            System.out.println("P005 재고 수량: " + stock2); // 제품코드가 없어서 0

            // 모든 제품 재고 출력
            System.out.println("\n모든 제품 재고:");
            inventoryManager.printAllProducts();

            // 특정 제품 재고 감소
            inventoryManager.removeProduct("P002", 50);

            // 모든 제품 재고 출력
            System.out.println("\n재고 감소 후:");
            inventoryManager.printAllProducts();
        }

    }
}
