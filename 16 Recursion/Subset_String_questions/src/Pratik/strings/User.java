//package Pratik.strings;
//
//import java.util.Objects;
//import java.util.Scanner;
//import java.text.SimpleDateFormat;
//
//
//class User {
//
//    private final String name;
//    private final Long number;
//    private final int InTime;
//
//    User() {
//        name = "";
//        number = 0L;
//        InTime = 0;
//    }
//
//    User(String _name, Long _number, int _InTime) {
//        name = _name;
//        number = _number;
//        InTime = _InTime;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    Long getNumber() {
//        return number;
//    }
//
//    int InTime(){
//        return InTime;
//    }
//
//}
//
//
//public class CarParking {
//    private final int size;
//    private final User[] slots;
//    private Scanner sc;
//
//    CarParking() {
//        size = 10;
//        slots = new User[size];
//        sc = new Scanner(System.in);
//    }
//    public static void main(String[] args) {
//        //System.out.println("hii");
//        CarParking system = new CarParking();
//
//        boolean run = true;
//
//        while (run) {
//            switch (system.menu()) {
//                case 1:
//                    system.bookSlot();
//                    break;
//                case 2:
//                    system.freeSlot();
//                    break;
//                case 3:
//                    system.displaySlots();
//                    break;
//                case 4:
//                    run = false;
//                    break;
//                default:
//                    System.out.println("Invalid choice!");
//                    break;
//            }
//        }
//
//    }
//
//    private void displaySlots() {
//        for (int index = 0; index < size; index++) {
//            User currentSlot = slots[index];
//            if (currentSlot == null) {
//                System.out.printf("Slot Number: %d -> EMPTY \n", index + 1);
//            } else {
//                System.out.println("Slot Number: " + index + 1 + " -> "
//                        + "Name: " + currentSlot.getName() + " Number: "
//                        + currentSlot.getNumber());
//            }
//        }
//    }
//
//    int menu() {
//        System.out.println("Car parking system");
//        System.out.println("1.Book a slot");
//        System.out.println("2.Free a slot");
//        System.out.println("3.Display slots");
//        System.out.println("4.Exit");
//        int choice;
//        System.out.printf("Enter you choice: ");
//        choice = sc.nextInt();
//
//        return choice;
//    }
//
//    private void bookSlot() {
//        displaySlots();
//        System.out.println("Slots are available from 1 to 10");
//        String name;
//        System.out.print("Enter your name: ");
//        name = sc.next();
//        System.out.println();
//        System.out.print("Enter you number: ");
//        Long number;
//        number = sc.nextLong();
//
//        System.out.println();
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        System.out.println("enter booking time ");
//
////        int  InTime =  ();
//        System.out.print(n+":"+m);
//
//        User newUser = new User(name, number, InTime);
//
//        System.out.println("Which slot do you want ? ");
//        int slot;
//        slot = sc.nextInt();
//
//        if (slot > size || slot < 1) {
//            System.out.println("Invalid slot!");
//            return;
//        }
//
//        User currentSlot = slots[slot - 1];
//
//        if (currentSlot != null) {
//            System.out.printf("Slot with slot number %d, is already taken !", slot);
//            return;
//        }
//
//        slots[slot - 1] = newUser;
//
//        System.out.println("Car slot alloted successfully at index" + slot);
//    }
//
//    private void freeSlot() {
//        int slot;
//        System.out.println("Enter slot number: ");
//        slot = sc.nextInt();
//
//        if (slot > size || slot < 1) {
//            System.out.println("Invalid slot!");
//            return;
//        }
//
//        User currentSlot = slots[slot - 1];
//
//        if (currentSlot == null) {
//            System.out.printf("Slot with slot number %d, is already empty !", slot);
//            return;
//        }
//
//        System.out.println("Slot found with name:" + currentSlot.getName()
//                + " and number: " + currentSlot.getName());
//
//        slots[slot - 1] = null;
//    }
//}
