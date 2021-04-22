public class InsertionSort {
    void sort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            int temp = arr[i];
            System.out.println("Vị trí: "+ i+", holder: "+temp);

            int j = i-1;
            while (j>=0 && arr[j]>temp){

                arr[j+1] = arr[j];
                display(arr);
                j -=1;
            }
            arr[j + 1] = temp;
            display(arr);
        }
    }

    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,2,8,1,5,10,2,3,5,33,6};
        System.out.println("Mảng nhập: ");
        display(arr);

        InsertionSort ob = new InsertionSort();

        ob.sort(arr);

        display(arr);
    }
}
