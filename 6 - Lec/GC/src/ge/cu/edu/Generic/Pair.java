package ge.cu.edu.Generic;

public interface Pair<K, V> {

    public K getKey();  // v -ს მაგივრად ჩვეულებრივ მეთოდებში იყო String, char, int ან ასე შემდეგ მაგრამ Generic -ებში უნდა იყოს Generic ტიპი

    public V getValue();

    public void setKey(K key);

    public void setValus(V value);
}
