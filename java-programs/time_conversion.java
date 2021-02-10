/*
* This program converts a time in 12hours format to 24hours format
* @author NAYAK
* */




import java.util.Scanner;

class time_conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in format: \n HH:MM:SSAM/PM");
        String a = sc.nextLine();
        System.out.println("In 24hrs scale "+a+ " is:");
        System.out.println(timeconversion(a));

        sc.close();
    }

    /*LOGIC of method:-
    * Take the time in string format
    * If Its 9th character is 'P' then its PM
    *   for PM time if its 12'o clock then the hour is 00
    *   if not then add 12 to the hour and then return everything it without PM
    * IF not then return as it is
    * */
    static String timeconversion(String time){
        // tportion is the string without AM or PM
        String tportion =  time.substring(0, 8);
        // Array of string without ':'
        String[] times = tportion.split(":");

        if(time.charAt(8)=='P'){
           if(times[0].equals("12")){
               times[0] = "00";
           }
           else {
               times[0] = String.valueOf(Integer.parseInt(times[0]) + 12);
           }
            return times[0] + ":" + times[1] + ":" + times[2] + " Hours";
        }
        return times[0] + ":" + times[1] + ":" + times[2] + " Hours";
    }
}