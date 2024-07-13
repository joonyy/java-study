package _07_generic.Practice;

class Pair<K,V>{
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "Key:" + key + ", Value:" + value;
    }
}
public class GenericPr01 {
    public static void main(String[] args) {
        Pair<String, Integer> P1 = new Pair<>("One", 1);
        System.out.println(P1.toString());
        Pair<Integer, String> P2 = new Pair<>(2, "Two");
        System.out.println(P2.toString());
    }

}
