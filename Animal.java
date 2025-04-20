abstract class Animal_Abst {
    public abstract void sound();
}

class Lion extends Animal_Abst {
    public void sound() {
        System.out.println("Lion is groaring");
    }
}

class Tiger extends Animal_Abst {
    public void sound() {
        System.out.println("Tiger is roaring");
    }
}

class Abstractclass {
    public static void main(String[] args) {
	Animal_Abst obj1;
        obj1 = new Lion();
        obj1.sound();

        Animal_Abst obj2;
        obj2 = new Tiger();
        obj2.sound();
    }
}
