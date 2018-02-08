class TaskOne {

    public void checkString(String line) {
        int quant = 0;

        if ((line.startsWith("(")) && (line.endsWith(")"))) {
            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == '(') {
                    quant++;
                } else if (line.charAt(i) == ')') {
                    quant--;
                }
            }

            if (quant == 0) {
                System.out.println("String is correct");
            } else {
                System.out.println("String is not correct");
            }
        } else

        {
            System.out.println("String is not correct");
        }
    }
}


