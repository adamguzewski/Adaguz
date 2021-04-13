package pl.pjatk.adaguz;

public class MySimplePojo {
    private String someStringValue;

    public MySimplePojo(String someStringValue) {
        this.someStringValue = someStringValue;
//        System.out.println("I'm here");
    }

    public String getSomeStringValue() {
        return someStringValue;
    }

    public void printOutMe(){
        System.out.println("Value from MySimplePOJO is: " + someStringValue);
    }
}
