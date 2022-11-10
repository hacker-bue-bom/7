package pt.uma;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //---------------------------------------
        System.out.println("imprimir o enum: ");
        for (Menu option: Menu.values()) {
            switch(option.name()) {
                case "START":
                    System.out.println("Vamos lá");
                    break;
                case "SAVEGAME":
                    System.out.println("game saved");
                    break;
                case "LOADGAME":
                    System.out.println("loaded state");
                    break;
                case "HIGHSCORE":
                    System.out.println("Leaderboard");
                    break;
                case "QUIT":
                    System.out.println("LET ME OUT OF HERE!");
                    break;
                default:
                    System.out.println("someting wong");
                    break;
            }

        }
        System.out.println("//---------------------------------------");
        //---------------------------------------

        Rational rat1 = new Rational(1,2);
        Rational rat2 = new Rational(4,2);

        System.out.println(rat1.equals(rat2));

        System.out.println("//---------------------------------------");
        //---------------------------------------
        Rational rat3 = new Rational(5,3);
        Rational rat4 = new Rational(6,2);

        List<Rational> rationals = new ArrayList<Rational>();
        rationals.add(rat1);
        rationals.add(rat2);
        rationals.add(rat3);
        rationals.add(rat4);

        //ordenar o array:
        Collections.sort(rationals);

        for (Rational banana: rationals) {
            System.out.println(banana);
        }

        Collections.sort(rationals);

        System.out.println("//---------------------------------------");
        //---------------------------------------

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Ana"));
        students.add(new Student(5, "Tiago"));
        students.add(new Student(3, "Joao"));
        students.add(new Student(8, "Mariana"));

        Collections.sort(students);

        for (Student student: students) {
            System.out.println(student.toString());
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("sorted using comparator by number");

        Collections.sort(students, new StudentComparatorByNumber());
        for (Student student: students) {
            System.out.println(student.toString());
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("sorted using comparator by name");

        Collections.sort(students, new StudentComparatorByName());
        for (Student student: students) {
            System.out.println(student.toString());
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("making a map and printing its keys AND values");

        Map<Integer, Student> mappedStudents = new HashMap<>();

        mappedStudents.put(1, new Student(20, "Nick"));
        mappedStudents.put(2, new Student(15, "Joao"));
        mappedStudents.put(3, new Student(13, "Joana"));
        mappedStudents.put(4, new Student(9, "maria"));
        mappedStudents.put(5, new Student(14, "carlos"));

        for(Integer key: mappedStudents.keySet()) {
            System.out.println(key + ": " + mappedStudents.get(key));
        }


        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("trying to find a specific value in the map");

        String nameToSearch = "maria";
        for (Student student : mappedStudents.values()) {
            if (student.getName().equals(nameToSearch)){
                System.out.println(nameToSearch + " found");
            }
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("mapped courses and printing all keys and values");

        Map<Integer, Course> mappedCourses = new HashMap<>();

        Course c1 = new Course( 2,"AD",6,2021);
        Course c2 = new Course( 1,"SOR",7,2013);
        Course c3 = new Course( 5,"IP",4,2012);
        Course c4 = new Course( 4,"R",2,2021);



        mappedCourses.put(1, c1);
        mappedCourses.put(2, c2);
        mappedCourses.put(3, c3);
        mappedCourses.put(4, c4);

        for(Integer key: mappedCourses.keySet()) {
            System.out.println(key + ": " + mappedCourses.get(key));
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("creating a new course and checking if one of the courses in the previous map is equals to the new course");

        Course c5 = new Course( 1,"SOR",7,2013);

        int nick = 0; //just a checker variable
        for(Integer key: mappedCourses.keySet()) { //checks if it exists in the library
            if(mappedCourses.get(key).equals(c5)) {
                nick = 1;
            }
        }
        if (nick == 1) { //the print conditions
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("using the years as the keys instead");

        Map<Integer, ArrayList> mappedCoursesByYear = new HashMap<>();

        for(Integer key: mappedCourses.keySet()) {
            if(mappedCoursesByYear.containsKey(mappedCourses.get(key).getAno()) == false) {
                //cria a lista para a chave
                ArrayList<Course> emptyList = new ArrayList<>();
                emptyList.add(mappedCourses.get(key));
                mappedCoursesByYear.put(mappedCourses.get(key).getAno(), emptyList);
            }
            else {
                // edita a lista para a chave
                ArrayList courseList = mappedCoursesByYear.get(mappedCourses.get(key).getAno());
                courseList.add(mappedCourses.get(key));
                mappedCoursesByYear.put(mappedCourses.get(key).getAno(), courseList);
            }
        }


        for(Integer key: mappedCoursesByYear.keySet()) {
            System.out.println(key + ": " + mappedCoursesByYear.get(key));
        }

        System.out.println("//---------------------------------------");
        //---------------------------------------
        System.out.println("same code, but using values() instead");

        Map<Integer, ArrayList> mappedCoursesByYear2 = new HashMap<>();

        for(Course key: mappedCourses.values()) {
            if(mappedCoursesByYear2.containsKey(key.getAno()) == false) {
                //cria a lista para a chave
                ArrayList<Course> emptyList = new ArrayList<>();
                emptyList.add(key);
                mappedCoursesByYear2.put(key.getAno(), emptyList);
            }
            else {
                // edita a lista para a chave
                ArrayList courseList = mappedCoursesByYear2.get(key.getAno());
                courseList.add(key);
                mappedCoursesByYear2.put(key.getAno(), courseList);
            }
        }


        for(Integer key: mappedCoursesByYear2.keySet()) {
            System.out.println(key + ": " + mappedCoursesByYear2.get(key));
        }
    }}