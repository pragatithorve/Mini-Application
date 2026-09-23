import java.util.*;

public class theatre {

    static int Silver_price = 150;
    static int platinum_price = 200;
    static int gold_price = 250;

    // =========================================================
    // SCREEN
    // =========================================================

    public static void screen() {

        System.out.println();
        System.out.println();
        System.out.println("                   ===================================================");
        System.out.println("                   |                     SCREEN                      |");
        System.out.println("                   ===================================================");
        System.out.println();
        System.out.println();
    }

    // =========================================================
    // SILVER
    // =========================================================

    public static class silver {

        static String silver[][] = {
                new String[4],
                new String[4],
                new String[4]
        };

        // Assign seat numbers
        public static void assign() {

            int seatNumber = 1;

            for (int i = 0; i < silver.length; i++) {

                for (int j = 0; j < silver[i].length; j++) {

                    silver[i][j] = "S" + seatNumber;

                    seatNumber++;
                }
            }
        }

        // Book seat
        public static boolean bookSeat(String seat) {

            for (int i = 0; i < silver.length; i++) {

                for (int j = 0; j < silver[i].length; j++) {

                    if (silver[i][j].equals(seat)) {

                        silver[i][j] = "X";

                        return true;
                    }
                }
            }

            return false;
        }
    }

    // =========================================================
    // PLATINUM
    // =========================================================

    public static class platinum {

        static String platinum[][] = {
                new String[6],
                new String[6],
                new String[6],
                new String[6]
        };

        // Assign seat numbers
        public static void assign() {

            int seatNumber = 1;

            for (int i = 0; i < platinum.length; i++) {

                for (int j = 0; j < platinum[i].length; j++) {

                    platinum[i][j] = "P" + seatNumber;

                    seatNumber++;
                }
            }
        }

        // Book seat
        public static boolean bookSeat(String seat) {

            for (int i = 0; i < platinum.length; i++) {

                for (int j = 0; j < platinum[i].length; j++) {

                    if (platinum[i][j].equals(seat)) {

                        platinum[i][j] = "X";

                        return true;
                    }
                }
            }

            return false;
        }
    }

    // =========================================================
    // GOLD
    // =========================================================

    public static class gold {

        static String gold[][] = {
                new String[8],
                new String[8]
        };

        // Assign seat numbers
        public static void assign() {

            int seatNumber = 1;

            for (int i = 0; i < gold.length; i++) {

                for (int j = 0; j < gold[i].length; j++) {

                    gold[i][j] = "G" + seatNumber;

                    seatNumber++;
                }
            }
        }

        // Book seat
        public static boolean bookSeat(String seat) {

            for (int i = 0; i < gold.length; i++) {

                for (int j = 0; j < gold[i].length; j++) {

                    if (gold[i][j].equals(seat)) {

                        gold[i][j] = "X";

                        return true;
                    }
                }
            }

            return false;
        }
    }

    // =========================================================
    // SHOW COMPLETE THEATRE
    // =========================================================

