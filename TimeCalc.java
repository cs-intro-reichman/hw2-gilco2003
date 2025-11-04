public class TimeCalc {
    public static void main(String[] args) {
// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd =Integer.parseInt(args[1]),totalMinutes,totalHours,newMinutes,newHours;
        totalMinutes = hours * 60 + minutes + minutesToAdd;
        totalHours = totalMinutes / 60;    
        newHours = totalHours % 24;
        newMinutes = totalMinutes - totalHours * 60;
        String newHoursStr = "" + newHours, newMinutesStr = "" + newMinutes;

        if (newMinutes < 10)
            newMinutesStr = "0" + newMinutesStr;
        if (newHours < 10)
            newHoursStr = "0" + newHoursStr;
        System.out.println(newHoursStr + ":" +  newMinutesStr);

}
}
