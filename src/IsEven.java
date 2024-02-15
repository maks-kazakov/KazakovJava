public class IsEven {
    public static void main(String[] args) {
        int[] array = new int[]{9,3,7,7,8,20};

        for (int i = 0; i < array.length; i = i + 1) {
            int c = array[i] % 2;

            if (c == 0) {
                System.out.println(array[i]);
            }
        }
    }
}