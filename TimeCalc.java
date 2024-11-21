public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours*60) + minutes + minutesToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;


        int newMinutes = totalMinutes- (totalHours*60);

        String newTime="";

        if(newHours == 24) newTime = "00:";
        else if(newHours <10) newTime = "0"+newHours+":";
        else newTime = newHours+":";

        if(newMinutes <10) newTime += "0"+newMinutes;
        else newTime += newMinutes;

	System.out.println(newTime);

    }
}