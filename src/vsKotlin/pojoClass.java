package vsKotlin;

public class pojoClass {
    String textData;
    int numberData;

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public int getNumberData() {
        return numberData;
    }

    public void setNumberData(int numberData) {
        this.numberData = numberData;
    }

    @Override
    public String toString() {
        return "pojoClass{" +
                "textData='" + textData + '\'' +
                ", numberData=" + numberData +
                '}';
    }
}
