package library_management;

import java.util.ArrayList;


   public class User {
        /*
            user details:
                name
                user id
                age
         */
        private String name;
        private String user_id;
        private Integer age;
        private String address;
        public ArrayList<Book> hasBooks = new ArrayList<>();

        private static Integer generated_id = 1;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String getUser_id() {
           return user_id;
       }

       public void setUser_id(String user_id) {
           this.user_id = user_id;
       }

       public Integer getAge() {
           return age;
       }

       public void setAge(Integer age) {
           this.age = age;
       }

       public String getAddress() {
           return address;
       }

       public void setAddress(String address) {
           this.address = address;
       }

       private void assign_Id (){
           this.user_id = "U" +generated_id;
           generated_id++;
       }

       public User(String name, Integer age, String address) {
           this.name = name;
           this.age = age;
           this.address = address;
           assign_Id();
       }

       @Override
       public String toString() {
           return "user{" +
                   "name='" + name + '\'' +
                   ", user_id=" + user_id +
                   ", age=" + age +
                   ", address='" + address + '\'' +
                   '}';
       }
   }
