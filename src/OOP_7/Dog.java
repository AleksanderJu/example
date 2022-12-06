package OOP_7;

//Создайте класс наследник Dog от класса Pet.
//В классе Dog создайте метод sayBark, который выводит на экран “Гав-гав”.

public class Dog extends Pet{

    public Dog(String color) {
        super(color);
    }
        public void sayBark(){
            System.out.println ("Гав-гав");
        }

    }




