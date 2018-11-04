import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class human {

        private String name, surname, eyes;
        private int age, growth;

        public void setName(String name){
                this.name=name;
        }

        public String getName(){
                return name;
        }

        public void setSurname(String surname){
                this.surname=surname;
        }

        public String getSurname(){
                return surname;
        }

        public void setEyes(String eyes){
                this.eyes=eyes;
        }

        public String getEyes(){
                return eyes;
        }

        public void setAge(int age){
                this.age=age;
        }

        public int getAge(){
                return age;
        }

        public void   setGrowth(int growth){
                this.growth=growth;
        }

        public int getGrowth(){
                return growth;
        }

        public static class Main {

            public static Scanner sc=new Scanner(System.in);
            public static void main(String[] args) {

              human human=new human();

                System.out.print("IMIE: ");
                human.setName(sc.nextLine());

                System.out.print("NAZWISKO: ");
                human.setSurname(sc.nextLine());

                System.out.print("KOLOR OCZU: ");
                human.setEyes(sc.nextLine());

                System.out.print("WIEK: ");
                human.setAge(sc.nextInt());

                System.out.print("PODAJ SWÓJ WZROST W CM: ");
                human.setGrowth(sc.nextInt());

                System.out.println("Nazywasz się "+human.getName()+" "+ human.getSurname()+ " masz lat " + human.getAge() + " i " + human.getGrowth() + " cm wzrostu " + " ,kolor oczu  " + human.getEyes());

                    Queue<String>kolejka= new ArrayDeque<String>();
                    kolejka.add(human.getName()+" "+human.getSurname());
                    ArrayDeque<String> kaleena= new ArrayDeque<>();
                    kaleena.add(human.getGrowth()+ "cm wzrostu " + human.getAge() + " lat");
                    Queue<String>kuroo= new ArrayDeque<String>();
                    kuroo.add(human.getEyes());
                    System.out.println("1. "+((ArrayDeque<String>) kolejka).peekFirst());
                    System.out.println("2. "+ kaleena.peekLast());
                    System.out.println("3. "+ ((ArrayDeque<String>) kuroo).peekFirst() + " kolor oczu" );
            }
        }
}

