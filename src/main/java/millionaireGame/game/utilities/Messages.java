package millionaireGame.game.utilities;

public class Messages {

    public static void welcome() {
//        System.out.println("==========================================================");
//        System.out.println("|  Hello! Welcome to Who Wants to Become a Millionaire!  |");
//        System.out.println("==========================================================");
//        System.out.println("\n");

        System.out.println("                    _    _  _                                       _            _             _                                                  \n" +
                "                   | |  | || |                                     | |          | |           | |                                                 \n" +
                "                   | |  | || |__    ___     __      __ __ _  _ __  | |_  ___    | |_  ___     | |__    ___   ___  ___   _ __ ___    ___      __ _ \n" +
                "                   | |/\\| || '_ \\  / _ \\    \\ \\ /\\ / // _` || '_ \\ | __|/ __|   | __|/ _ \\    | '_ \\  / _ \\ / __|/ _ \\ | '_ ` _ \\  / _ \\    / _` |\n" +
                "                   \\  /\\  /| | | || (_) |    \\ V  V /| (_| || | | || |_ \\__ \\   | |_| (_) |   | |_) ||  __/| (__| (_) || | | | | ||  __/   | (_| |\n" +
                "                    \\/  \\/ |_| |_| \\___/      \\_/\\_/  \\__,_||_| |_| \\__||___/    \\__|\\___/    |_.__/  \\___| \\___|\\___/ |_| |_| |_| \\___|    \\__,_|\n" +
                "                                                                                                                                                  \n" +
                "                                                                                                                                                  \n" +
                "                                                                 _  _  _  _                       _                                               \n" +
                "                                                                (_)| || |(_)                     (_)                                              \n" +
                "                                                      _ __ ___   _ | || | _   ___   _ __    __ _  _  _ __  ___                                    \n" +
                "                                                     | '_ ` _ \\ | || || || | / _ \\ | '_ \\  / _` || || '__|/ _ \\                                   \n" +
                "                                                     | | | | | || || || || || (_) || | | || (_| || || |  |  __/                                   \n" +
                "                                                     |_| |_| |_||_||_||_||_| \\___/ |_| |_| \\__,_||_||_|   \\___|                                   \n" +
                "                                                                                                                                                  \n" +
                "                                                                                                                                                  ");
        System.out.println("\n\n");
    }


    public static void getRules(){
        System.out.println("=== Rules ===");
        System.out.println("\n1. Answer the questions correctly to earn money.");
        System.out.println("2. The game is divided in 4 sets of questions: easy, medium, hard and very hard (the 1,000,000€ " +
                "question)!");
        System.out.println("3. You can get two possible answers (the correct one and a random answer) typing " +
                "\"50\" in the console! You can only use this option once per set!");
        System.out.println("4. You can't use 50 50 method on 1,000,000€ question!");
        System.out.println("5. If you don't know the answer to a question you can leave with the money on your last checkpoint " +
                "by typing \"retreat\". \nEvery set of questions has one checkpoint, at the very first start.");
        System.out.println("6. If you answer a question wrong you will lose all of your money!");
        System.out.println("7. At the end of the game you can choose to play again by typing yes.");

        System.out.println("\nGood luck!");
    }

    public static void youAreAMillionaire() {

        System.out.println("   ___                            _         _       _   _                     _ \n" +
                "  / __\\___  _ __   __ _ _ __ __ _| |_ _   _| | __ _| |_(_) ___  _ __  ___    / \\\n" +
                " / /  / _ \\| '_ \\ / _` | '__/ _` | __| | | | |/ _` | __| |/ _ \\| '_ \\/ __|  /  /\n" +
                "/ /__| (_) | | | | (_| | | | (_| | |_| |_| | | (_| | |_| | (_) | | | \\__ \\ /\\_/ \n" +
                "\\____/\\___/|_| |_|\\__, |_|  \\__,_|\\__|\\__,_|_|\\__,_|\\__|_|\\___/|_| |_|___/ \\/   \n" +
                "                  |___/                                                         ");


        System.out.println("                                                                    _  _  _  _                       _                 _    _ \n" +
                " _   _   ___   _   _      __ _  _ __   ___      __ _     _ __ ___  (_)| || |(_)  ___   _ __    __ _ (_) _ __   ___    / \\  / \\\n" +
                "| | | | / _ \\ | | | |    / _` || '__| / _ \\    / _` |   | '_ ` _ \\ | || || || | / _ \\ | '_ \\  / _` || || '__| / _ \\  /  / /  /\n" +
                "| |_| || (_) || |_| |   | (_| || |   |  __/   | (_| |   | | | | | || || || || || (_) || | | || (_| || || |   |  __/ /\\_/ /\\_/ \n" +
                " \\__, | \\___/  \\__,_|    \\__,_||_|    \\___|    \\__,_|   |_| |_| |_||_||_||_||_| \\___/ |_| |_| \\__,_||_||_|    \\___| \\/   \\/   \n" +
                " |___/                                                                                                                        ");
    }
}
