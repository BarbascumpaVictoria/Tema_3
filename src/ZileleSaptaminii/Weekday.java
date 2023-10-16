package ZileleSaptaminii.src;

public enum Weekday {
    MONDAY(true), TUESDAY(true),  WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);

    boolean isWeekday;

    private Weekday(boolean weekday){
        isWeekday = weekday;
    }
    public boolean isHoliday() {
        return !isWeekday;
    }
    //  public boolean isWeekDay() {
    //   return isWeekday;
    // }
}