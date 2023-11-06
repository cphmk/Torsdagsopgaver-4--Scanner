
// Task 4

// 4.e
class Mainclient {


 public static void main(String[] args) {

// 4.f
  ArrayList<String> Actions = new ArrayList<String>();
 
    Actions.add("Start Game");
    Actions.add("Resume Game");
    Actions.add("Pause Game");
    Actions.add("End Game");

// 4.g

  GameMenu gameMenu = new GameMenu(Actions);

// 4.i
  gameMenu.displayMenu();

 }
}


