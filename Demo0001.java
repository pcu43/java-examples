import java.util.*;

class Dog {
  String name;
  int weight;
  public Dog(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }
  public String getName() { return name; }
  public int getWeight() { return weight; }
  public String toString() {
    return String.format("{ \"name\": \"%s\", \"weight\": %d }", name, weight);
  }
}

public class Demo0001 {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<>();
    lines.add("dog");
    lines.add("cat");
    lines.add("rat");
    lines.add("pig");
    Collections.sort(lines);
    System.out.println(lines);

    List<Dog> dogs = new ArrayList<>();
    dogs.add(new Dog("spike", 20));
    dogs.add(new Dog("fluffy", 15));
    dogs.add(new Dog("spot", 10));
    dogs.add(new Dog("comet", 30));
    dogs.add(new Dog("biscuit", 15));
    Collections.sort(dogs, Comparator.comparing(Dog::getWeight).thenComparing(Dog::getName));
    System.out.println(dogs);
  }
}
