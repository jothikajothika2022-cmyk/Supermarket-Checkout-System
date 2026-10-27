public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName;
        int quantity;
        double price;
        double total = 0;

        int choice;

        do {

            System.out.println("\n===== Supermarket Checkout System =====");
            System.out.println("1. Add Item");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Item Name: ");
                    itemName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    double itemTotal = quantity * price;
                    total = total + itemTotal;

                    System.out.println("Item Added: " + itemName);
                    System.out.println("Item Total = " + itemTotal);

                    break;

                case 2:

                    double discount = 0;

                    if (total >= 1000) {
                        discount = total * 0.10;
                    } else if (total >= 500) {
                        discount = total * 0.05;
                    }

                    double finalAmount = total - discount;

                    System.out.println("\n===== BILL =====");
                    System.out.println("Total Amount: " + total);
                    System.out.println("Discount: " + discount);
                    System.out.println("Final Amount to Pay: " + finalAmount);

                    break;

                case 3:

                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}