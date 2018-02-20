public class DaysOfWeekMessages {

    public static String getDaysMessage(int dayIndex){
        String message = null;
        if(dayIndex > 1 && dayIndex < 7){
            if(dayIndex == 2){
                message = "Monday. You couldn't have had it any worse";
            }else if(dayIndex > 2 && dayIndex < 7){
                message ="Tuesday, wednesday or thursday. nothing special, except for work and count down to friday.";

            }else if(dayIndex == 6){
                    message = "Freiday.TGIF";
            }
        }else {
            if(dayIndex == 1){
                message="Sunday. enjoy while it lasts, for a new Working week begins tomorrow";
            }else {
                message="Saturday.Step out, have some fun while you can.";
            }
        }
        return message ;
    }
}
