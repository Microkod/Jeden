package Java_PP.Zadanie19Autor;

public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }
    public Author getCreator (){
        return creator;
    }
    public int getStropheNumbers(){
        return stropheNumbers;
    }
    public void setCreator(Author creator){
        this.creator = creator;
    }
    public void setStropheNumbers(int stropheNumbers){
        this.stropheNumbers = stropheNumbers;
    }
    //gituwa
}
