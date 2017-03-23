package Exercise4;

/**
 * Created by gonzaloGar on 23/03/17.
 */
public class CheckGlassesStatus {

    public static boolean glassesStatus(boolean glass1, boolean glass2) {
        return (!(glass1 ^ glass2));
    }

    public static boolean adaptStatus(String status) {
        if ("full".equals(status.toLowerCase())) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(glassesStatus(adaptStatus("full"), adaptStatus("full")));
        System.out.println(glassesStatus(adaptStatus("full"), adaptStatus("empty")));
        System.out.println(glassesStatus(adaptStatus("empty"), adaptStatus("full")));
        System.out.println(glassesStatus(adaptStatus("empty"), adaptStatus("empty")));
    }
}
