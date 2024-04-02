public class soal3{
    public static void main(String[] args) {
        int[] angka ={1,2,10,12};

        int total =0;
        int i;
        for (i = 0; i < angka.length; i++){
            total += angka[i];
        }

        double rata = (double) total/ angka.length;

        System.out.printf("Rata-rata = "+ rata);

    }
}
