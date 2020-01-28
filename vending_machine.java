import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.*;

public class vending_machine {

    public static void main(String[] ags) {

        DecimalFormat df = new DecimalFormat("$.00");
        //Creates a decimal format variable called df. Assigns df to two decimal places and dollar sign in the front.

        //2d array that stores beverage names.
        String[][] drinks = new String[][]{{"Water", "Coke", "Coke Diet"},
                                           {"Root Beer", "Sprite", "Fanta"},
                                           {"Nestea", "Pepsi", "Red Bull"}};

        //2d array that stores price of each drink.
        double[][] price = new double[][]{{1, 3, 2},
                                          {4, 2, 4},
                                          {3, 4, 6}};

        //Constants for MIN and MAX of vending menu. final is used so they cannot be changed. This will be used in the method isValidVendingMenu
        final int MIN_MENU = 0;
        final int MAX_MENU = 9;

        String machine = "";
        //Creates string variable called machine, used to store the 3X3 grid for vending machine.
        int num = 1;
        //Creates int variable called num, used to number of each drink. First beverage is number 1.
        boolean order = true;
        //Creates boolean variable called order.
        boolean done = true;
        //Creates boolean variable called done.
        double change = 0;
        //Creates double variable called change.
        int bev = -1;
        //Creates int variable called bev.
        String total = "";
        //Creates string variable called total.
        double p_total = 0;
        //Creates double variable called p_total.


        //This for-loop is used to create the 3X3 grid which displays beverage number, name, and price.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                machine = machine + num + ") " + drinks[i][j] + "\t";
                //Takes element from drinks array and adds a number in front of it. E.g. 1) Water
                num++;
                //num variable increases by one each time. E.g. 2) Coke.
            }
            machine = machine + "\n";

