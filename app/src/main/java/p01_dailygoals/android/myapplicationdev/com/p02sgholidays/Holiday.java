package p01_dailygoals.android.myapplicationdev.com.p02sgholidays;

/**
 * Created by 15039836 on 25/4/2017.
 */

public class Holiday {

    private String name;
    private String date;
    private boolean type;
    private int symbol;
    public Holiday(String name, String date, boolean type, int symbol) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.symbol = symbol;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public int getSym() {
        return symbol;
    }
    public boolean isSecular() {
        return type;
    }
}
