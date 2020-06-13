import java.util.ArrayList;

class User {
    String username;
    String password;
    String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

public class Main {
    public static boolean  function (User user, ArrayList<User> allUsers) {
        boolean flag =false;
         for (int counter = 0; counter < allUsers.size(); counter++) { 		      
              if (user.getUsername() == allUsers.get(counter).getUsername() && user.getPassword() == allUsers.get(counter).getPassword() && user.getEmail() == allUsers.get(counter).getEmail()){
                   	flag = true;
              }
          }
          if (flag) {

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
            if (user!=null) {
           if (user.getUsername()!=null && user.getPassword()!=null) {
              String password = user.getPassword();
             String passwordLower = password.toLowerCase();
            if (!passwordLower.contains(user.getUsername().toLowerCase()) && password.length()>=8) {
                 boolean digit = false, upper = false, special = false;
                  for (int i=0;i<password.length();i++) {
                     if (Character.isDigit(password.charAt(i)))
                         digit = true;
                     if (Character.isUpperCase(password.charAt(i)))
                         upper = true;
                       if (specialCharacters.contains(String.valueOf(password.charAt(i))))
                         special = true;
                    }
                 if (digit && upper && special)
                      return true;
                }
            
        }
    }
        return false;
          } else {
              return false;
          }
         

    }
     public static void main(String[] args) {  
        User user1 = new User ("Nikola", "123","nikola@");
        User user2 = new User ("Stefan", "Password123!","stef@gmail.com");
        User user3 = new User ("Marche", "aaaaaaaaaaa","mr_marche@hotmail.com");
        ArrayList <User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(function(user2 , users));  
            

    }  
}