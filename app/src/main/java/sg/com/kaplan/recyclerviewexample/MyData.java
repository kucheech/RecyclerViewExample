package sg.com.kaplan.recyclerviewexample;

//Custom data object
class MyData {
    private String text1;
    private String text2;
    private String text3;

    public MyData(String text1, String text2, String text3) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }
}
