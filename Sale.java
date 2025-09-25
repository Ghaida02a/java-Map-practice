import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Sale {
    String category;
    double amount;
    public Sale(String category, double amount) { this.category = category; this.amount = amount; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
}

class SalesReporter {
    public static void main(String[] args) {
        // Sample sales data
        List<Sale> sales = Arrays.asList(
                new Sale("Electronics", 50.0),
                new Sale("Clothing", 100.0),
                new Sale("Electronics", 150.0),
                new Sale("Groceries", 300.0),
                new Sale("Clothing", 10.0)
        );

        SalesReporter reporter = new SalesReporter();
        Map<String, Double> totals = reporter.aggregateSales(sales);

        System.out.println("Total sales by category:");
        for (Map.Entry<String, Double> entry : totals.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public Map<String, Double> aggregateSales(List<Sale> sales) {
        Map<String, Double> categoryTotals = new HashMap<>();

        for (Sale sale : sales) {
            categoryTotals.merge(sale.getCategory(), sale.getAmount(), Double::sum);
        }
        return categoryTotals;
    }
}