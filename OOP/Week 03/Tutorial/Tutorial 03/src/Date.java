public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        while (true) {
            if (day <= 31 && day >= 1) {
                this.day = day;
                break;
            }
            System.out.println("Please enter a day from 1 to 31");
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

//    public void setDate(int day, int month, int year) {
//        this.day = day;
//    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getDate() {
        return String.format("%02d/%02d/%04d",day, month, year);
    }

    @Override
    public String toString() {
        return "Date [day = " + this.day + ", month = " + this.month + ", year = " + this.year + "]";
    }
}
