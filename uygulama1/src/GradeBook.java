public class GradeBook {
    //Sınıftaki öğrencilerin notları hakkında bilgi veren bir uygulama
    private int[] grades;
    private String courseName;

    //Constructer method sınıfınızla aynı isme sahip olur.
    //Normal metotlar bir şey döndürür, vid,int vb. ama constucter herhangibir şey döndürmez.
    //Sınıf oluşturduğumuz zaman ilk çalışacak fonksiyon bu metottur.
    //constructer metotunun diğer metotlardan fakları bunlar.
    GradeBook(String name, int[] gradesArray) {
        courseName = name;
        grades = gradesArray;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void displayMessage() {
        System.out.println("Welcome to the gradefor: " + getCourseName());
    }

    public void outputGrades() {
        System.out.println("The grades are : ");
        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Student %d : %d%n", (i + 1), grades[i]);

        }
    }

    public double getAverage() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length;

    }

    public int getMinimum() {
        int lowGrade = grades[0];
        for (int grade : grades) {
            if (grade < lowGrade) {
                lowGrade = grade;
            }

        }
        return lowGrade;

    }

    public int getMaximum() {
        int highGrade = grades[0];
        for (int grade : grades) {
            if (grade > highGrade) {
                highGrade = grade;
            }
        }
        return highGrade;

    }

    public void outputBarChart() {

        int[] frequency = new int[11];
        for (int grade : grades) {
            ++frequency[grade / 10];
        }
        for (int i = 0; i < frequency.length; i++) {

            if (i == 10) {
                System.out.printf("%d", i * 10);
            } else {
                System.out.printf("%02d - %02d", i * 10, (i * 10 + 9));
            }
            for (int star = 0; star < frequency[i]; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void processGrades() {
        outputGrades();
        System.out.printf("Class average is %.2f%n ", getAverage());
        System.out.printf("Lowest grade is %d Highest grade is %d%n", getMinimum(), getMaximum());
        outputBarChart();
    }
}
