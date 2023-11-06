//Task 4


import java.util.ArrayList;


// 4.a
public class GameMenu {


// 4.b
        ArrayList<String> Actions = new ArrayList<String>();

// 4.c and 4.d

        GameMenu(ArrayList<String> Actions) {

            this.actions = Actions;
        }

// 4.h

        public void displayMenu() {
            for (String actions : this.actions) {
                System.out.println(this.actions);
            }
        }

}