
//import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class GameXO {

    Scanner input = new Scanner(System.in);
    String Username;
    String newUserName;

    String[][] board = {
            { "   ", "|", "   ", "|", "   " }, //
            { "---", "+", "---", "+", "---" },
            { "   ", "|", "   ", "|", "   " },
            { "---", "+", "---", "+", "---" },
            { "   ", "|", "   ", "|", "   " }
    };

    public GameXO() {
        System.out.println("XO oyununua xosh gelmisiniz!!!");
        System.out.print("Adinizi daxil edin: ");
        Username = input.nextLine();

        Clear();

        Menu();

    }

    static void Clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void Menu() {
        System.out.println(Username + " Xosh Gelmisiniz!!!");
        System.out.println("\tMenu:");
        System.out.println("\n1) - Start \n2) - Adinizi deyishin \n3) - Exit");
        System.out.print("\nMenu Sechin: ");
        int menu = input.nextInt();
        SelectMenu(menu); // niye burda (menu) yaziriq ve select menyunu niye yuxarida cagirmadiq?
    }

    public void SelectMenu(int menu) { // niye int menu yazdiq moterizede?
        switch (menu) {
            case 1:
                Clear();
                System.out.println("\nStart");
                CreateBoard();
                break;
            case 2:
                Clear();
                NameChange();
                break;

            default:
                Exit();
                break;
        }
    }

    public void Exit() {
        Clear();
        System.out.println("Oyundan cixmaga eminsinizmi? Eger eminsinizse butun informasiyalariniz silinecek");
        System.out.print("Yes or No? ");
        String yn = input.next();
        if (!yn.equals("Yes")) { // niye == "no" olanda ishlemir?
            Clear();
            Menu();
        } else {
            System.out.print("Exit");
        }
        // return; //void-de return olar?
    }

    public void NameChange() {
        System.out.print("Adinizi Deyishin: ");
        //input.nextLine();
        String newUSerName;
        newUSerName = input.nextLine();
        // if (Username != newUserName){
        System.out.println("Adinizi ugurla deyishdiniz: " + newUSerName);
        // }
    }

    public void CreateBoard() {

        System.out.println("\n***************");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        System.out.println("***************");

    }
}