package pip6;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] arr = randomArray(10);
        showArray(arr);

        //2
        int[] sorted = sortArray(arr);
        showArray(sorted);

        //3
        int[] reversed = reverseArray(arr);
        showArray(reversed);

        //4
        System.out.println(isReversed(sorted, reversed));
    }

    static boolean isReversed(int[] a, int[] b) {
        if(a.length != b.length) return false;
        else {
            for(int i = 0 ; i < a.length; i++) {
                if(a[i] != b[a.length - 1 - i]) return false;
            }
        }
        return true;
    }

    static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }

        return reversed;
    }

    static int[] sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int proxy = arr[j];
                    arr[j] = arr[i];
                    arr[i] = proxy;
                }
            }
        }
        return arr;
    }

    static int[] randomArray(int n) {
        int[] array = new int[n];
        int rand;

        for(int i = 0 ; i < array.length; i++) {
            rand = (int) (Math.random() * 101);
            array[i] = rand;
        }

        return array;
    }

    static void showArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}