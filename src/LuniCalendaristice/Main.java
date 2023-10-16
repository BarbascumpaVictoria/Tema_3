package LuniCalendaristice.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //varianta 1
        for (LuniCalendaristice ToateLunile: LuniCalendaristice.values())
        { System.out.println(ToateLunile.name());}                                  // tipareste toata enumerarea, Metoda values() name()




        // varianta 2
        LuniCalendaristice Ianuarie = LuniCalendaristice.IANUARIE;          //tipareste elemente separate din enumerare
        LuniCalendaristice Februarie = LuniCalendaristice.FEBRUARIE;
        LuniCalendaristice Martie = LuniCalendaristice.MARTIE;
        LuniCalendaristice Aprilie = LuniCalendaristice.APRILIE;
        LuniCalendaristice Mai = LuniCalendaristice.MAI;
        LuniCalendaristice Iunie = LuniCalendaristice.IUNIE;
        LuniCalendaristice Iulie = LuniCalendaristice.IULIE;
        LuniCalendaristice August = LuniCalendaristice.AUGUST;
        LuniCalendaristice Septembrie= LuniCalendaristice.SEPTEMBRIE;
        LuniCalendaristice Octombrie = LuniCalendaristice.OCTOMBRIE;
        LuniCalendaristice Noiembrie = LuniCalendaristice.NOIEMBRIE;
        LuniCalendaristice Decembrie = LuniCalendaristice.DECEMBRIE;
        System.out.println(Ianuarie);
        System.out.println(Februarie);
        System.out.println(Martie);
        System.out.println(Aprilie);
        System.out.println(Mai);
        System.out.println(Iunie);
        System.out.println(Iulie);
        System.out.println(August);
        System.out.println(Septembrie);
        System.out.println(Octombrie);
        System.out.println(Noiembrie);
        System.out.println(Decembrie);
    }
}
