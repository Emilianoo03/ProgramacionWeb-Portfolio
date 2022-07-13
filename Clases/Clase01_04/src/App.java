public class App {

    public static void main(String[] args) throws Exception {
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " - ");
            }
        }

        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        System.out.println("\n Numero maximo : " + max 
                + "  - En el index: " + index);


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " - ");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        double promedio = (double) sum / array.length;

        System.out.println( "\n Promedio: " + promedio);


        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.print("\n Array invertido: " );
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + " - ");
            }
        }

    }
}
