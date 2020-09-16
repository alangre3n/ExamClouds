package Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("551155","Nokia",850);
        Phone phone2 = new Phone("663344", "Motorola", 100);
        Phone phone3 = new Phone("89827950120","Honor 20", 100);

      //System.out.println(phone1);
      //System.out.println(phone2);
      //System.out.println(phone3);

        phone1.receiveCall("Anastasiya");
        System.out.println(phone2.getNumber());
        phone1.sendMessage("55","11","55","66");

    }
}
