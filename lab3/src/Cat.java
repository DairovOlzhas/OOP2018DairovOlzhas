public class Cat extends Animal{
    private int count;
    private String owner;

    public Cat(){
        super();
        count = 0;
    }

    public Cat(int count, int age, String nickname, String gender){
        super(age, nickname, gender);
        this.count = count;
    }

    public void setNickname(String nickname, String owner){
        super.setNickname(nickname);
        this.owner = owner;
    }

    @Override
    public String getNickname(){
        return "Cat " + super.getNickname();
    }


}
