public class P3I_CopyArray {
    public static void main(String[] args) {
        //Membuat Array
        int [] array1 = {7,4,8,1,4,1,4};
        int [] array2 = new int[3];
        System.arraycopy(array1,0,array2,0,3);
        System.out.print("Array1 : ");
        //Menampilkan Isi Array
        for (int i=0; i< array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        System.out.print("Array2 : ");
        for (int i=0; i< array2.length; i++) {
            System.out.print(array2[2]);
        }
        System.out.println();
    }
}