            for (int q = 0; q < 3; q++) {
                machine = machine + (df.format(price[i][q])) + "\t";
                //Takes machine variable, adds it's corresponding element from price array, uses decimal format.
            }
            machine = machine + "\n\n";
        }


        JTextArea vendingMenuText = new JTextArea(machine + "\nChoose your beverage:\t\tEnter 0 to View Cart");
        //Creates new JTextArea called vendingMenuText, will later be used to display vending machine menu text.
        vendingMenuText.setEditable(false);
        //Set text in vendingMenuText to not editable so user cannot change letters/numbers being displayed in the vending machine.


        while (order == true && shouldAddItem(total)) {
            //Loops the ordering process until user no longer wishes to order/add item to cart.

            String userInput = JOptionPane.showInputDialog(null, vendingMenuText, "VENDING MACHINE", JOptionPane.QUESTION_MESSAGE);
            //Displays vendingMenuText. Captures the user's input into a variable called userInput.

            //Checks if user input is valid.
            if (userInput != null) {
                //if userInput not empty.
                if (!isValidVendingMenu(userInput, MIN_MENU, MAX_MENU)) {
                    bev = -1;
                    //If user input is not 1-9, bev set to -1.
                } else {
                    bev = Integer.parseInt(userInput);
                    //Parses userInput from String and returns it as an integer. bev is then set to this number.
                }
            } else {
                //If cancel button is clicked, userInput == null
                bev = -1;
                //bev set to -1.
                System.out.println("Program exit");
                System.exit(0);
                //exits program.
            }


            if (bev == 0) {
                //if user enters 0.
                order = false;
                //order set to false, ordering process will end and program will enter payment screen.


            } else if (bev == 1) {
                //if user's number entered is 1.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[0][0] + " " + (df.format(price[0][0])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[0][0];
                    //Adds price of that beverage to total price.
                    total = total + drinks[0][0] + "\t" + (df.format(price[0][0])) + "\n";
                    //Adds beverage name and price to total order.

                }


            } else if (bev == 2) {
                //if user's number entered is 2.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[0][1] + " " + (df.format(price[0][1])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[0][1];
                    //Adds price of that beverage to total price.
                    total = total + drinks[0][1] + "\t" + (df.format(price[0][1])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 3) {
                //if user's number entered is 3.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[0][2] + " " + (df.format(price[0][2])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[0][2];
                    //Adds price of that beverage to total price.
                    total = total + drinks[0][2] + "\t" + (df.format(price[0][2])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 4) {
                //if user's number entered is 4.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[1][0] + " " + (df.format(price[1][0])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[1][0];
                    //Adds price of that beverage to total price.
                    total = total + drinks[1][0] + "\t" + (df.format(price[1][0])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 5) {
                //if user's number entered is 5.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[1][1] + " " + (df.format(price[1][1])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[1][1];
                    //Adds price of that beverage to total price.
                    total = total + drinks[1][1] + "\t" + (df.format(price[1][1])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 6) {
                //if user's number entered is 6.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[1][2] + " " + (df.format(price[1][2])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[1][2];
                    //Adds price of that beverage to total price.
                    total = total + drinks[1][2] + "\t" + (df.format(price[1][2])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 7) {
                //if user's number entered is 7.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[2][0] + " " + (df.format(price[2][0])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[2][0];
                    //Adds price of that beverage to total price.
                    total = total + drinks[2][0] + "\t" + (df.format(price[2][0])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 8) {
                //if user's number entered is 8.
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[2][1] + " " + (df.format(price[2][1])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[2][1];
                    //Adds price of that beverage to total price.
                    total = total + drinks[2][1] + "\t" + (df.format(price[2][1])) + "\n";
                    //Adds beverage name and price to total order.
                }


            } else if (bev == 9) {
                //if user's number entered is 9
                int option = JOptionPane.showConfirmDialog(null, "Add " + drinks[2][2] + " " + (df.format(price[2][2])) + " to order?", "Order", JOptionPane.YES_NO_OPTION);
                //Prompts user if they would like to add that beverage with price to their cart.
                if (option == JOptionPane.YES_OPTION) {
                    //If yes.
                    p_total = p_total + price[2][2];
                    //Adds price of that beverage to total price.
                    total = total + drinks[2][2] + "\t" + (df.format(price[2][2])) + "\n";
                    //Adds beverage name and price to total order.
                }
            }
        }


        JTextArea paymentText = new JTextArea(total + "\nTotal:\t" + (df.format(p_total)) + "\n\nInsert Money");
        //Creates new JTextArea called paymentText, will later be used to display total order, price, and prompt user to insert money.
        paymentText.setEditable(false);
        //Sets text in paymentText to not editable so user cannot change letters/numbers being displayed.


        //Payment process.
        do {
            try {
                double money = Double.parseDouble((String) JOptionPane.showInputDialog(null, paymentText, "Payment", JOptionPane.QUESTION_MESSAGE));
                //Displays paymentText. Captures the user's input into a variable called money.

                if (money >= p_total) {
                    //If amount of money user entered is greater than total price.
                    change = money - p_total;
                    //Subtract and save as in the change variable.

                    JTextArea receiptText = new JTextArea("THANK YOU\n\n" + total + "\nTotal:\t" + df.format(p_total) + "\n\nYour change is " + df.format(change));
                    //Creates new JTextArea called receiptText, will later be used to display thank you message, total order, total order price, and change.     
                    receiptText.setEditable(false);
                    //Sets text in receiptText to not editable so user cannot change letters/numbers being displayed.
                    JOptionPane.showMessageDialog(null, receiptText, "Receipt", JOptionPane.INFORMATION_MESSAGE);
                    //Displays receiptText. 

                    done = false;
                    //changes boolean done to false.
                    System.out.println("Program exit");
                } else {
                    //else (amount of money user entered is less than total price).
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    //Displays INSUFFICIENT FUNDS message.
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please input a valid number");
                //Catch if user does not input a number for payment.
            }
        } while (done == true);
        //Executes the whole payment process and then checks done boolean.
    }


    //Method called isValidVendingMenu. Method type is boolean. Argument types are String and int. Argument variables are userInput, minMenu, MaxMenu.
    //Argument is any extra data that the method needs to work, this method needs userInput, minMenu, and maxMenu.
    //Return is either true of false.
    private static boolean isValidVendingMenu(String userInput, int minMenu, int maxMenu) {
        int menu = -1;
        String message = "Please input a valid selection: " + minMenu + " to " + maxMenu;
        //Prompts user to enter a valid number min to max.


        //Checks if the user's input can be converted to int.
        try {
            menu = Integer.parseInt(userInput);
        } catch (java.lang.NumberFormatException e) {
            //If it can't.
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            //Displays error message.
            return false;
        }

        //Check if the menu within min and max (1-9).
        if (!(menu >= minMenu && menu <= maxMenu)) {
            //If not.
            JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
            //Displays error message.
            return false;
        }

        return true;
        //Otherwise, return true (meaning user's input is a number and is also within 1-9).
    }


    //Method called shouldAddItem. Method type is boolean. Argument type is String. Argument variable is total. Method used to see if user would like to add another beverage to order.
    //Argument is any extra data that the method needs to work, this method needs total.
    //Return is either true or false.
    private static boolean shouldAddItem(String total) {
        if (total.equals("")) {
            //If total order is blank/empty.
            return true;
        } else {
            int value = JOptionPane.showConfirmDialog(null, "Do you want to add another beverage?", "Confirmation", JOptionPane.YES_NO_OPTION);
            //Prompts user if they would like to add another beverage.

            if (value == JOptionPane.YES_OPTION) {
                //If yes.
                return true;
            }
            return false;
            //Otherwise, return false (meaning total order is not blank/empty and YES_OPTION has not been clicked).
        }
    }

}