//Polymorphism(tính đa hình): khả năng của 1 đối tượng thể hiện các hành vi khác nhau tùy thuộc vào bối cảnh

    //lớp cha
    class Animal{
        //phương thức thể hiện hành động kêu của động vật
        public void animalSound() {
            System.out.println("The animal makes a sound!");
        }
        //phương thức thể hiện hành động ăn của động vật
        public void animalEat(){
            System.out.println("Eating!");
        }
    }

    //lớp con
    class Cat extends Animal{
    //ghi đè lên phương thức animalSound() để thể hiện tiếng kêu của mèo
    public void animalSound() {
        System.out.println("Meow meow!");
    }
    }

    //lớp con
    class Dog extends Animal{
        //ghi đè lên phương thức animalSound() để thể hiện tiếng kêu của chó
    public void animalSound() {
        System.out.println("Woof woof!");
    }
    public void Runnig(){
        System.out.println("The dog is running!");
    }
    }


    class Polymorphism{
     public static void main(String[] args){
         //tạp object animal kiểu Animal
        Animal myAnimal = new Animal();
        //tạo object myCat mang kiểu Cat nhưng được tham chiếu qua lớp Animal (Upcasting)
        //khi đó, có thể gọi các phương thức được định nghĩa trong Animal dù đối tượng thực tế là Cat
        Animal myCat = new Cat();
         //tạo object myDog mang kiểu Dog nhưng được tham chiếu qua lớp Animal
        Animal myDog = new Dog();

        // gọi phương thức animalSound() trên đối tượng myAnimal (lớp Animal)
        myAnimal.animalSound();
         // gọi phương thức animalSound() trên đối tượng myDog (lớp dog)
        myDog.animalSound();
         // gọi phương thức animalSound() trên đối tượng myCat (lớp Cat)
        myCat.animalSound();
         //gọi phương thức animalEat() trên đối tượng myCat (lớp Animal)
         myCat.animalEat();
     }
}
/*
-Downcasting: chuyển 1 đối tượng là một thể hiện của lớp cha xuống thành đối tượng là thể hiện của lớp con trong quan hệ kế thừa.
-Cú pháp: Dog newDog = (Dog) myDog;
-Ép kiểu biến myDog từ kiểu Animal về kiểu Dog. Sau khi ép kiểu, biến newDog có kiểu Dog và có thể truy cập
    tất cả phương thức của Dog (animalSound() và Running()) */