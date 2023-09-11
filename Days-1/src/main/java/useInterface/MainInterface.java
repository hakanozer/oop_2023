package useInterface;

public class MainInterface {

    public static void main(String[] args) {

        UserImpl us1 = new UserImpl();
        IUser us2 = new UserImpl();
        IUserAddress us3 = new UserImpl();

        IUser iUser = new IUser() {
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
        };
        iUser.userStatus(100);

    }

}
