package HomeWork.lesson7.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(339037173, "IphoneX", 140);
        Phone phone1 = new Phone(257380635, "Xiaomi", 170);
        Phone phone2 = new Phone(447602104, "samsung", 150);
        Phone phone3 = new Phone();
        System.out.println(phone.getNumber() + " " + phone.getModel() + " " + phone.getWeight());
        System.out.println(phone.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println();
        phone.receiverCall("Alex ");
        System.out.println();
        phone1.receiverCall("Misha ");
        System.out.println();
        phone2.receiverCall("Georg ");
        System.out.println();
        phone.receiverCall("Leo ", 336790988);
        System.out.println();
        sendMessage(339037173, 338899001, 448876939);
    }

    static void sendMessage(int... number) {
        for (int num : number) {
            System.out.println(num);
        }
    }
}

