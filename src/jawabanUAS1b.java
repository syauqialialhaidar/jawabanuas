import java.util.ArrayList;
import java.util.Scanner;

public class jawabanUAS1b {

    public class UAS1B {
        private String Id;
        private String UserName;
        private String FullName;
        private int Posted;

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getUserName() {
            return UserName;
        }

        public void setUserName(String userName) {
            UserName = userName;
        }

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String fullName) {
            FullName = fullName;
        }

        public int getPosted() {
            return Posted;
        }

        public void setPosted(int posted) {
            Posted = posted;
        }

        public UAS1B(){
        }

        public static void main(String[] args) {
            int jumPost = 4;
            Scanner sc = new Scanner(System.in);
            UAS1B user1 =  new UAS1B();
            user1.setId("001");
            user1.setUserName("dbgb4a");
            user1.setFullName("Debby Gibson");
            ArrayList<String> myPost =  new ArrayList<>();
            for(int index=0; index<jumPost;index++){
                myPost.add(sc.nextLine());
            }
            user1.setPosted(myPost);
            System.out.println("Total Posted : " + user1.ShowNumberOfPost());

        }
    }

}
