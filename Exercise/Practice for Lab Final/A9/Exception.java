package A9;

public class Exception {
    
    public String getPosition(String s, int index) {
        try {
            char ch = s.charAt(index);
            return "Character at index " + index + " is: " + ch;
        } catch (StringIndexOutOfBoundsException e) {
            return "Invalid index";
        }
    }

}