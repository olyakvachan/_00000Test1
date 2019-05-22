import org.testng.annotations.Test;

import java.util.Arrays;

public class Day3 {

    @Test
    public void test001() {

        for (int i = 1; i <= 30; i++){
            if (i%2==1) printValue(i);
        }
    }

    public void printValue(int valueToPrint ){
        System.out.println(valueToPrint);

    }

    @Test
    public void printHelloAtEvenNumbres() {
        for (int i = 1; i <= 20; i++) {
            if (i%2==1) System.out.println("hello world");
        }
    }

    @Test
    public void swapTwoNumbersInArray() {
        int[] array = {1,2,3,4};
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }


    private void swap(int[] array, int indexL, int indexR) {
        int temp = array[indexL];
        array[indexL] = array[indexR];
        array[indexR] = temp;
    }

    @Test
    public void testCountLetters() {
        String input = "hello world";
        int result = 0;
        for(char eachChar : input.toCharArray()){
            if(eachChar== 'l') result++;
        }
        System.out.println(result);
    }


    @Test
    public void testClasses() {
        MyClass myClassObject = new MyClass();
        MyClass myClassObject1 = new MyClass("Value from test");

    }

    @Test
    public void testInterfaceCat() {
        Cat myCat1 = new Cat();

        myCat1.eat();
        myCat1.jump();
    }

    @Test
    public void testInherClass() {
        AutomationTester automationTester = new
                AutomationTester();

        Employee employee = new Employee();

        System.out.println(automationTester.name);
        System.out.println(employee.name);

        automationTester.work();

        automationTester.work("automating and working");
    }

    @Test
    public void test005() {
        MyClass myClass = new MyClass();

        String valueReturnedFromMyClass = myClass.print("value from text");

        System.out.println(valueReturnedFromMyClass);
    }

    @Test
    public void testReverseString() {
        String inputString = "MyValueForTheTest";

        String reverse = "";


        for(int i = inputString.length() - 1; i >= 0; i--)
        {
            reverse = reverse + inputString.charAt(i);
        }

        System.out.println(reverse);
    }
}