    public static void showTheatre() {

        screen();

        // -----------------------------------------------------
        // SILVER
        // -----------------------------------------------------

        System.out.println("                      -----------------  SILVER  ----------------");
        System.out.println();

        for (int i = 0; i < silver.silver.length; i++) {

            System.out.print("                         |");

            for (int j = 0; j < silver.silver[i].length; j++) {

                System.out.printf(" %-5s |", silver.silver[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        // -----------------------------------------------------
        // PLATINUM
        // -----------------------------------------------------

        System.out.println("                    -----------------  PLATINUM  ----------------");
        System.out.println();

        for (int i = 0; i < platinum.platinum.length; i++) {

            System.out.print("                    |");

            for (int j = 0; j < platinum.platinum[i].length; j++) {

                System.out.printf(" %-5s |", platinum.platinum[i][j]);
            }

            System.out.println();
        }

        System.out.println();

        // -----------------------------------------------------
        // GOLD
        // -----------------------------------------------------

        System.out.println("                      -----------------  GOLD  ----------------");
        System.out.println();

        for (int i = 0; i < gold.gold.length; i++) {

            System.out.print("              |");

            for (int j = 0; j < gold.gold[i].length; j++) {

                System.out.printf(" %-5s |", gold.gold[i][j]);
            }

            System.out.println();
        }

        System.out.println();
    }

    // =========================================================
    // MAIN
    // =========================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =====================================================
        // INITIALIZE ALL SEATS
        // =====================================================

        silver.assign();
        platinum.assign();
        gold.assign();

        // =====================================================
        // BOOKING LOOP
        // =====================================================

        while (true) {

            // =================================================
            // MOVIE
            // =================================================

            System.out.println();
            System.out.println("===================================================");
            System.out.println("                    MOVIE LIST");
            System.out.println("===================================================");

            System.out.println("1. Pushpa 2");
            System.out.println("2. Avatar 3");
            System.out.println("3. Avengers");

            System.out.println();

            System.out.print("Enter Movie : ");
            int movieChoice = sc.nextInt();

            String movieName = "";

            switch (movieChoice) {

                case 1:

                    movieName = "Pushpa 2";

                    break;

                case 2:

                    movieName = "Avatar 3";

                    break;

                case 3:

                    movieName = "Avengers";

                    break;

                default:

                    System.out.println("Invalid Movie!");

                    continue;
            }

            // =================================================
            // SHOW TIME
            // =================================================

            System.out.println();
            System.out.println("===================================================");
            System.out.println("                    SHOW TIME");
            System.out.println("===================================================");

            System.out.println("1. 10:00 AM");
            System.out.println("2. 02:00 PM");
            System.out.println("3. 06:00 PM");
            System.out.println("4. 09:00 PM");

            System.out.println();

            System.out.print("Enter Show Time : ");
            int timeChoice = sc.nextInt();

            String showTime = "";

            switch (timeChoice) {

                case 1:

                    showTime = "10:00 AM";

                    break;

                case 2:

                    showTime = "02:00 PM";

                    break;

                case 3:

                    showTime = "06:00 PM";

                    break;

                case 4:

                    showTime = "09:00 PM";

                    break;

                default:

                    System.out.println("Invalid Show Time!");

                    continue;
            }

            // =================================================
            // SHOW THEATRE
            // =================================================

            System.out.println();

            System.out.println("===================================================");
            System.out.println("                 AVAILABLE SEATS");
            System.out.println("===================================================");

            showTheatre();

            // =================================================
            // TICKET BOOKING
            // =================================================

            System.out.println("===================================================");
            System.out.println("                  TICKET BOOKING");
            System.out.println("===================================================");

            System.out.println();

            System.out.println("1. Silver   - Rs." + Silver_price);
            System.out.println("2. Platinum - Rs." + platinum_price);
            System.out.println("3. Gold     - Rs." + gold_price);

            System.out.println();

            System.out.print("Enter Category : ");
            int category = sc.nextInt();

            System.out.print("How many seats do you want to book : ");
            int numberOfSeats = sc.nextInt();

            sc.nextLine();

            // =================================================
            // BOOKED SEATS
            // =================================================

            String bookedSeats[] = new String[numberOfSeats];

            String categoryName = "";

            int price = 0;

            // =================================================
            // CATEGORY
            // =================================================

            switch (category) {

                // ------------------------------------------------
                // SILVER
                // ------------------------------------------------

                case 1:

                    categoryName = "Silver";

                    price = Silver_price;

                    for (int i = 0; i < numberOfSeats; i++) {

                        System.out.print("Enter Silver seat : ");

                        String seat = sc.nextLine().toUpperCase();

                        if (silver.bookSeat(seat)) {

                            bookedSeats[i] = seat;

                            System.out.println("Seat " + seat + " booked!");

                        }

                        else {

                            System.out.println("Invalid or already booked!");

                            i--;
                        }
                    }

                    break;

                // ------------------------------------------------
                // PLATINUM
                // ------------------------------------------------

                case 2:

                    categoryName = "Platinum";

                    price = platinum_price;

                    for (int i = 0; i < numberOfSeats; i++) {

                        System.out.print("Enter Platinum seat : ");

                        String seat = sc.nextLine().toUpperCase();

                        if (platinum.bookSeat(seat)) {

                            bookedSeats[i] = seat;

                            System.out.println("Seat " + seat + " booked!");

                        }

                        else {

                            System.out.println("Invalid or already booked!");

                            i--;
                        }
                    }

                    break;

                // ------------------------------------------------
                // GOLD
                // ------------------------------------------------

                case 3:

                    categoryName = "Gold";

                    price = gold_price;

                    for (int i = 0; i < numberOfSeats; i++) {

                        System.out.print("Enter Gold seat : ");

                        String seat = sc.nextLine().toUpperCase();

                        if (gold.bookSeat(seat)) {

                            bookedSeats[i] = seat;

                            System.out.println("Seat " + seat + " booked!");

                        }

                        else {

                            System.out.println("Invalid or already booked!");

                            i--;
                        }
                    }

                    break;

                // ------------------------------------------------
                // INVALID CATEGORY
                // ------------------------------------------------

                default:

                    System.out.println("Invalid Category!");

                    continue;
            }

            // =================================================
            // TOTAL BILL
            // =================================================

            int totalAmount = price * numberOfSeats;

            // =================================================
            // BILL
            // =================================================

            System.out.println();
            System.out.println();
            System.out.println("===================================================");
            System.out.println("                     BILL");
            System.out.println("===================================================");

            System.out.println("Movie          : " + movieName);

            System.out.println("Show Time      : " + showTime);

            System.out.println("Category       : " + categoryName);

            System.out.print("Seats Booked   : ");

            for (int i = 0; i < numberOfSeats; i++) {

                System.out.print(bookedSeats[i]);

                if (i < numberOfSeats - 1) {

                    System.out.print(", ");
                }
            }

            System.out.println();

            System.out.println("Number of Seats: " + numberOfSeats);

            System.out.println("Price / Seat   : Rs." + price);

            System.out.println("---------------------------------------------------");

            System.out.println("TOTAL AMOUNT   : Rs." + totalAmount);

            System.out.println("===================================================");

            // =================================================
            // BOOKING SUCCESS
            // =================================================

            System.out.println();

            System.out.println("        TICKET BOOKED SUCCESSFULLY!");

            System.out.println("        Thank You! Enjoy Your Movie");

            // =================================================
            // UPDATED THEATRE
            // =================================================

            System.out.println();

            System.out.println("===================================================");
            System.out.println("              UPDATED THEATRE SEATS");
            System.out.println("===================================================");

            showTheatre();

            // =================================================
            // ANOTHER BOOKING
            // =================================================

            System.out.print("Do you want to book another ticket? (yes/no): ");

            String again = sc.nextLine();

            if (again.equalsIgnoreCase("no")) {

                System.out.println();

                System.out.println("===================================================");
                System.out.println("             THANK YOU! VISIT AGAIN");
                System.out.println("===================================================");

                break;
            }
        }

        sc.close();
    }
}
