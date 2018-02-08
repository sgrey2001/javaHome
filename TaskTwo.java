class TaskTwo {

    final int year = 1000;
    final int month = 12;
    final int day = 30;
    final int hours = 24;
    final int min = 60;
    final int sec = 60;
    final int milisec = 1000;

    public  void parseString(long number) {

        System.out.println("years = " + ( (number/milisec) / (sec*min*hours*day*month)) % year);
        System.out.println("month = " + ( (number/milisec) / (sec*min*hours*day)) % month);
        System.out.println("days = " + ( (number/milisec) / (sec*min*hours)) % day);
        System.out.println("hours = " + ( (number/milisec) / (sec*min)) %hours);
        System.out.println("minutes = " + ( (number/milisec) / min ) % min);
        System.out.println("seconds = " + (number/milisec) %sec);
        System.out.println("milisec = " + (number%milisec));

    }
}
