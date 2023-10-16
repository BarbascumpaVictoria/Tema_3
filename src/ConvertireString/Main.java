package ConvertireString.src;

import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {

        String a = "tRue";
        Boolean b = new Boolean (a);
        boolean c = b.booleanValue();
        System.out.println(c);

        String d = "120";
        Byte e = new Byte(d);
        byte f = e.byteValue();
        System.out.println(f);

        String g = "32000";
        short x = Short.parseShort(g);
        System.out.println(x);

        String j = "147895632";
        Integer k = new Integer(j);
        int l = k.intValue();
        System.out.println(l);

        String m = "987654321987654321";
        Long n = new Long (m);
        long o = n.longValue();
        System.out.println(o);

        String p = "4444.5d";
        Double q = new Double(p);
        double r = q.doubleValue();
        System.out.println(r);

        String s = "2354.56f";
        Float t = new Float(s);
        float u = t.floatValue();
        System.out.println(u);
    }
}
