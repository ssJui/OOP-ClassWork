public class ProductFilter {
    
    public void filterProducts(String category) {
        System.out.println("Filtering products by category: " + category);
    }

    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Filtering products by price range: $" + minPrice + " - $" + maxPrice);
    }

    public void filterProducts(String brand, boolean isBrandFilter) {
        System.out.println("Filtering products by brand: " + brand);
    }

    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Filtering products by category: " + category + " and price range: $" + minPrice + " - $" + maxPrice);
    }

    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Filtering products by category: " + category + ", price range: $" + minPrice + " - $" + maxPrice + ", and brand: " + brand);
    }

    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();

        filter.filterProducts("Electronics");
        filter.filterProducts(100, 500);
        filter.filterProducts("Nike", true);
        filter.filterProducts("Fashion", 50, 200);
        filter.filterProducts("Electronics", 300, 1000, "Apple");
    }
}
