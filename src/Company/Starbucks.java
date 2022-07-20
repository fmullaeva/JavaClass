package Company;

public class Starbucks extends Company{
    public Starbucks(String companyName,int beginYear){
        super.beginYear=beginYear;
        super.companyName=companyName;

    }
    @Override

    public boolean isHiring(){
        return false;
    }
    @Override
    public void service(){
        System.out.println("Starbucks is serving beverages");
    }
    @Override
    public String toString(){
        return "Company Name:"+companyName+
                "\nBegin Year:"+beginYear+
                "\nisHiring:"+isHiring();
    }
}
