// this class shows how you can jump around constructors usign this([signature])

public class Pokebowl {
    Pokebowl(){
        this(true, false);
        System.out.println("- edamame beans");
    }

    Pokebowl(boolean tuna){
        this();

        if(tuna == true)
        System.out.println("- tuna");
        else
        System.out.println("- salmon");
        
    }
    
    Pokebowl(boolean mayo, boolean wasabi){
        this(20);
        System.out.println("- mayo and wasabi");
    }
    
    Pokebowl(int i){
        System.out.println("- " + i + " roasted black sesames");
    }
}
