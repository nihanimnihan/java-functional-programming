package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPCustomClass {

    static class Course {

        private String name;
        private String category;
        private int reviewScore;
        private int noOfStudents;

        public Course(String name, String category, int reviewScore, int noOfStudents) {
            this.name = name;
            this.category = category;
            this.reviewScore = reviewScore;
            this.noOfStudents = noOfStudents;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getReviewScore() {
            return reviewScore;
        }

        public void setReviewScore(int reviewScore) {
            this.reviewScore = reviewScore;
        }

        public int getNoOfStudents() {
            return noOfStudents;
        }

        public void setNoOfStudents(int noOfStudents) {
            this.noOfStudents = noOfStudents;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "name='" + name + '\'' +
                    ", category='" + category + '\'' +
                    ", reviewScore=" + reviewScore +
                    ", noOfStudents=" + noOfStudents +
                    '}';
        }
    }

    public static void main(String[] args) {

        List<Course> list = List.of(
                new Course("String", "Framework", 98, 100000),
                new Course("Java", "Programming Language", 95, 50000),
                new Course("AWS", "Cloud", 90, 58000),
                new Course("Azure", "Cloud", 80, 65000),
                new Course("Kubernetes", "Cloud", 95, 72000)
        );

        //allMatch, noneMatch, anyMatch

        System.out.println(list.stream().anyMatch(course -> course.getReviewScore() > 90));

        Predicate<Course> predicateReviewScoreGraterThen90 = course -> course.getReviewScore() > 90;
        System.out.println(list.stream().anyMatch(predicateReviewScoreGraterThen90));

        Comparator<Course> comparatorNoOfStudent = Comparator.comparing(Course::getNoOfStudents);
        System.out.println(list.stream().sorted(comparatorNoOfStudent).collect(Collectors.toList()));

        //Limit, Skip, TakeWhile, DropWhile
        System.out.println("Limit, Skip, TakeWhile, DropWhile");
        System.out.println(list.stream().sorted(comparatorNoOfStudent).limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().sorted(comparatorNoOfStudent).skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().takeWhile(predicateReviewScoreGraterThen90).collect(Collectors.toList()));
        System.out.println(list.stream().dropWhile(predicateReviewScoreGraterThen90).collect(Collectors.toList()));

        //min max findFirst findAny

        System.out.println("min, max, findFirst, findAny");
        Comparator<Course> comparingByNoOfStudentAndNoOfReview = Comparator.comparing(Course::getNoOfStudents)
                .thenComparing(Course::getReviewScore).reversed();
        System.out.println(list.stream().min(comparingByNoOfStudentAndNoOfReview));
        System.out.println(list.stream().max(comparingByNoOfStudentAndNoOfReview));

        list.stream().filter(course -> course.getNoOfStudents() < 40000).forEach(System.out::println);
        System.out.println(list.stream().filter(course -> course.getNoOfStudents() < 40000)
                .min(comparingByNoOfStudentAndNoOfReview).orElse(new Course("JavaScript", "Language", 79, 35000)));

        System.out.println("groupingBy");
        System.out.println(list.stream().collect(Collectors.groupingBy(Course::getCategory)));
        System.out.println(list.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
        System.out.println(list.stream().collect(Collectors.groupingBy(Course::getCategory,
                Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
        System.out.println(list.stream().collect(Collectors.groupingBy(Course::getCategory,
                Collectors.mapping(Course::getName, Collectors.toList()))));
    }
}
