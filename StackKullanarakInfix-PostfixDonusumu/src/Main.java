import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String input;
            while (true){
                System.out.print("Infix Notasyonunda Bir Formül Giriniz:");
                input = getString();
                if(input.equals(""))
                    break;
                InfixToPostfix thePostFix = new InfixToPostfix(input);
                thePostFix.convertToPostfix();
                System.out.println("Postfix Notasyonu: "+thePostFix.postfix);
            }
        }
        public  static String getString(){
            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            return s;
        }
    }
