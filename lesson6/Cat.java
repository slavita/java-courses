/**
 * Created by Cheater-PC on 16.01.2016.
 */
public class Cat implements Pet{

    private String name;

    Cat(final String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
