package NullyTest;

public class Ooooo {
    public static void main(String[] args) {
        char[] arr = new char[] {'O','o','o','o','o'};
        char ch = 'o';
        while(true) {
            for(int i = 0, k = i + 1; i < arr.length - 1; i++, k++) {
                for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
                ch = arr[i];
                arr[i] = arr[k];
                arr[k] = ch;
            }
            for(int i = arr.length - 1, k = arr.length - 2; i > 0; i--, k--) {
                for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
                ch = arr[i];
                arr[i] = arr[k];
                arr[k] = ch;
            }

        }
    }
}
