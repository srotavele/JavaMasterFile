import java.util.Date;

public class AlfredQuotes {
    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }
    public String guestGreeting(String name, String dayPeriod) {
        String space = " ";
        return "Good"  + " " + dayPeriod + space + "," + name + ". Wonderful to see you!";
    }
    public String dateAnnouncement() {
        Date date = new Date();
        return "So you know, today's date is :" + date;
    }
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "Alexis wouldn't know lo-fi from a meatball. Allow me to spin something up, Sir.";
        } else if (conversation.indexOf("Alfred") >= 0) {
            return "Of course I know where it is, Sir. It's in the freezer next to the squirrel meat";
        }else {
            return "And on that note, I'll leave you to your TV dinner and box wine, Sir.";
        }

    }
}

