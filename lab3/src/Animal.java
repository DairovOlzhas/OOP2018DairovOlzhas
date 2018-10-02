public class Animal {
    private String nickname;
    private int age;
    private String gender;

    public Animal(){
        nickname = "none";
        age = 0;
        gender = "none";
    }

    public Animal(int age, String nickname, String gender){
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public String getNickname(){
        return nickname;
    }





}
