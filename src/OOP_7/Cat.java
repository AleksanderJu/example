package OOP_7;

 //Создайте класс наследник Cat от класса Pet.
 //В классе Cat создайте метод sayMeow, который выводит на экран “Мяу-мяу”.

public class Cat extends Pet{

    public Cat(String color) {
        super(color);
    }
        public void sayMeow() {
            System.out.println ("Мяу-мяу");
    }
}
