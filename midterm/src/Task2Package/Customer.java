package Task2Package;

public class Customer {

    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isMember(){
        return member;
    }

    public void setMember(boolean member){
        this.member = member;
    }

    public String getMemberType(){
        return memberType;
    }

    void setMemberType(String memberType){
        setMember(true);
        if(memberType == "Premium" || memberType == "1" || memberType == "P")
            this.memberType = "P";
        if(memberType == "Gold" || memberType == "2" || memberType == "G")
            this.memberType = "G";
        if(memberType == "Silver" || memberType == "3" || memberType == "S")
            this.memberType = "S";
    }

    @Override
    public String toString(){
        if(member)
            return "Customer " + name + " has memberType: " + memberType;
        return "Customer " + name + "no membership";
    }


}
