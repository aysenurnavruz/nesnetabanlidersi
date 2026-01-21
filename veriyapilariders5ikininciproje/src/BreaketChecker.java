public class BreaketChecker {
    private String input;

    public BreaketChecker(String in) {
        input = in;

    }

    public void check() {
        int stackSize = input.length();
        Stack thestack = new Stack(stackSize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    thestack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!thestack.isEmpty()) ;
                    char poped = thestack.pop();
                    if (ch == '}' && poped != '{' || ch == ']' && poped != '[' || ch == ')' && poped != '(') {
                        System.out.println("Hata" + ch + "indis" + i);

                    } else
                        System.out.println("Hata " + ch + " indis " + i);
                    break;
            }

        }
        if (thestack.isEmpty())
            System.out.println("Hata :sağ parentez eksik");
    }

}