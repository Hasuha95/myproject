package artems_practick;

import java.util.Arrays;

public class UserRep {
    private int size = 5;
    private int amount;
    private User[] users = new User[size];


    public void addUser(User user){

        if (amount >= size){
            User[] ozu = users;
            size = size*2;
            users = new User[size];

            for (int i = 0; i < amount; i++) {
                users[i] = ozu[i];
            }
        }



        users[amount++] = user;

    }

    public User getUser(String name){
        for (int i = 0; i < users.length; i++) {
            if (users[i]!= null & users[i].getName() == name){
                return users[i];
            }
        }
        return null;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "UserRep{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}

