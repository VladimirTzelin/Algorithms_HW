//  Семинар №3. Разворот двусвязного списка
// Реализовать метод разворота связного списка.

//  Пример вывода результата:
// Сформированы значения элементов списка:  15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 
// Значения перевёрнутого списка: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 


public class Main {
    public static void main(String[] args) {


       DList list = new DList();
       for (int i = 1; i <= 15; i++) {
           list.pushFront(i);
       }
       System.out.print("Сформированы значения элементов списка: ");
       list.print();
       list.reverse();
       System.out.print("Значения перевёрнутого списка: ");
       list.print();

        
    }
}
