// Урок 2. Структуры данных. Массивы. Алгоритмы массивов.
// Реализовать алгоритм пирамидальной сортировки (HeapSort).

public class HW_task_1 {
    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < size && arr[left] > arr[i]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, size);
        }
    }

    public static int delp(int[] arr, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = arr[0];
        arr[0] = arr[size - 1];
        heapify(arr, 0, size - 1);
        return top;
    }

    public static void heapsort(int[] arr) {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arr, i--, n);
        }

        while (n > 0) {
            arr[n - 1] = delp(arr, n);
            n--;
        }
    }

    public static void main(String[] args) {
        int[] listNum = new int[] { 23, 0, 5, 12, 6, 18, 11, 15, 3, -2 };
        System.out.print("\n\tИсходный массив: ");
        for (int el : listNum)
            System.out.printf("%d ", el);
        heapsort(listNum);
        System.out.print("\n Отсортированный массив: ");
        for (int el : listNum)
            System.out.printf("%d ", el);
    }
}
/*       Исходный массив: 23 0 5 12 6 18 11 15 3 -2 
Отсортированный массив: -2 0 3 5 6 11 12 15 18 23  */