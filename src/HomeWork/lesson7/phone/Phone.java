package HomeWork.lesson7.phone;

public class Phone {

    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {return weight;}

    public void receiverCall(String name) {
        System.out.print("Звонит " + name + number);
    }

    public void receiverCall(String name, int number) {
        System.out.println(name + number);
    }


}
