package useInterface;

public interface IUser {

    // Interaface içerisinde gövdeli method yaamazsınız.
    boolean userStatus(int uid);
    String publicProfile(int uid);
    boolean changePassword(String newPassword, int uid);
}
