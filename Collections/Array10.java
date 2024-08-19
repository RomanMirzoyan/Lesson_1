
public class Array10 {
    public static void main(String[] args) {
        String[] words = {"cat", "cat", "oil", "milk", "banana", "car", "milk", "dog", "trees", "apple"};
        HashMap<String, Integer> wordCount = new HashMap<>();
for (String word : words) {
    wordCount.merge(word, 1, Integer::sum);
}
for (HashMap.Entry<String, Integer> entry : wordCount.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue() + " раз(а)");
}
    }
}
