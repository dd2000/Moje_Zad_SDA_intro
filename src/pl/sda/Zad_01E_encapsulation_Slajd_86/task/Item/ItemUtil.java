package pl.sda.Zad_01E_encapsulation_Slajd_86.task.Item;

class ItemUtil {
    String truncate(String text, int maxLength) {
        if (text == null || text.length() < maxLength) {
            return text;
        }
        return text.substring(0, maxLength);
    }
}
