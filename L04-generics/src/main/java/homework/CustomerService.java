package homework;

import java.util.Map;
import java.util.TreeMap;

public class CustomerService {
    private final TreeMap<Customer, String> customerMap = new TreeMap<>();
    private final TreeMap<Customer, String> customerMapCopy = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        customerMapCopy.putAll(customerMap);
        Map.Entry<Customer, String> entryFromMapCopy = customerMapCopy.firstEntry();
        Customer customerCopyFromMapCopy = new Customer(entryFromMapCopy.getKey().getId(),
                new String(entryFromMapCopy.getKey().getName()), entryFromMapCopy.getKey().getScores());
        customerMap.remove(entryFromMapCopy.getKey());
        return Map.entry(customerCopyFromMapCopy, customerMapCopy.get(customerCopyFromMapCopy));
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        return customerMap.pollFirstEntry();
    }

    public void add(Customer customer, String data) {
        customerMap.put(customer, data);
    }
}