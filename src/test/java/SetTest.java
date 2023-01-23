import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetTest {

    @Test
    void testAdd() {
        Set set = new Set();
        Assertions.assertTrue(set.add("Eko"));
        Assertions.assertFalse(set.add("Eko"));
        Assertions.assertTrue(set.add("Kurniawan"));
        Assertions.assertFalse(set.add("Kurniawan"));
    }

    @Test
    void testContains() {
        Set set = new Set();
        set.add("Eko");
        set.add("Kurniawan");
        Assertions.assertTrue(set.contains("Eko"));
        Assertions.assertTrue(set.contains("Kurniawan"));
        Assertions.assertFalse(set.contains("Khannedy"));
    }

    @Test
    void testRemove() {
        Set set = new Set();
        set.add("Eko");
        set.add("Kurniawan");
        set.add("Budi");
        set.add("Ardi");

        Assertions.assertEquals(4, set.size());

        set.remove("Ardi");

        Assertions.assertEquals(3, set.size());

        Assertions.assertTrue(set.contains("Eko"));
        Assertions.assertTrue(set.contains("Kurniawan"));
        Assertions.assertTrue(set.contains("Budi"));
        Assertions.assertFalse(set.contains("Ardi"));
    }

    @Test
    void testSize() {
        Set set = new Set();
        Assertions.assertEquals(0, set.size());

        set.add("Eko");
        Assertions.assertEquals(1, set.size());
        set.add("Eko");
        Assertions.assertEquals(1, set.size());

        set.add("Kurniawan");
        set.add("Lisa");
        Assertions.assertEquals(3, set.size());

        set.remove("Lisa");
        Assertions.assertEquals(2, set.size());
    }

    @Test
    void testGrowth() {
        Set set = new Set();
        for (int i = 0; i < 100; i++) {
            set.add(i + "");
        }
        Assertions.assertEquals(100, set.size());
    }

    public static class Set {

        String[] array = new String[10];
        private int size = 0;

        public boolean add(String value) {
            if (contains(value)) {
                return false;
            } else {
                ensureCapacity();
                array[size] = value;
                size++;
                return true;
            }
        }

        private void ensureCapacity() {
            if (size >= array.length) {
                String[] temp = new String[array.length * 2];
                for (int i = 0; i < size; i++) {
                    temp[i] = array[i];
                }
                array = temp;
            }
        }

        public boolean contains(String value) {
            for (String item : array) {
                if (value.equals(item)) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return size;
        }

        private int indexOf(String value) {
            for (int i = 0; i < size; i++) {
                if (value.equals(array[i])) {
                    return i;
                }
            }
            return -1;
        }

        public boolean remove(String value) {
            if (contains(value)) {
                int indexRemoved = indexOf(value);
                for (int i = indexRemoved; i <= size; i++) {
                    array[i] = array[i + 1];
                }
                size--;
                return true;
            } else {
                return false;
            }
        }
    }
}
