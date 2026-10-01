package week1.day03.part06_super;

public class Tester extends Employee {
    private String testingTool;

    public Tester(int id, String name, String testingTool) {
        super(id, name);
        this.testingTool = testingTool;
    }

    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }
}

