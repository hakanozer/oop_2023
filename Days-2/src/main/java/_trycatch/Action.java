package _trycatch;

public class Action {

    public boolean userControl( String uid ) throws Exception {
        int userID = Integer.parseInt(uid);
        if ( userID == 100 ) {
            return true;
        }
        return false;
    }


}
