package package1;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import package2.Weapon;

public class Game
{

    ChoiceHandler cHandler = new ChoiceHandler();

    UI ui = new UI();
    Player player = new Player();
    VisibilityManager vm = new VisibilityManager(ui, player);
    Story story = new Story(this, ui, vm, player);

   

    
        public static void main(String[] args)
        {
            new Game();
        }

        public Game()
        {
            ui.createUI(cHandler); //Calls method to create UI
            story.defaultSetUp();
            vm.showTitleScreen(); //Displays Title.
        }


        public class ChoiceHandler implements ActionListener
        {
            public void actionPerformed(ActionEvent event )
            {
                String yourChoice = event.getActionCommand();

                switch(yourChoice)
                {
                    case "start":
                    vm.showGameScreen();
                    break;

                    case "c1":
                    break;
                    
                    case "c2":
                    break;

                    case "c3":
                    break;

                    case "inventory":
                    vm.showInventoryScreen();
                    break;

                    default:
                    break;

                  
                }
            }
        }



}