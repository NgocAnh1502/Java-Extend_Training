package week1.day03.part05_inheritance;

public class Tester extends Employee{
    private String testingTool;

    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing with " + testingTool);
    }
}
