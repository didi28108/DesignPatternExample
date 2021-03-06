public class StringDisplay extends Display {
    private String string;                          // 列印的字串
    public StringDisplay(String string) {           // 以引數指定列印的字串
        this.string = string;
    }
    public int getColumns() {                       // 字數
        return string.getBytes().length;
    }
    public int getRows() {                          // 行數為1
        return 1;
    }
    public String getRowText(int row) {             // 僅在row為0時才傳回
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
