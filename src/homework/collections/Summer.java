package homework.collections;

import java.util.*;

public class Summer {

    public List<User> getCommonItemsList(List<User> userList1, List<User> userList2) {
        List<User> result = new ArrayList<>();
        for (User user1 : userList1) {
            for (User user2 : userList2) {
                if (user1.equals(user2)) {
                    result.add(user2);
                    break;
                }
            }
        }
        return result;
    }
    public Set<User> getCommonItemsSet(Set<User> userList1, Set<User> userList2) {
        Set<User> result = new HashSet<>();
        for (User user1 : userList1) {
            for (User user2 : userList2) {
                if (user1.equals(user2)) {
                    result.add(user2);
                    break;
                }
            }
        }
        return result;
    }


    public  static void main(String[] args) {
        System.out.println("task3");
        ArrayList<User> task3=new ArrayList<>();
        task3.add(new User(25,"Petrov"));
        task3.add(new User(25,"Petrov"));
        task3.add(new User(25,"Petrov"));
        for (User user:task3){
            System.out.println(task3.indexOf(user)+":"+user);
        }
        System.out.println("task4");
        HashSet<User> task4=new HashSet<>();
        task4.add(new User (25,"Petrov"));
        task4.add(new User (25,"Petrov"));
        task4.add(new User (25,"Petrov"));
        Iterator <User> task4Iterator=task4.iterator();
        while (task4Iterator.hasNext()){
            System.out.println(task4Iterator.next());
        }
        System.out.println("task5.a");
        HashMap<String,User> task5=new HashMap<>();
        task5.put("1",new User (25,"Petrov"));
        task5.put("2",new User (25,"Petrov"));
        task5.put("3",new User (25,"Petrov"));

        Iterator <User> task5Iterator= task5.values().iterator();
        while (task5Iterator.hasNext()){
            System.out.println(task5Iterator.next());
        }

        System.out.println("task5.b");
        Iterator <String> task5bIterator= task5.keySet().iterator();
        while (task5bIterator.hasNext()){
            String key=task5bIterator.next();
            System.out.println(key+":"+task5.get(key));
        }

        System.out.println("task5.c");

        Iterator <Map.Entry<String,User>> task5cIterator= task5.entrySet().iterator();
        while (task5cIterator.hasNext()){
            Map.Entry<String,User> entry=task5cIterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
