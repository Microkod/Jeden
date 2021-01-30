package Java_PP.Zadanie19Autor;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality){
        this.nationality = nationality;
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }

}
