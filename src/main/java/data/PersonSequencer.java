package data;

public class PersonSequencer {
    private static int personId;

    public static int nextPersonId(int personId){
         int next = 0;
         next = next +  personId + 1;
        return next;
    }
    public static int reset(){
        personId = 0;
      return personId;
    }


}

