import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attraction=new LinkedList<>(generateClients());

        while (!attraction.isEmpty()){
            Person person=attraction.poll();
            int tickets= person.getTickets()-1;
            System.out.println(person.getName()+" " + person.getSurName() +" прокатился на аттракционе. У него осталось " + tickets + " билетов ");
            person.setTickets(tickets);
            if (tickets>0){
                attraction.add(person);
            }
        }

    }

    private static List <Person> generateClients(){
        return List.of(
                new Person("Сергей", "Пылев", 3),
                new Person("Андрей", "Васильев", 5),
                new Person("Анна", "Павлова", 2),
                new Person("Марина", "Андреева", 4)
        );
    }
}