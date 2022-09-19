package core.java.prep;

public class CopyAllElementOfArray {
    public static void main(String[] args) {
        String [] Arr = new String[]{"a","b","c"};

        String ar[] = new String[Arr.length];

        for (int i=0;i<Arr.length;i++){

            ar[i] = Arr[i];
        }
        for (int i=0;i< Arr.length;i++){
            System.out.println(Arr[i]);
        }

        System.out.println();

        for (int j=0;j<ar.length;j++){
            System.out.println(ar[j]);
        }
    }
}
