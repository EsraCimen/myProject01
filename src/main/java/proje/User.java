package proje;

public class User {
     /*1- filedları(encapsulated) id, username, password, active (boolean), signedIn (boolean)
    olan User isimli bir class create ediniz.
            2- bütün fieldları parametre alan bir constructor tanımlayınız.
   4- UserMain isminde main için bir class create ediniz.
            5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e atayiniz.
    active ve signedIn default olarak true, false atayabilirsiniz.
    id yi sistemde otomatik aliniz.,
            6- eğer password 6 dan küçük olursa yeniden kullanici girisi isteyin.passwordun
      6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.

      */
    private int id;
    private String userName;
    private String password;
    private boolean active=true;
    private boolean signedId;


    public User() {
    }

    public User(Integer id, String userName, String password, boolean active, boolean signedId) {
        this.id = id;
        this.userName = userName;
        this.password= password;
        this.active = active;
        this.signedId = signedId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }




    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {


        if (password.length()<6){
            System.out.println("Passsword 6 karakterden kucuk olamaz yeni password giriniz");
        }else {
        this.password = password;}
    }



    public void setSignedId(boolean signedId) {
        this.signedId = signedId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedId() {
        return signedId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedId=" + signedId +
                '}';
    }
}
