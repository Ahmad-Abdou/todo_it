package data;

public class TodoSequencer {
    private static int personId;

    public static int nextPersonId2(int personId){
        int next = 0;
        next = next +  personId + 1;
        return next;
    }
    public static int reset2(){
        personId = 0;
        return personId;
    }
}
