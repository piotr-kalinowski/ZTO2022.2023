import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector dbc = new DatabaseConnector();
        dbc.connect();
        dbc.executeInsert("insert into person values  " +
                "('twojstary','ts@twojstara.pl','1234',true,2)");
    }
}