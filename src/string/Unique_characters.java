package string;

public class Unique_characters {
	public static void main(String[] args) {
		String s = "accddaf";
        char[] result = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result[k++] = s.charAt(i);
            }
        }

        System.out.println(result);
	}

}
