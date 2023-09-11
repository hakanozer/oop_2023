package useInterface;

public class UserImpl implements IUser, IUserAddress{

    @Override
    public boolean userStatus(int uid) {
        return false;
    }

    @Override
    public String publicProfile(int uid) {
        return null;
    }

    @Override
    public boolean changePassword(String newPassword, int uid) {
        return false;
    }

    @Override
    public boolean userAddAddress(String address, int uid) {
        return false;
    }
}
