package dictionaryelev;

import java.util.ArrayList;

public class DictionaryArrayList<K, V> implements Dictionary<K, V> {

    private static int N = 10;
    private ArrayList<Item>[] tabel;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryArrayList() {
        tabel = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tabel[i] = new ArrayList<Item>();
        }
    }


    /**
     * Returnerer elementet hoerende til noeglen k, hvis noeglen ikke findes
     * returneres null
     *
     * @param key
     * @return objektet med noegle key
     */
    @Override
    public V get(K key) {
        int i = key.hashCode() % N;
        Item temp = tabel[i].get(0);
        while (temp != null){

        }
        return null;
    }

    /**
     * Returnerer om dictionary er tom
     *
     * @return om map'en er tom
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Indsætter objektet value med nøgle key I dictionary. Hvis key allerede
     * eksisterer overskrives value hoerende til key vaerdi og den gamle value
     * returneres. Hvis key ikke er der returneres null. Hverken key eller value
     * maa vaere null
     *
     * @param key   noeglen objektet skal indsaettes med
     * @param value
     * @return
     */
    @Override
    public V put(K key, V value) {
        return null;
    }

    /**
     * Fjerner (noegle, vaerdi)- parret med noeglen key fra dictionary'en og
     * value returneres.
     *
     * @param key
     * @return objektet hoerende til noeglen key; null hvis key ikke findes
     */
    @Override
    public V remove(K key) {
        return null;
    }

    /**
     * Returnerer antallet af elementer i dictionary
     *
     * @return antal elementer i dictionary
     */
    @Override
    public int size() {
        return 0;
    }

    private class Item {
        K key;
        V value;
    }
}
