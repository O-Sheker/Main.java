/*class Main {
    public static void main(String[] args)
    {
        // storing input in variable
        int n = 17;
       
        // create string array called names
        String names[]
            = { "Melike", "Ayshe", "Turana", "Betul", "Ceylan", "Mehmet", "Rahul", "Ajay", "Gourav", "Riya", "Shebnem", "Weli", "Emir", "Emine", "Omer", "Kerem", "Levent" };
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                // to compare one string with other strings
                if (names[j].compareTo(names[i]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
       
        // print output array
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}*/

class Main {
    public static void main(String[] args)
    {
        // storing input in variable
        int n = 17;
       
        // create string array called names
        String names[]
            = { "Melike", "Ayshe", "Turana", "Betul", "Ceylan", "Mehmet", "Rahul", "Ajay", "Gourav", "Riya", "Shebnem", "Weli", "Emir", "Emine", "Omer", "Kerem", "Levent" };
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
       // print output array
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}