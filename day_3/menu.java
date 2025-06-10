package day_3;
import java.util.Scanner;

class node5 {
    int data;
    node5 next;

    node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class menu {
    node5 head;
    public void insert(int data) {
        node5 newNode = new node5(data);
        if (head == null) {
            head = newNode;
        } else {
            node5 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void delete() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            head = head.next;
        }
    }
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            node5 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu list = new menu();
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}



