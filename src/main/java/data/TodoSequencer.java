package data;

public class TodoSequencer {
    private static int personId;

    public static int nextPersonId2() {

        return ++personId;
    }

    public static int reset2() {
        personId = 0;
        return personId;
    }
}
