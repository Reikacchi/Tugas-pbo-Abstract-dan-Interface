public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4); // Dogs have 4 legs
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Bermain Bola");
    }

    @Override
    public void eat() {
        System.out.println("makan daging");
    }

    @Override
    public void walk() {
        System.out.println("jalan bersama Mesak");
    }
}
